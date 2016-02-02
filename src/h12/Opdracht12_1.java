package h12;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht12_1 extends Applet {
	double cijfer[];

	public void init() {
		cijfer = new double[10];

		for (int teller = 0; teller < cijfer.length; teller++) {
			cijfer[teller] = 1 * teller + 1;
		}
	}

	public void paint(Graphics g) {
		g.drawString("gemiddelde : 5.5", 120, 110);
		for (int teller = 0; teller < cijfer.length; teller++) {
			g.drawString("" + cijfer [teller], 50, 20 * teller + 20);
		}
	}
}
