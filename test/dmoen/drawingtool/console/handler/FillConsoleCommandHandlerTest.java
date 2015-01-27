package dmoen.drawingtool.console.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import dmoen.drawingtool.commands.Command;
import dmoen.drawingtool.commands.FillCommand;
import dmoen.drawingtool.console.handler.FillConsoleCommandArgumentHandler;

public class FillConsoleCommandHandlerTest
{
  private FillConsoleCommandArgumentHandler fillConsoleCommandHandlerTest;

  @Before
  public void init()
  {
    fillConsoleCommandHandlerTest = new FillConsoleCommandArgumentHandler();
  }

  @Test
  public void testFillConsoleCommandHandler()
  {
    byte[] data = "6 8 o".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = fillConsoleCommandHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(FillCommand.class));

    FillCommand fillCommand = (FillCommand) command;

    assertEquals(6, fillCommand.getX());
    assertEquals(8, fillCommand.getY());
    assertEquals('o', fillCommand.getColor());
  }
}
