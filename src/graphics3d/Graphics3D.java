package graphics3d;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Graphics3D extends JPanel implements Runnable {
	public static boolean running = false;
	public static Graphics3D g3d = new Graphics3D();
	public static void main(String[] args) {
		Window.createWindow();
		
	}
	
	public class Point3D {
		private double x, y, z;
		public Point3D() {
			
		}
		
		public Point3D(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
			
		}
		
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double getZ() {
			return z;
		}

		public void setZ(double z) {
			this.z = z;
		}

	}
	
	@Override
	public void run() {
		while(running) {
			tick();
			render();
			
			try {
				Thread.sleep(16);
			
			} catch (InterruptedException e) {

			}
			
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawLine(0, 0, 500, 500);
		
	}
	
	public static void tick() {
		Point3D a = g3d.new Point3D(1, 0, 0);
		Point3D c = g3d.new Point3D(-5, 0, 0);
		Point3D o = g3d.new Point3D(0, 0, 0);
		Point3D e = g3d.new Point3D(1, 1 ,1);
		Point3D d = g3d.new Point3D();
		
		Double x = a.getX() - c.getX();
		Double y = a.getY() - c.getY();
		Double z = a.getZ() - c.getZ();
		
		d.setX(c.getY() * (Math.sin(o.getZ()) * y) + Math.cos(o.getZ()) * x - Math.sin(o.getY()) * z);
		
		
	}
	
	public static void render() {
		Window.frame.repaint();
		
	}
	
}
