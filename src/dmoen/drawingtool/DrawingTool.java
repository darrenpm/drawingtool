package dmoen.drawingtool;

import java.io.PrintStream;

/**
 * Assumptions:<br>
 * - A canvas must be created before anything can be drawn.<br>
 * - All program inputs must be > 0<br>
 */
public class DrawingTool
{
  private Canvas canvas;

  public void crateCanvas(int width,
                          int height)
  {
    if (width < 1 || height < 1)
      throw new IllegalArgumentException("Canvas dimensions must be positive integers!");

    canvas = new Canvas(width, height);
  }

  public void addLine(int x1,
                      int y1,
                      int x2,
                      int y2)
  {
    verifyCanvas();

    Line line = new Line(x1, y1, x2, y2);
    line.addTo(canvas);
  }

  public void addRectangle(int x1,
                           int y1,
                           int x2,
                           int y2)
  {
    verifyCanvas();

    Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
    rectangle.addTo(canvas);
  }

  public void fill(int x,
                   int y,
                   char c)
  {
    verifyCanvas();
    if (x < 1 || y < 1)
      throw new IllegalArgumentException("Fill beginning must be on the canvas.");

    canvas.fill(x, y, c);
  }

  public void draw(PrintStream printer)
  {
    verifyCanvas();

    canvas.draw(printer);
  }

  private void verifyCanvas()
  {
    if (canvas == null)
      throw new IllegalStateException("Canvas must first be created.");
  }
}
