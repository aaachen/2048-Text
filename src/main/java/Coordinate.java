// could be useful for 2D implementation
public class Coordinate {
  public int x;
  public int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Coordinate other = (Coordinate) obj;
    return x == other.x && y == other.y;
  }
}