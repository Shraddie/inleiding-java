package h06;

import java.awt.Graphics;

public class Opdracht6_PraktijkOpdracht {

	double cijfer1 = 5.9;
	double cijfer2 = 6.3;
	double cijfer3 = 6.9;
	double gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
	double gemiddelde1 = gemiddelde * 10;
	double gemiddelde2 = (int) gemiddelde1;
	double gemiddelde3 = (double) gemiddelde2 / 10;
	
public static void main(String[] args) {
		
	}
public void paint(Graphics g) {
	g.drawString( " uitkomst is " + gemiddelde3, 20, 20);
	
	
	
	
	
	
	
	
	
	
}}
