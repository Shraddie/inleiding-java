package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet{

	
	public void init() {
		
	}
	
	public void paint(Graphics g){
		g.drawLine(50, 150, 150, 150); //onderste
		g.drawLine(50, 150, 100, 63); //linker
		g.drawLine(100, 63, 150, 150); //rechter
	}
}
	
	

