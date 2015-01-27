package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.commands.QuitCommand;

public class QuitConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    return new QuitCommand();
  }
}
