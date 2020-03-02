package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, AWTException {
		Runtime rt = Runtime.getRuntime();
		rt.exec("notepad");
		//create an object of robot class
	Robot r=new Robot();
	//press the shift key
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_P);
	//release the shift key
	r.keyRelease(KeyEvent.VK_SHIFT);
	
	
	}
	}
