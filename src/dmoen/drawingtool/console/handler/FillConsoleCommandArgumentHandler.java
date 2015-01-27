package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.commands.FillCommand;

public class FillConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    char color = scanner.next().charAt(0);

    return new FillCommand(x, y, color);
  }
}
