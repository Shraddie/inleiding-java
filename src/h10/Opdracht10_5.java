package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import h10.Opdracht10_4.TekstvakListener;

@SuppressWarnings("serial")
public class Opdracht10_5 extends Applet {
	TextField tekstvak;
	Label label;
	String s, tekst;
	int cijfer;
	
	public void init() {
		tekstvak = new TextField("", 20);
		label = new Label("Voer het cijfer in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);	
	}
	
	public void paint(Graphics g) {
		setSize(500, 400);
        g.drawString(tekst, 50, 60 );	
	}
	
	 class TekstvakListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	        	s = tekstvak.getText();
	        	cijfer = Integer.parseInt( s);
	        	 switch(cijfer) {
	                case 1:
	                    tekst = "Onvoldoende!";
	                    break;
	                case 2:
	                    tekst = "Onvoldoende!";
	                    break;
	                case 3:
	                    tekst = "Onvoldoende!";
	                    break;
	                case 4:
	                    tekst = "Onvoldoende!";
	                    break;
	                case 5:
	                    tekst = "Onvoldoende!";
	                    break;
	                case 6:
	                    tekst = "Voldoende!";
	                    break;
	                case 7:
	                    tekst = "Voldoende!";
	                    break;
	                case 8:
	                    tekst = "Voldoende!";
	                    break;
	                case 9:
	                    tekst = "Voldoende!";
	                    break;
	                case 10:
	                    tekst = "Voldoende!";
	                    break;
	                      
	                default:
	                    tekst = "U hebt een verkeerd nummer ingetikt, oelewapper";
	                    break;
	        }
	        	 repaint();
	  }	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
