package java_toets_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

@SuppressWarnings("serial")
public class Herkansing_Opdracht1 extends Applet {
	TextField tekstvak;
    Label label;
    Label label2;
    Button plusButton;
    Button minButton;
    double rekening;
    double fooi;
    int plus;
    int min;
	
    public void init() {
    	fooi = 15;
        tekstvak = new TextField("", 20);
        label = new Label("Rekening bedrag");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        //
        plusButton = new Button("+");
		PlusKnopLuisteraar pkl = new PlusKnopLuisteraar();
		plusButton.addActionListener(pkl);
		add(plusButton);
		//
		minButton = new Button("-");
		MinKnopLuisteraar mkl = new MinKnopLuisteraar();
		minButton.addActionListener(mkl);
		add(minButton);
		//
	
    }
	
    public void paint(Graphics g) {
        g.drawString("Fooi = � " + (rekening * (fooi / 100+1) - rekening), 50, 120 );
        g.drawString("Totaal incl. fooi = � " + rekening * (fooi / 100+1), 50, 140 );
        g.drawString("Percentage fooi " + fooi, 90, 60);
        setSize(500,250);
        plusButton.setLocation(230, 44);
        minButton.setLocation(260, 44);
    }
    
    class PlusKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			plus++;
			fooi++;
			repaint();
		}
	}
    

    class MinKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			min--;
			fooi--;
			repaint();
		}
	}
    
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            rekening = Double.parseDouble( s );
            repaint();
        						
        		}
        }
}
