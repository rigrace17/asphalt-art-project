import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  //Establishing all the painters
  SpiralPainter sun = new SpiralPainter();
  LinePainter lisa = new LinePainter();
  BackroundPainter ben = new BackroundPainter();

  //BackroundPainter ben painting the entire backround 
    ben.paintBackground("paleturquoise", 16);

  //SpiralPAinter sun paints the spiral in the middle of the image
    sun.paintSpiral("goldenrod");

  //LinePainter lisa paints the lines around the spiral
    lisa.paintLines("goldenrod");
  }
}
