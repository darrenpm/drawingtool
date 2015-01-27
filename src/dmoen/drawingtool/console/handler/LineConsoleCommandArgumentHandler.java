package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.commands.LineCommand;

public class LineConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    return new LineCommand(x1, y1, x2, y2);
  }
}
