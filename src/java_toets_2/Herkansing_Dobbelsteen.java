package java_toets_2;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.applet.*;

@SuppressWarnings({ "serial", "unused" })
public class Herkansing_Dobbelsteen extends Applet {

	AudioClip sound;
	int dobbel1;
	int dobbel2;
	int dobbel3;
	int dobbel4;
	int dobbel5;
	int hoogste = 0;
	String worp;
	Button Gooi;
	Image[] dobbelsteen;

	public void init() {
		setSize(500, 500);
		dobbelsteen = new Image[6];
		for (int i = 0; i < dobbelsteen.length; i++) {
			dobbelsteen[i] = getImage(getCodeBase(), "java_toets_2/dobbel" + (i + 1) + ".jpg");
		}
		sound = getAudioClip(getCodeBase(), "java_toets_2/applaus.wav");
		Gooi = new Button("Gooi!");
		Gooi.addActionListener(new GooiKnopLuisteraar());
		add(Gooi);

		worp = "hoogste score: " + hoogste;
		dobbel1 = (int) (Math.random() * 6);
		dobbel2 = (int) (Math.random() * 6);
		dobbel3 = (int) (Math.random() * 6);
		dobbel4 = (int) (Math.random() * 6);
		dobbel5 = (int) (Math.random() * 6);

	}

	public void paint(Graphics g) {
		g.drawImage(dobbelsteen[dobbel1], 240, 200, this);
		g.drawImage(dobbelsteen[dobbel2], 170, 200, this);
		g.drawImage(dobbelsteen[dobbel3], 310, 200, this);
		g.drawImage(dobbelsteen[dobbel4], 380, 200, this);
		g.drawImage(dobbelsteen[dobbel5], 100, 200, this);
		g.drawString(worp, 100, 300);

	}

	class GooiKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dobbel1 = (int) (Math.random() * 6);
			dobbel2 = (int) (Math.random() * 6);
			dobbel3 = (int) (Math.random() * 6);
			dobbel4 = (int) (Math.random() * 6);
			dobbel5 = (int) (Math.random() * 6);

			// dobbel1 = 5;
			// dobbel2 = 5;
			// dobbel3 = 5;
			// dobbel4 = 5;
			// dobbel5 = 5;

			if (dobbel1 + dobbel2 + dobbel3 + dobbel4 + dobbel5 > hoogste)
				hoogste = dobbel1 + dobbel2 + dobbel3 + dobbel4 + dobbel5;

			if (dobbel1 == dobbel2 && dobbel1 == dobbel3 && dobbel1 == dobbel4 && dobbel1 == dobbel5) {
				sound.play();
			}
			worp = "Hoogste score: " + hoogste;

			repaint();

		}
	}
}
