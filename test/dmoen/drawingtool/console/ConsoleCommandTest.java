package dmoen.drawingtool.console;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dmoen.drawingtool.console.ConsoleCommand;

public class ConsoleCommandTest
{

  @Test
  public void testCommandParsing()
  {
    assertEquals(ConsoleCommand.CREATE, ConsoleCommand.parse("C"));
    assertEquals(ConsoleCommand.LINE, ConsoleCommand.parse("L"));
    assertEquals(ConsoleCommand.RECTANGLE, ConsoleCommand.parse("R"));
    assertEquals(ConsoleCommand.FILL, ConsoleCommand.parse("B"));
    assertEquals(ConsoleCommand.QUIT, ConsoleCommand.parse("Q"));
    assertEquals(ConsoleCommand.UNKNOWN, ConsoleCommand.parse("D"));
  }
}
