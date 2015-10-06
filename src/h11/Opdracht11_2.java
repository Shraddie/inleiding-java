package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht11_2 extends Applet {
	
	public void init() {}

    public void paint(Graphics g) {
        int teller = 10;
        int y = 0;
		
        while(teller < 21) {
            y += 20;
            g.drawString("" + teller, 100, y );
            teller++;
        }
    }
	
	
	
	
	
	
	
	
	
}
