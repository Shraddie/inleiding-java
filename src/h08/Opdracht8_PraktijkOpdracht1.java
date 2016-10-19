package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht8_PraktijkOpdracht1 extends Applet {

	TextField tekstvak;
	TextField tekstvak2;
	Button plus;
	Button min;
	Button deel;
	Button keer;
	
	public void init() {
		setSize(500, 50);
		tekstvak = new TextField("", 5);
		tekstvak2 = new TextField("", 5);
		plus = new Button("+");
		min = new Button("-");
		deel = new Button("/");
		keer = new Button("*");
		
		plus.addActionListener( new PlusListener() );
        min.addActionListener( new MinListener() );
        deel.addActionListener( new DeelListener() );
        keer.addActionListener( new KeerListener() );
		
		add(tekstvak);
		add(tekstvak2);
		add(plus);
		add(min);
		add(deel);
		add(keer);

	}
	
	class PlusListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	int temp = Integer.parseInt(tekstvak.getText());
        	int temp2 = Integer.parseInt(tekstvak2.getText());
        	tekstvak.setText("" + (temp + temp2));
        	tekstvak2.setText("");
            repaint();
        }
    }
	class MinListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	int temp = Integer.parseInt(tekstvak.getText());
        	int temp2 = Integer.parseInt(tekstvak2.getText());
        	tekstvak.setText("" + (temp - temp2));
        	tekstvak2.setText("");
            repaint();
        }
    }
	class DeelListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	int temp = Integer.parseInt(tekstvak.getText());
        	int temp2 = Integer.parseInt(tekstvak2.getText());
        	tekstvak.setText("" + (temp / temp2));
        	tekstvak2.setText("");
            repaint();
        }
    }
	class KeerListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	int temp = Integer.parseInt(tekstvak.getText());
        	int temp2 = Integer.parseInt(tekstvak2.getText());
        	tekstvak.setText("" + (temp * temp2));
        	tekstvak2.setText("");
            repaint();
        }
    }

}
