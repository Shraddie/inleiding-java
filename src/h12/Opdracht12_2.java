package h12;

import java.applet.*;
import java.awt.Button;

@SuppressWarnings("serial")
public class Opdracht12_2 extends Applet {
	Button[] array = new Button[25];
	
	public void init(){
		
		for (int i = 0; i < 25; i++) {
			array[i] = new Button("#" + (i));
			add(array[i]);
		}
	}
}
