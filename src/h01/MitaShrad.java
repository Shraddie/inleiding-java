package h01;

import java.awt.*;
import java.applet.*;

public class MitaShrad extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Shradhand", 20, 20 );
  }
}