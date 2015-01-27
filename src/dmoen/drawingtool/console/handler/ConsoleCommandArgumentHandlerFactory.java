package dmoen.drawingtool.console.handler;

import java.util.HashMap;
import java.util.Map;

import dmoen.drawingtool.console.ConsoleCommand;

public class ConsoleCommandArgumentHandlerFactory
{
  private final Map<ConsoleCommand, ConsoleCommandArgumentHandler> handlerMap = new HashMap<ConsoleCommand, ConsoleCommandArgumentHandler>();

  public ConsoleCommandArgumentHandlerFactory()
  {
    handlerMap.put(ConsoleCommand.CREATE, new CreateConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommand.LINE, new LineConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommand.RECTANGLE, new RectangleConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommand.FILL, new FillConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommand.QUIT, new QuitConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommand.UNKNOWN, new UnknownConsoleCommandArgumentHandler());
  }

  public ConsoleCommandArgumentHandler handlerFor(ConsoleCommand consoleCommand)
  {
    return handlerMap.get(consoleCommand);
  }
}
