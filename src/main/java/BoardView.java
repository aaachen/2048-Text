public class BoardView {
  private int turn;
  private int lineSeparatorLength;
  private AbstractBoard gameBoard;

  public BoardView(AbstractBoard board) {
    this.gameBoard = board;
    turn = 1;
  }

  public void printView() {
    if (turn > 0) {
      System.out.println("-".repeat(lineSeparatorLength));
    }
    System.out.println("Player Turn: " + this.turn);
    printInstruction();
    printScore();
    printBoard();
    printGameState();
    turn++;
  }

  // Show Board Credit:
  // https://github.com/Code-With-BK/Java/blob/main/GameOf2048ConsoleApp.java
  private void printBoard() {
    int[][] board = gameBoard.getBoard();
    if (board.length < 1 || board[0].length < 1) {
      return;
    }
    StringBuilder sb = new StringBuilder();
    // print the top separator
    for (int i = 0; i < board[0].length; i++) {
      sb.append("--------");
    }
    sb.append("\n");

    // print each row
    for (int i = 0; i < board.length; i++) {
      // print the blank space before the row
      sb.append("|");
      for (int j = 0; j < board[0].length; j++) {
        sb.append("       |");
      }
      sb.append("\n");

      // print the first pipe symbol
      sb.append("|");
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == 0) {
          sb.append(String.format("  %-4s |", ""));
        } else {
          sb.append(String.format("  %-4s |", "" + board[i][j]));
        }
      }
      sb.append("\n");

      // print the blank space after the row
      sb.append("|");
      for (int j = 0; j < board[0].length; j++) {
        sb.append("       |");
      }
      sb.append("\n");

      // print the bottom separator
      for (int j = 0; j < board[0].length; j++) {
        sb.append("--------");
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());
  }

  private void printScore() {
    // Print the score
    System.out.println("Score: " + gameBoard.score);
  }

  private void printInstruction() {
    // Print game instructions
    System.out.println("Choose a move: ");
    System.out.println("W/w: Up");
    System.out.println("S/s: Down");
    System.out.println("A/a: Left");
    System.out.println("D/d: Right");
  }

  private void printGameState() {
    if (gameBoard.getGameState() == GameState.GAME_WON) {
      System.out.println("🎉🎉 YOU WON!! 🎉🎉");
    }
    if (gameBoard.getGameState() == GameState.GAME_OVER) {
      System.out.println("😓 YOU LOST :(");
    }
  }
}