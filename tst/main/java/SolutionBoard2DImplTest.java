import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

@Test
public void testSpawnDigit() {

  int[][] testBoard = new int[][] {
    {64,32,2,4},
    {2,1024,0,0},
    {4,32,64,4},
    {8,4,32,16}
  };
  b.setBoard(testBoard);
  b.spawnNewDigit(2);
  assertTrue(b.getBoard()[1][2] == 2 || b.getBoard()[1][3] == 2);
  b.spawnNewDigit(4);
  assertTrue(b.getBoard()[1][2] == 4 || b.getBoard()[1][3] == 4);
}

@Test
public void testGameInProgress() {

  int[][] testBoard = new int[][] {
    {8,2,4,16},
    {2,4,8,2},
    {4,8,16,2},
    {8,4,2,4}
  };
  b.setBoard(testBoard);
  assertEquals(GameState.GAME_IN_PROGRESS, b.getGameState());
}

@Test
public void testGameLost() {

  int[][] testBoard = new int[][] {
    {64,32,2,4},
    {2,1024,16,8},
    {4,32,64,4},
    {8,4,32,16}
  };
  b.setBoard(testBoard);
  assertEquals(GameState.GAME_OVER, b.getGameState());
}

@Test
public void testGameWon() {

  int[][] testBoard = new int[][] {
    {2,2,2,2},
    {2,2048,2,2},
    {4,0,0,4},
    {8,0,0,16}
  };
  b.setBoard(testBoard);
  assertEquals(GameState.GAME_WON, b.getGameState());
  
}

@Test
public void testMoveDown() {

  int[][] testBoard = new int[][] {
    {2,2,2,2},
    {2,0,2,2},
    {4,0,0,4},
    {8,0,0,16}
  };
  b.setBoard(testBoard);
  b.processDownMove();
  assertArrayEquals(new int[]{0,4,4,8}, b.getColumn(0));
  assertArrayEquals(new int[]{0,0,0,2}, b.getColumn(1));
  assertArrayEquals(new int[]{0,0,0,4}, b.getColumn(2));
  assertArrayEquals(new int[]{0,4,4,16}, b.getColumn(3));
  b.processDownMove();
  assertArrayEquals(new int[]{0,0,8,8}, b.getColumn(0));

}

@Test
public void testMoveUp() {

  int[][] testBoard = new int[][] {
    {2,2,2,2},
    {2,0,2,2},
    {4,0,0,4},
    {8,0,0,16}
  };
  b.setBoard(testBoard);
  b.processUpMove();
  assertArrayEquals(new int[]{4,4,8,0}, b.getColumn(0));
  assertArrayEquals(new int[]{2,0,0,0}, b.getColumn(1));
  assertArrayEquals(new int[]{4,0,0,0}, b.getColumn(2));
  assertArrayEquals(new int[]{4,4,16,0}, b.getColumn(3));
  b.processUpMove();
  assertArrayEquals(new int[]{8,8,0,0}, b.getColumn(0));
}

@Test
public void testMoveRight() {

  int[][] testBoard = new int[][] {
    {2,2,2,2},
    {2,0,2,2},
    {4,0,0,4},
    {8,0,0,16}
  };
  b.setBoard(testBoard);
  b.processRightMove();
  assertArrayEquals(new int[]{0,0,4,4}, b.getRow(0));
  assertArrayEquals(new int[]{0,0,2,4}, b.getRow(1));
  assertArrayEquals(new int[]{0,0,0,8}, b.getRow(2));
  assertArrayEquals(new int[]{0,0,8,16}, b.getRow(3));
  b.processRightMove();
  assertArrayEquals(new int[]{0,0,0,8}, b.getRow(0));
}

@Test
public void testMoveLeft() {

  int[][] testBoard = new int[][] {
    {2,2,2,2},
    {2,0,2,2},
    {4,0,0,4},
    {8,0,0,16}
  };
  b.setBoard(testBoard);
  b.processLeftMove();
  assertArrayEquals(new int[]{4,4,0,0}, b.getRow(0));
  assertArrayEquals(new int[]{4,2,0,0}, b.getRow(1));
  assertArrayEquals(new int[]{8,0,0,0}, b.getRow(2));
  assertArrayEquals(new int[]{8,16,0,0}, b.getRow(3));
  b.processLeftMove();
  assertArrayEquals(new int[]{8,0,0,0}, b.getRow(0));
}

