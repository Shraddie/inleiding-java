package java_toets_1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Toets_Opdracht1 extends Applet {
	
	Button fButton;
	Button bButton;
	Button wButton;
	Button kButton;
	Button bindButton;
	Button buitdButton;
	Button NieuwButton;
    double fris;
	double bier;
	double wijn;
	double koffie;
	double binDist;
	double buitDist;
	double dagomzet;
	double bestelling;
	
	public void init(){
		setSize(500, 400);
		fris = 2;
		bier = 2.25;
		wijn = 2.50;
		koffie = 1.75;
		binDist = 2.75;
		buitDist = 3.50;
		dagomzet = 0;
		bestelling = 0;
		
		fButton = new Button("Fris");
		FrisKnopLuisteraar fkl = new FrisKnopLuisteraar();
		fButton.addActionListener(fkl);
		add(fButton);
		
		bButton = new Button ("Bier");
		BierKnopLuisteraar bkl = new BierKnopLuisteraar();
		bButton.addActionListener(bkl);
		add(bButton);
		
		wButton = new Button ("Wijn");
		WijnKnopLuisteraar wkl = new WijnKnopLuisteraar();
		wButton.addActionListener(wkl);
		add(wButton);
		
		kButton = new Button ("Koffie");
		KoffieKnopLuisteraar kkl = new KoffieKnopLuisteraar();
		kButton.addActionListener(kkl);
		add(kButton);
	
		bindButton = new Button ("BinDist");
		BindKnopLuisteraar bikl = new BindKnopLuisteraar();
		bindButton.addActionListener(bikl);
		add(bindButton);
		
		buitdButton = new Button ("BuitDist");
		BuitdKnopLuisteraar bukl = new BuitdKnopLuisteraar();
		buitdButton.addActionListener(bukl);
		add(buitdButton);
		
		NieuwButton = new Button ("Nieuwe bestelling");
		NieuwKnopLuisteraar nbkl = new NieuwKnopLuisteraar();
		NieuwButton.addActionListener(nbkl);
		add(NieuwButton);
		
	}
		
		public void paint(Graphics g) {
			int x = 50;
			int y = 70;
			g.drawString("Bestelling totaal : " + bestelling , x, y);
			y = y + 20;
			g.drawString("Totaal dagomzet : " + dagomzet , x, y);
			y = y + 20;
			
		}
		
		
		
		class FrisKnopLuisteraar implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				dagomzet = fris + dagomzet;
				bestelling = fris + bestelling;
				repaint();
		
			}
		}
        class BierKnopLuisteraar implements ActionListener {
        	public void actionPerformed(ActionEvent e) {
        	 dagomzet = bier + dagomzet;
        	 bestelling = bier + bestelling;
        	 repaint();
        		
        		
        	}
        
        }
        
        class WijnKnopLuisteraar implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				dagomzet = wijn + dagomzet;
				bestelling = wijn + bestelling;
				repaint();
				
			}
        }
			class KoffieKnopLuisteraar implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					dagomzet = koffie + dagomzet;
					bestelling = koffie + bestelling;
					repaint();
					
				}
			}
				class BindKnopLuisteraar implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						dagomzet = binDist + dagomzet;
						bestelling = binDist + bestelling;
						repaint();
						
					}
				}
					class BuitdKnopLuisteraar implements ActionListener {
						public void actionPerformed(ActionEvent e) {
							dagomzet = buitDist + dagomzet;
							bestelling = buitDist + bestelling;
							repaint();
							
						}
					}
					
					class NieuwKnopLuisteraar implements ActionListener {
						public void actionPerformed(ActionEvent e) {
							bestelling = 0;
							repaint();
					
					
						}
					
				}			
					
}				