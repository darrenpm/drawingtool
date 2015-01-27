package dmoen.drawingtool.commands;

import dmoen.drawingtool.DrawingTool;

public class FillCommand implements Command
{
  private final int  x;
  private final int  y;
  private final char color;

  public FillCommand(int x,
                     int y,
                     char c)
  {
    this.x = x;
    this.y = y;
    this.color = c;
  }

  @Override
  public void executeOn(DrawingTool drawingTool)
  {
    drawingTool.fill(x, y, color);
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public char getColor()
  {
    return color;
  }
}
