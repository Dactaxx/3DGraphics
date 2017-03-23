package graphics3d;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {
	public static JFrame frame = new JFrame("Physics");
	public static int width, height;
	
	public static void createWindow() {
		width = Toolkit.getDefaultToolkit().getScreenSize().width;
		height = Toolkit.getDefaultToolkit().getScreenSize().height;
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		
		try {
			gd.setFullScreenWindow(frame);
			
		}	finally {
			
			}
		
		Graphics3D g3d = new Graphics3D();
		frame.addKeyListener(new KeyInput());
		frame.add(g3d);
		
		frame.setVisible(true);
		
	}
	
	
}
