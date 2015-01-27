package dmoen.drawingtool.console.handler;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import dmoen.drawingtool.console.ConsoleCommand;
import dmoen.drawingtool.console.handler.ConsoleCommandArgumentHandlerFactory;

public class ConsoleCommandHandlerFactoryTest
{
  private ConsoleCommandArgumentHandlerFactory consoleCommandHandlerFactory;

  @Before
  public void init()
  {
    consoleCommandHandlerFactory = new ConsoleCommandArgumentHandlerFactory();
  }

  @Test
  public void testConsoleCommandHandlers()
  {
    for (ConsoleCommand command : ConsoleCommand.values()) {
      assertNotNull(consoleCommandHandlerFactory.handlerFor(command));
    }
  }
}
