package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.commands.CreateCommand;

public class CreateConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    return new CreateCommand(width, height);
  }
}
