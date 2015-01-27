package dmoen.drawingtool;

public class Rectangle implements Shape
{
  private final static char REPRESENTATION = 'x';

  private int               x1;
  private int               y1;
  private int               x2;
  private int               y2;

  public Rectangle(int x1,
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
    if (!validRectangleOnCanvas(canvas))
      throw new IllegalArgumentException("Invalid rectangle!");

    // horizontal lines
    for (int i = 0; i < width(); i++)
      canvas.lineAt(x1 + i, y1, REPRESENTATION);
    for (int i = 0; i < width(); i++)
      canvas.lineAt(x1 + i, y2, REPRESENTATION);

    // vertical lines
    for (int i = 0; i < height() - 2; i++)
      canvas.lineAt(x1, y1 + i + 1, REPRESENTATION);
    for (int i = 0; i < height() - 2; i++)
      canvas.lineAt(x2, y1 + i + 1, REPRESENTATION);
  }

  private int height()
  {
    return y2 - y1 + 1;
  }

  private int width()
  {
    return x2 - x1 + 1;
  }

  private boolean validRectangleOnCanvas(Canvas canvas)
  {
    // rectangle on canvas?
    if (x1 < 0 || y1 < 0 || x2 > canvas.width() || y2 > canvas.height())
      return false;

    return true;
  }
}
