package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
	
}


  public void paint(Graphics g) {
    setBackground(Color.white); 
    g.setColor(Color.red);
    g.fillRect(20, 20, 100, 50);
    {
    }
    
    g.setColor(Color.blue);
    g.fillRect(20, 120, 100, 50); 
    g.setColor(Color.black);
	g.fillRect(0, 20, 20, 250); }
}
	
	
