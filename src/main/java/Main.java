public class Main {
  public static void main(String[] args) {
    SolutionBoard2DImpl b = new SolutionBoard2DImpl();
    new Game2048(b).play(false);
  }
}