import org.code.neighborhood.*;
public class LinePainter extends PainterPlus {

public void paintLines(String color) {
  
/*First, the LinePainter must move to the correct position
  on the grid to start the first line
  */
  move();
  turnRight();
  
//Getting the paint
  getMyPaint(1000);

/* From this point forward, this code is used for the Painter to draw
  the lines around the spiral
  */
  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);


  move();
  move();
  move();
  move();
  move();

  turnLeft();

  move();
  paint(color);
  move();
  paint(color);

  turnRight();

  move();
  move();
  move();
  move();
  move();
  move();
  move();

  turnRight();

  move();
  paint(color);

  move();
  turnRight();

  move();
  paint(color);

  turnLeft();

  move();
  move();
  move();

  turnLeft();
  move();
  turnRight();

  move();
  
  move();
  paint(color);

  turnLeft();

  move();
  paint(color);

  turnRight();

  move();
  move();
  move();
  move();
  move();
  move();
  move();

  move();
  paint(color);

  turnRight();

  move();
  turnRight();
  
  move();
  paint(color);

  turnLeft();

  move();
  move();
  move();
  move();
  move();
  move();
  move();

  turnLeft();

  move();
  paint(color);

  turnRight();

  move();
  move();
  move();
  move();
  move();
  move();
  
  move();
  paint(color);

  turnRight();
  turnRight();

  move();
  turnLeft();

  move();
  paint(color);

  move();
  move();
  move();
  move();
  move();
  move();

  move();
  paint(color);

  turnLeft();

  move();
  paint(color);
  
  }
}
