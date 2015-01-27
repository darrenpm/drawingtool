package dmoen.drawingtool;

import java.io.PrintStream;

public class Canvas
{
  private final static char BLANK = ' ';

  private final int         width;
  private final int         height;
  private final char[][]    squares;

  public Canvas(int w,
                int h)
  {
    width = w;
    height = h;
    squares = new char[w][h];

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++)
        squares[i][j] = BLANK;
    }
  }

  public void lineAt(int x1,
                     int y1,
                     char c)
  {
    squares[x1 - 1][y1 - 1] = c;
  }

  public void fill(int x,
                   int y,
                   char c)
  {
    if (x <= 0 || x > width || y <= 0 || y > height || squares[x - 1][y - 1] != BLANK)
      return;

    squares[x - 1][y - 1] = c;

    fill(x + 1, y, c);
    fill(x - 1, y, c);
    fill(x, y + 1, c);
    fill(x, y - 1, c);
  }

  public void draw(PrintStream printer)
  {
    // top of canvas
    for (int i = 0; i < width + 2; i++)
      printer.print('-');

    printer.println();

    for (int i = 0; i < height; i++) {
      printer.print('|');
      for (int j = 0; j < width; j++)
        printer.print(squares[j][i]);
      printer.print('|');
      printer.println();
    }

    // bottom of canvas
    for (int i = 0; i < width + 2; i++)
      printer.print('-');

    printer.println();
  }

  public int width()
  {
    return width;
  }

  public int height()
  {
    return height;
  }
}
