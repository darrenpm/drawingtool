package dmoen.drawingtool;

import org.junit.Test;

import dmoen.drawingtool.DrawingTool;

public class DrawingToolTest
{

  @Test(expected = IllegalArgumentException.class)
  public void testCreatingCanvasWithNegativeWidth()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(-1, 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreatingCanvasWithNegativeHeigth()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, -10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreatingCanvasWithZeroWidth()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(0, 10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreatingCanvasWithZeroHeigth()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 0);
  }

  @Test(expected = IllegalStateException.class)
  public void testCreatingLineBeforeCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.addLine(1, 4, 7, 4);
  }

  @Test(expected = IllegalStateException.class)
  public void testCreatingRectangleBeforeCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.addRectangle(1, 4, 7, 4);
  }

  @Test(expected = IllegalStateException.class)
  public void testFillingBeforeCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.fill(1, 4, 'o');
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDiagonalLine()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.addLine(1, 2, 6, 5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLineBeginningOffCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.addLine(-1, 2, 6, 2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testLineEndingOffCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.addLine(1, 2, 16, 2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRectangleBeginningOffCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.addRectangle(-1, 2, 6, 2);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testFillOffCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.fill(-1, 6, 'o');
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRectangleEndingOffCanvas()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(10, 10);
    drawingTool.addRectangle(1, 2, 16, 2);
  }

  @Test
  public void test()
  {
    DrawingTool drawingTool = new DrawingTool();
    drawingTool.crateCanvas(20, 4);
    drawingTool.addLine(1, 2, 6, 2);
    drawingTool.addLine(6, 3, 6, 4);
    drawingTool.addRectangle(16, 1, 20, 3);
    drawingTool.fill(10, 3, 'o');
    drawingTool.draw(System.out);
  }
}
