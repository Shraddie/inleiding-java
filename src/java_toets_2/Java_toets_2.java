package java_toets_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.applet.*;

@SuppressWarnings("serial")
public class Java_toets_2 extends Applet {

	int krediet;
	Button Speel;
	Button Krediet;
	int random1;
	int random2;
	int random3;
	String victory;
	Image[] fruit;

	public void init() {
		krediet = 10;
		setSize(500, 500);
		fruit = new Image[20];
		for (int i = 0; i < fruit.length; i++) {
			fruit[i] = getImage(getCodeBase(), "java_toets_2/fruit_" + (i + 1) + ".jpg");
		}
		Speel = new Button("Speel!");
		Speel.addActionListener(new SpeelKnopLuisteraar());
		add(Speel);
		//
		Krediet = new Button("Koop 10 kredietpunten");
		Krediet.setEnabled(false);
		Krediet.addActionListener(new KredietKnopLuisteraar());
		add(Krediet);
		random1 = (int) (Math.random() * 20);
		random2 = (int) (Math.random() * 20);
		random3 = (int) (Math.random() * 20);
	}

	public void paint(Graphics g) {
		g.drawImage(fruit[random1], 240, 200, this);
		g.drawImage(fruit[random2], 170, 200, this);
		g.drawImage(fruit[random3], 310, 200, this);
		if ((random1 == random2) && (random1 == random3)) {
			victory = "Gewonnnen! Je hebt 20 punten gewonnen";
			krediet += 20;
		}
		if (random1 == random2) {
			victory = "Gewonnen! Je hebt 4 punten gewonnen";
			krediet += 4;
		}
		if (random1 == random3) {
			victory = "Gewonnen! Je hebt 4 punten gewonnen";
			krediet += 4;
		}
		if (random2 == random3) {
			victory = "Gewonnen! Je hebt 4 punten gewonnen";
			krediet += 4;
		}
		if (krediet == 0) {
			Krediet.setEnabled(true);
			Speel.setEnabled(false);
		}
		if (krediet > 1) {
			Krediet.setEnabled(false);
			Speel.setEnabled(true);
		}
		g.drawString("krediet : " + krediet, 170, 400);
		g.drawString("" + victory, 170, 420);
		if (victory == null) {
			victory = "";

		}
	}

	class SpeelKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			random1 = (int) (Math.random() * 20);
			random2 = (int) (Math.random() * 20);
			random3 = (int) (Math.random() * 20);
			krediet -= 1;
			repaint();

		}
	}

	class KredietKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			krediet += 10;
			repaint();
		}
	}
}
