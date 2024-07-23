import java.util.List;
import java.util.ArrayList;

public class SolutionBoard2DImpl extends AbstractBoard {

  private int[][] board;
  
  public SolutionBoard2DImpl() {
    board = new int[4][4];
  }

  @Override
  public void setBoard(int[][] board) {
    this.board = board;
  }

  @Override
  public void spawnNewDigit(int digit) {
    List<Coordinate> emptySpaces = new ArrayList<Coordinate>();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (board[i][j] == 0) {
          emptySpaces.add(new Coordinate(i, j));
        }
      }
    }
    if (emptySpaces.size() == 0) {
      return;
    }
    int randomIndex = (int) (Math.random() * emptySpaces.size());
    Coordinate c = emptySpaces.get(randomIndex);
    board[c.x][c.y] = digit;
  }

  // search for an digit in the board
  private boolean search(int digit) {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (board[i][j] == digit) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean userCanMakeAMove() {
    // check 3x3 board
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        // if two adjacent locations have equal value, return true
        if (board[i][j] == board[i][j + 1] ||
            board[i][j] == board[i + 1][j]) {
          return true;
        }
      }
    }
    // check if two equal adjacent values in the last row
    for (int j = 0; j < 3; j++) {
      if (board[3][j] == board[3][j + 1]) {
        return true;
      }
    }

    // check if two equal adjacent values in the last column
    for (int i = 0; i < 3; i++) {
      if (board[i][3] == board[i + 1][3]) {
        return true;
      }
    }

    // finally, return false
    return false;
  }

  @Override
  public GameState getGameState() {
    if (search(2048)) {
      return GameState.GAME_WON;
    }
    if (search(0)) {
      return GameState.GAME_IN_PROGRESS;
    }
    if (!userCanMakeAMove()) {
      return GameState.GAME_OVER;
    }
    return GameState.GAME_IN_PROGRESS;
  }

  // This can be implemented with nested loop too (more straight forward)
  // for every zero found, find the nearest non-zero value to the right and swap
  private void slideLeft(int row[]) {
    int leftMostZeroIndex = -1;
    for (int i = 0; i < 4; i++) {
      // initialize it once
      if (row[i] == 0 && leftMostZeroIndex == -1) {
        leftMostZeroIndex = i;
      }
      if (leftMostZeroIndex >= 0) {
        // slide to position of the empty space
        if (row[i] != 0 && leftMostZeroIndex < i) {
          row[leftMostZeroIndex] = row[i];
          row[i] = 0;
          leftMostZeroIndex++;
        }
      }
    }
  }

  // Merge two adjacent cells
  private void mergeAdjacent(int row[]) {
    for (int i = 0; i < 3; i++) {
      if (row[i] == row[i + 1]) {
        row[i] *= 2;
        score += row[i];
        row[i + 1] = 0;
      }
    }
  }
  
  // process left move for a given row
  private void processLeftMoveForRow(int row[]) {
    // slide left, merge, and slide left
    slideLeft(row);
    mergeAdjacent(row);
    slideLeft(row);
  }

  @Override
  public void processLeftMove() {
    for (int i = 0; i < 4; i++) {
      processLeftMoveForRow(board[i]);
    }
  }

  // return a new reversed array
  public int[] reverseArray(int arr[]) {
    int[] reverseArr = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      reverseArr[i] = arr[arr.length - i - 1];
    }
    return reverseArr;
  }

  // Processing the right is symmetrical to the left
  @Override
  public void processRightMove() {
    for (int i = 0; i < 4; i++) {
      int[] row = reverseArray(board[i]);
      processLeftMoveForRow(row);
      board[i] = reverseArray(row);
    }
  }

  @Override
  public void processUpMove() {
    for (int j = 0; j < 4; j++) {
      // create a row from column values
      int row[] = new int[4];
      for (int i = 0; i < 4; i++) {
        row[i] = board[i][j];
      }

      // process left move on this row
      processLeftMoveForRow(row);

      // copy the values back into the column
      for (int i = 0; i < 4; i++) {
        board[i][j] = row[i];
      }
    }
  }

  // Similar to up move but in reverse
  @Override
  public void processDownMove() {
    for (int j = 0; j < 4; j++) {
      // create a row from column values
      int row[] = new int[4];
      for (int i = 0; i < 4; i++) {
        row[i] = board[i][j];
      }

      row = reverseArray(row);
      processLeftMoveForRow(row);
      row = reverseArray(row);

      // copy the values back into the column
      for (int i = 0; i < 4; i++) {
        board[i][j] = row[i];
      }
    }
  }

  @Override
  public int[][] getBoard() {
    return board;
  }
}