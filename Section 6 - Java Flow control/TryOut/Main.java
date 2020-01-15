import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class GridsCanvas extends JPanel {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  int width, height;

  int rows;

  int cols;

  GridsCanvas(int w, int h, int r, int c) {
    setSize(width = w, height = h);
    rows = r;
    cols = c;
  }

  public void paint(Graphics g) {
    int i;
    width = getSize().width;
    height = getSize().height;

    // draw the rows
    int rowHt = height / (rows);
    for (i = 0; i < rows; i++)
      g.drawLine(0, i * rowHt, width, i * rowHt);

    // draw the columns
    int rowWid = width / (cols);
    for (i = 0; i < cols; i++)
      g.drawLine(i * rowWid, 0, i * rowWid, height);
  }
}

public class Main extends JFrame {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public Main() {
    GridsCanvas xyz = new GridsCanvas(200, 200, 20, 20);
    add(xyz);
    pack();
  }

  public static void main(String[] a) {
    new Main().setVisible(true);
  }
}