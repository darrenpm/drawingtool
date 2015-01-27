package dmoen.drawingtool;

public class Line implements Shape
{
  private final static char REPRESENTATION = 'x';

  private int               x1;
  private int               y1;
  private int               x2;
  private int               y2;

  public Line(int x1,
              int y1,
              int x2,
              int y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  @Override
  public void addTo(Canvas canvas)
  {
    if (!validLineOnCanvas(canvas))
      throw new IllegalArgumentException("Invalid line!");

    if (isHorizontal()) {
      for (int i = 0; i <= length(); i++)
        canvas.lineAt(x1 + i, y1, REPRESENTATION);
    }
    else {
      for (int i = 0; i <= length(); i++)
        canvas.lineAt(x1, y1 + i, REPRESENTATION);
    }
  }

  private int length()
  {
    if (isHorizontal())
      return x2 - x1;
    return y2 - y1;
  }

  private boolean validLineOnCanvas(Canvas canvas)
  {
    // line completely on canvas?
    if (x1 < 0 || y1 < 0 || x2 > canvas.width() || y2 > canvas.height())
      return false;
    
    // diagonal line?
    if (x1 != x2 && y1 != y2)
      return false;

    return true;
  }

  private boolean isHorizontal()
  {
    return y1 == y2;
  }
}
