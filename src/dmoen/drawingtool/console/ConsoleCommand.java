package dmoen.drawingtool.console;

public enum ConsoleCommand
{
  CREATE("C"),
  LINE("L"),
  RECTANGLE("R"),
  FILL("B"),
  QUIT("Q"),
  UNKNOWN("U");

  private final String c;

  private ConsoleCommand(String c)
  {
    this.c = c;
  }

  private String getCommandCharacter()
  {
    return c;
  }

  public static ConsoleCommand parse(String c)
  {
    for (ConsoleCommand command : values()) {
      if (command.getCommandCharacter().equals(c)) {
        return command;
      }
    }
    return UNKNOWN;
  }
}
