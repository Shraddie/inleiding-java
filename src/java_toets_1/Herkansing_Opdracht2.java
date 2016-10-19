package java_toets_1;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Herkansing_Opdracht2 extends Applet {
	TextField tekstvak;
    Label label;
    String a, tekst;
    String b, tekst2;
    String c, tekst3;
    String d, tekst4;
    int uur;
    int london;
    int sydney;
    int newyork;
    int tokyo;
    Button tButton;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Voer het uur in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        tekst3 = "";
        tekst4 = "";
        add(label);
        add(tekstvak);
        //
      
    }
	
    public void paint(Graphics g) {
    	setSize(500, 400);
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 75 );
        g.drawString(tekst3, 50, 90 );
        g.drawString(tekst4, 50, 105 );
        
    }
    
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            uur = Integer.parseInt(a);
            switch(uur) {
            case 0:
            	tekst = "Tijd in London: 23:00";
                tekst2 = "Tijd in New York: 21:00";
                tekst3 = "Tijd in Tokyo: 09:00";
                tekst4 = "Tijd in Sydney: 12:00";
                break;
            case 1:
            	tekst = "Tijd in London: 00:00";
                tekst2 = "Tijd in New York: 22:00";
                tekst3 = "Tijd in Tokyo: 10:00";
                tekst4 = "Tijd in Sydney: 13:00";
                break;
            case 2:
            	tekst = "Tijd in London: 01:00";
                tekst2 = "Tijd in New York: 23:00";
                tekst3 = "Tijd in Tokyo: 11:00";
                tekst4 = "Tijd in Sydney: 14:00";
                break;
            case 3:
            	tekst = "Tijd in London: 02:00";
                tekst2 = "Tijd in New York: 00:00";
                tekst3 = "Tijd in Tokyo: 12:00";
                tekst4 = "Tijd in Sydney: 15:00";
                break;
            case 4:
            	tekst = "Tijd in London: 03:00";
                tekst2 = "Tijd in New York: 01:00";
                tekst3 = "Tijd in Tokyo: 13:00";
                tekst4 = "Tijd in Sydney: 16:00";
                break;
            case 5:
            	tekst = "Tijd in London: 04:00";
                tekst2 = "Tijd in New York: 02:00";
                tekst3 = "Tijd in Tokyo: 14:00";
                tekst4 = "Tijd in Sydney: 17:00";
                break;
            case 6:
            	tekst = "Tijd in London: 05:00";
                tekst2 = "Tijd in New York: 03:00";
                tekst3 = "Tijd in Tokyo: 15:00";
                tekst4 = "Tijd in Sydney: 18:00";
                break;
            case 7:
            	tekst = "Tijd in London: 06:00";
                tekst2 = "Tijd in New York: 04:00";
                tekst3 = "Tijd in Tokyo: 16:00";
                tekst4 = "Tijd in Sydney: 19:00";
                break;
            case 8:
            	tekst = "Tijd in London: 07:00";
                tekst2 = "Tijd in New York: 05:00";
                tekst3 = "Tijd in Tokyo: 17:00";
                tekst4 = "Tijd in Sydney: 20:00";
                break;
            case 9:
            	tekst = "Tijd in London: 08:00";
                tekst2 = "Tijd in New York: 06:00";
                tekst3 = "Tijd in Tokyo: 18:00";
                tekst4 = "Tijd in Sydney: 21:00";
                break;
            case 10:
            	tekst = "Tijd in London: 09:00";
                tekst2 = "Tijd in New York: 05:00";
                tekst3 = "Tijd in Tokyo: 19:00";
                tekst4 = "Tijd in Sydney: 22:00";
                break;
            case 11:
            	tekst = "Tijd in London: 10:00";
                tekst2 = "Tijd in New York: 06:00";
                tekst3 = "Tijd in Tokyo: 20:00";
                tekst4 = "Tijd in Sydney: 23:00";
                break;
            case 12:
            	tekst = "Tijd in London: 11:00";
                tekst2 = "Tijd in New York: 07:00";
                tekst3 = "Tijd in Tokyo: 21:00";
                tekst4 = "Tijd in Sydney: 0:00";
                break;
            case 13:
            	tekst = "Tijd in London: 12:00";
                tekst2 = "Tijd in New York: 08:00";
                tekst3 = "Tijd in Tokyo: 22:00";
                tekst4 = "Tijd in Sydney: 1:00";
                break;
            case 14:
            	tekst = "Tijd in London: 13:00";
                tekst2 = "Tijd in New York: 09:00";
                tekst3 = "Tijd in Tokyo: 23:00";
                tekst4 = "Tijd in Sydney: 2:00";
                break;
            case 15:
            	tekst = "Tijd in London: 14:00";
                tekst2 = "Tijd in New York: 10:00";
                tekst3 = "Tijd in Tokyo: 0:00";
                tekst4 = "Tijd in Sydney: 3:00";
                break;
            case 16:
            	tekst = "Tijd in London: 15:00";
                tekst2 = "Tijd in New York: 11:00";
                tekst3 = "Tijd in Tokyo: 1:00";
                tekst4 = "Tijd in Sydney: 4:00";
                break;
            case 17:
            	tekst = "Tijd in London: 16:00";
                tekst2 = "Tijd in New York: 12:00";
                tekst3 = "Tijd in Tokyo: 2:00";
                tekst4 = "Tijd in Sydney: 5:00";
                break;
            case 18:
            	tekst = "Tijd in London: 17:00";
                tekst2 = "Tijd in New York: 13:00";
                tekst3 = "Tijd in Tokyo: 3:00";
                tekst4 = "Tijd in Sydney: 6:00";
                break;
            case 19:
            	tekst = "Tijd in London: 18:00";
                tekst2 = "Tijd in New York: 14:00";
                tekst3 = "Tijd in Tokyo: 4:00";
                tekst4 = "Tijd in Sydney: 7:00";
                break;
            case 20:
            	tekst = "Tijd in London: 19:00";
                tekst2 = "Tijd in New York: 15:00";
                tekst3 = "Tijd in Tokyo: 5:00";
                tekst4 = "Tijd in Sydney: 8:00";
                break;
            case 21:
            	tekst = "Tijd in London: 20:00";
                tekst2 = "Tijd in New York: 16:00";
                tekst3 = "Tijd in Tokyo: 6:00";
                tekst4 = "Tijd in Sydney: 9:00";
                break;
            case 22:
            	tekst = "Tijd in London: 21:00";
                tekst2 = "Tijd in New York: 17:00";
                tekst3 = "Tijd in Tokyo: 7:00";
                tekst4 = "Tijd in Sydney: 10:00";
                break;
            case 23:
            	tekst = "Tijd in London: 22:00";
                tekst2 = "Tijd in New York: 18:00";
                tekst3 = "Tijd in Tokyo: 8:00";
                tekst4 = "Tijd in Sydney: 11:00";
                break;
                
                  
            default:
                tekst = "U hebt een verkeerd nummer ingetikt, oelewapper";
                break;
        }
        repaint();
        //Unieke code :P
	
        						
        				
        		}
        }
}
