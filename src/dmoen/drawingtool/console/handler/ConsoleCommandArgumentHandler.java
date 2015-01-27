package dmoen.drawingtool.console.handler;

import java.util.Scanner;

import dmoen.drawingtool.commands.Command;

public interface ConsoleCommandArgumentHandler
{
  Command toCommandFrom(Scanner scanner);
}
