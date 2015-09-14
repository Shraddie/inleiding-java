package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2_2 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  	g.setColor(Color.blue);
	    g.drawString("Shradhand", 20, 20 );
	    g.setColor(Color.red);
	    g.drawString("Harkisoen", 20, 40 );
  }
}