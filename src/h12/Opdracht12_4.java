package h12;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdracht12_4 extends Applet {

	boolean iets;
	double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
	double gezocht;

	public void init() {
		gezocht = 400;
		iets = false;
		int teller = 0;
		while (teller < salaris.length) {
			if (salaris[teller] == gezocht) {
				iets = true;
			}
			teller++;
		}
	}

	public void paint(Graphics g) {
		if (iets == true) {
			g.drawString("De waarde is gevonden.", 20, 50);
		} else {
			g.drawString("De waarde is niet gevonden.", 20, 50);
		}
	}
}
