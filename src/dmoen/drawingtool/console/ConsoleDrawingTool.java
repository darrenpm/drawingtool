package dmoen.drawingtool.console;

import java.util.Scanner;

import dmoen.drawingtool.DrawingTool;
import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.console.handler.ConsoleCommandArgumentHandlerFactory;

/**
 * Console interface to the <code>DrawingTool<code>
 */
public class ConsoleDrawingTool
{
  private final static ConsoleCommandArgumentHandlerFactory handlerFactory = new ConsoleCommandArgumentHandlerFactory();

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    DrawingTool drawingTool = new DrawingTool();
    ConsoleCommand consoleCommand = ConsoleCommand.UNKNOWN;

    do {
      System.out.print("enter command:");
      try {
        consoleCommand = ConsoleCommand.parse(scanner.next());
        Command command = handlerFactory.handlerFor(consoleCommand).toCommandFrom(scanner);
        command.executeOn(drawingTool);

        drawingTool.draw(System.out);
      }
      catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
    while (consoleCommand != ConsoleCommand.QUIT);

    scanner.close();
    System.exit(0);
  }
}
