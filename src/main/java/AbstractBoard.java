/**
 * A 2048 game board, containing methods students should implement
 *
 * Run the units with the test pane (located under Tools > Tests)
 * https://docs.replit.com/teams-edu/unit-testing#using-the-testing-pane
 */
public abstract class AbstractBoard {

  public int score = 0;
  public static final char MOVE_LEFT = 'A';
  public static final char MOVE_RIGHT = 'D';
  public static final char MOVE_UP = 'W';
  public static final char MOVE_DOWN = 'S';

  /*
   * Spawn a new digit to a random, empty location on the board
   *
   * @param digit the digit to spawn
   */
  public abstract void spawnNewDigit(int digit);

  /*
   * Spawn a random 2 or 4 to a random, empty location on the board
   * The probability of 2 is 90%, 4 is 10%
   */
  public void spawnNewDigit() {
    int digit = Math.random() > 0.9 ? 4 : 2;
    spawnNewDigit(digit);
  }

  /**
   * Return one of the three game states given the current board
   */
  public abstract GameState getGameState();

  /**
   * Process a user move and update the board
   */
  public void processMove(char move) {
    switch (move) {
      case MOVE_LEFT: {
        processLeftMove();
        break;
      }
      case MOVE_RIGHT: {
        processRightMove();
        break;
      }
      case MOVE_DOWN: {
        processDownMove();
        break;
      }
      case MOVE_UP: {
        processUpMove();
        break;
      }
      default:
        throw new RuntimeException("Unrecognized Move: " + move);
    }
  }

  /**
   * Update the board when user moves left
   */
  public abstract void processLeftMove();

  /**
   * Update the board when user moves right
   */
  public abstract void processRightMove();

  /**
   * Update the board when user moves up
   */
  public abstract void processUpMove();

  /**
   * Update the board when user moves down
   */
  public abstract void processDownMove();

  /**
   * Return a 2-d representation of the game board, with 0 representing
   * an empty space
   *
   * Consider the example below:
   * [2, -, -]
   * [-, 4, -]
   * [-, 8, -]
   *
   * This function would return the array [[2, 0, 0], [0, 4, 0], [0, 8, 0]]
   * 
   * @return 2-d representation of game board
   */
  public abstract int[][] getBoard();

  // below methods are for unit testing purpose

  public int[] getRow(int i) {
    return getBoard()[i];
  }

  public int[] getColumn(int j) {
    int[][] board = getBoard();
    int[] column = new int[board.length];
    for (int i = 0; i < board.length; i++) {
      column[i] = board[i][j];
    }
    return column;
  }

  public abstract void setBoard(int[][] board);

  /**
   * Bonus Challenges/Features:
   * - Score tallying
   * - Set alternative win condition (i.e. first to 256)
   * - Customize board dimension
   */
}