package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;

public class UnknownConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    scanner.nextLine();
    throw new IllegalArgumentException("Unsupported command");
  }
}
