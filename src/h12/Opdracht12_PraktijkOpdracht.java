package h12;

import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Opdracht12_PraktijkOpdracht extends Applet {

	String[] naamarray = new String[10];
	String[] nummerarray = new String[10];
	Button knop = new Button();
	TextField naam = new TextField();
	TextField nummer = new TextField();

	public void init() {
		naam = new TextField("Naam", 20);
		add(naam);
		nummer = new TextField("Nummer", 20);
		add(nummer);

		knop = new Button("OK");
		KnopLuisteraar kl = new KnopLuisteraar();
		knop.addActionListener(kl);
		add(knop);

		for (int i = 0; i < 10; i++) {
			naamarray[i] = "" + (i);

			for (int k = 0; k < 10; k++) {
				nummerarray[k] = "" + (k);

			}
		}
	}

	public void paint(Graphics g) {
		
	}

	class KnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
