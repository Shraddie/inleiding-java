package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht11_5 extends Applet {
	
	public void paint(Graphics g){
		int i= 0;
		int x = 20;
		int y = 20;
		int width = 20;
		int	height = 20;
while(i < 5){
	g.setColor(Color.black);
	g.fillRect(x, y, width, height);
	i++;
	x += 20;
	y += 20;
	
		}
	}
}
