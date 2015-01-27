package dmoen.drawingtool.commands;

import dmoen.drawingtool.DrawingTool;

public interface Command
{
  void executeOn(DrawingTool drawingTool);
}
