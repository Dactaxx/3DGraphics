package graphics3d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Graphics3D.keyW = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Graphics3D.keyA = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Graphics3D.keyS = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Graphics3D.keyD = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Graphics3D.keySpace = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			Graphics3D.keyShift = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W) {
			Graphics3D.keyW = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Graphics3D.keyA = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			Graphics3D.keyS = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_D) {
			Graphics3D.keyD = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Graphics3D.keySpace = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			Graphics3D.keyShift = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
