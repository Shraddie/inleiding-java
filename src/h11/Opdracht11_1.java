package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht11_1 extends Applet {
	
	public void init() {
		setSize(500, 400);
	}

    public void paint(Graphics g) {
        int teller;
        int x = 0;
		
        for(teller = 0; teller < 11; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("", 50, x );
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
