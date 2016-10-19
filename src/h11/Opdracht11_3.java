package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht11_3 extends Applet {

	int cijfer;
	int vorige;

	public void init() {
		setSize(250, 250);

	}

	public void paint(Graphics g) {
		int i = 0;
		vorige = -1;
		int x = 50;
		int y = 50;
		cijfer = 1;

		while (i < 11) {
			int sum = cijfer + vorige;
			vorige = cijfer;
			cijfer = sum;

			g.drawString("" + cijfer, x, y);

			i++;
			x += 20;

		}
	}

}
