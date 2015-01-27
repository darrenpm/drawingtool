package dmoen.drawingtool.commands;

import dmoen.drawingtool.DrawingTool;

public class UnknownCommand implements Command
{
  @Override
  public void executeOn(DrawingTool drawingTool)
  {
    // noop
  }
}
