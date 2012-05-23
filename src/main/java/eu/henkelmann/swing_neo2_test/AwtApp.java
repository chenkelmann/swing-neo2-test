package eu.henkelmann.swing_neo2_test;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Simple test app to get the keyboard input from AWT
 *
 */
public class AwtApp extends Frame implements WindowListener, KeyListener
{
	private final TextArea textArea = new TextArea("Lorem ipsum dolor sit amet, \n" +
			"consetetur sadipscing elitr, sed diam nonumy eirmod tempor \n" +
			"invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. \n" +
			"At vero eos et accusam et justo duo dolores et ea rebum. Stet \n" +
			"clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit \n" +
			"amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam \n" +
			"nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, \n" +
			"sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. \n" +
			"Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.\n", 80, 120);
	
	public AwtApp () {
		super("Neo 2 Input Test");
		setSize(640, 480);
		setVisible(true);
		addWindowListener(this);
		textArea.addKeyListener(this);
		add(textArea);
	}
	
	public static void main( String[] args ) {
    	new AwtApp();
    }
    
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("--keyPressed-- " + verboseString(e));
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("--keyReleased-- " + verboseString(e));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("--keyTyped-- " + verboseString(e));
	}
	
	private String verboseString(KeyEvent e) {
		return   "keyChar: '" + e.getKeyChar() + "'/" + hex(e.getKeyChar()) + ", " 
		       + "keyCode: '" + KeyEvent.getKeyText(e.getKeyCode()) + "'/" + hex(e.getKeyCode()) + ", "
		       + "keyLocation: '" + e.getKeyLocation() + "', "
		       + "keyModifiers: '" + KeyEvent.getKeyModifiersText(e.getModifiers()) + "'/" + hex(e.getModifiers()) + "."
		       + "keyModifiersEx: '" + KeyEvent.getModifiersExText(e.getModifiersEx()) + "'/" + hex(e.getModifiersEx())
		       
		       ;
	}
	
	private String hex(int i) {
        return "0x" + Integer.toHexString(i);		
	}
	
}
