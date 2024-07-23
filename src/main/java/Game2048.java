import java.io.*;
import java.util.Arrays;

public class Game2048 {
  private AbstractBoard board;
  private BoardView boardView;

  public Game2048(AbstractBoard board) {
    this.board = board;
    this.boardView = new BoardView(board);
  }

  public void play(boolean debug) {
    board.spawnNewDigit(2);
    board.spawnNewDigit(4);
    while (board.getGameState() == GameState.GAME_IN_PROGRESS) {
      boardView.printView();

      // if the board state is not changed, does not spawn a new digit
      int[][] beforeMove = deepCopy(board.getBoard());
      int[][] afterMove = null;
      do {
        char move = getUserMove();
        board.processMove(move);
        afterMove = deepCopy(board.getBoard());
      } while (!areBoardsDifferent(beforeMove, afterMove));

      board.spawnNewDigit();

      if (debug) {
        System.out.println();
      } else {
        // Clear console for repaint
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
    }

    // Print final view
    boardView.printView();
  }

  public char getUserMove() {
    String in = "";
    do {
      in = getInput();
    } while (!isValidMove(in));
    return in.toUpperCase().charAt(0);
  }

  private boolean isValidMove(String in) {
    return in.equalsIgnoreCase("a") || in.equalsIgnoreCase("d") || in.equalsIgnoreCase("w") || in.equalsIgnoreCase("s");
  }

  private String getInput() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int input = br.read();
      String in = String.valueOf(((char) input));
      return in;
    } catch (IOException ex) {
      throw new RuntimeException("Game Crashed: " + ex);
    }
  }

  private int[][] deepCopy(int[][] original) {
    if (original == null) {
      return null;
    }

    final int[][] result = new int[original.length][];
    for (int i = 0; i < original.length; i++) {
      result[i] = Arrays.copyOf(original[i], original[i].length);
    }
    return result;
  }

  // assume a and b have same dimension
  private boolean areBoardsDifferent(int[][] a, int[][] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] != b[i][j]) {
          return true;
        }
      }
    }
    return false;
  }
}
