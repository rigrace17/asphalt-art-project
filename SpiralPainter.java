import org.code.neighborhood.*;
public class SpiralPainter extends PainterPlus {

public void paintSpiral(String color) {

/* First off, the Painter needs to get to the correct position
  which takes a lot of line space
  */
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  
  turnRight();

  move();
  move();
  move();
  move();
  move();
  move();
  move();

  //Getting paint
  getMyPaint(100000);

  /* The following lines of code is the process of making the spiral which took a 
    lot of trial and error because I forgot that code.org works differently than 
    just drawing an image on a website
    */
  move();
  paint(color);

  turnLeft();

  move();
  
  turnLeft();

  move();
  paint(color);

  move();

  turnLeft();

  move();
  paint(color);
  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);
  move();
  paint(color); 
  move();
  paint(color);
  
  move();
  turnLeft();

  move();
  paint(color);

  turnRight();
  move();

  turnLeft();
  move();
  paint(color);
  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);

  move();
  turnRight();

  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);
  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);

  turnRight();

  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);
  move();
  paint(color);

  turnRight();
  move();
  turnLeft();
  
  move();
  paint(color);
  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);

  turnRight();

  move();
  paint(color);

  move();
  turnLeft();

  move();
  paint(color);

  turnRight();
  move();
  turnLeft();

  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  turnLeft();
  move();
  paint(color);

  turnRight();
  move();
  turnRight();
  move();
  paint(color);
  turnLeft();

  move();
  paint(color);

  turnLeft();
  move();
  turnRight();
  move();
  paint(color);

  move();

  turnLeft();

  move();
  paint(color);

  move();
  turnRight();
  move();
  paint(color);

  turnLeft();

  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);
  move();
  paint(color);

  move();

  turnLeft();

  move();
  paint(color);
  
  
  }
}      
