package graphics3d;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Graphics3D extends JPanel implements Runnable {
	public static boolean running = false;
	public static Graphics3D g3d = new Graphics3D();

	public static Point2D f1 = g3d.new Point2D();
	public static Point2D f2 = g3d.new Point2D();
	public static Point2D f3 = g3d.new Point2D();
	public static Point2D f4 = g3d.new Point2D();
	
	public static Point2D f5 = g3d.new Point2D();
	public static Point2D f6 = g3d.new Point2D();
	public static Point2D f7 = g3d.new Point2D();
	public static Point2D f8 = g3d.new Point2D();
	
	public static Point3D a1 = g3d.new Point3D(1, 2, 1);
	public static Point3D a2 = g3d.new Point3D(1, 3, 1);
	public static Point3D a3 = g3d.new Point3D(2, 2, 1);
	public static Point3D a4 = g3d.new Point3D(2, 3, 1);
	
	public static Point3D a5 = g3d.new Point3D(1, 2, 2);
	public static Point3D a6 = g3d.new Point3D(1, 3, 2);
	public static Point3D a7 = g3d.new Point3D(2, 2, 2);
	public static Point3D a8 = g3d.new Point3D(2, 3, 2);
	
	public static Point3D c = g3d.new Point3D(-5, 6, 3);
	public static Point3D o = g3d.new Point3D(0, 0, 0);
	public static Point3D e = g3d.new Point3D(1, 1, 1);
	public static Point3D d = g3d.new Point3D();
	
	public static void main(String[] args) {
		Window.createWindow();
		start();
//		System.out.println(project(g3d.new Point3D(1, 2, 0), g3d.new Point3D(0, 0, 0), g3d.new Point3D(0, 0, 0), e).getY());
		
	}
	
	public static synchronized void start() {
		new Thread(new Graphics3D()).start();
		running = true;
		
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
	
	public class Point2D {
		private double x, y;
		public Point2D() {
			
		}
		
		public Point2D(double x, double y) {
			this.x = x;
			this.y = y;
			
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
		g2d.drawLine((int)(f1.getX() * 50 + 960), (int)(f1.getY() * 50 + 540), (int)(f2.getX() * 50 + 960), (int)(f2.getY() * 50 + 540));
		g2d.drawLine((int)(f1.getX() * 50 + 960), (int)(f1.getY() * 50 + 540), (int)(f3.getX() * 50 + 960), (int)(f3.getY() * 50 + 540));
		g2d.drawLine((int)(f2.getX() * 50 + 960), (int)(f2.getY() * 50 + 540), (int)(f4.getX() * 50 + 960), (int)(f4.getY() * 50 + 540));
		g2d.drawLine((int)(f3.getX() * 50 + 960), (int)(f3.getY() * 50 + 540), (int)(f4.getX() * 50 + 960), (int)(f4.getY() * 50 + 540));
		
		g2d.drawLine((int)(f5.getX() * 50 + 960), (int)(f5.getY() * 50 + 540), (int)(f6.getX() * 50 + 960), (int)(f6.getY() * 50 + 540));
		g2d.drawLine((int)(f5.getX() * 50 + 960), (int)(f5.getY() * 50 + 540), (int)(f7.getX() * 50 + 960), (int)(f7.getY() * 50 + 540));
		g2d.drawLine((int)(f6.getX() * 50 + 960), (int)(f6.getY() * 50 + 540), (int)(f8.getX() * 50 + 960), (int)(f8.getY() * 50 + 540));
		g2d.drawLine((int)(f7.getX() * 50 + 960), (int)(f7.getY() * 50 + 540), (int)(f8.getX() * 50 + 960), (int)(f8.getY() * 50 + 540));
		
		g2d.drawLine((int)(f1.getX() * 50 + 960), (int)(f1.getY() * 50 + 540), (int)(f5.getX() * 50 + 960), (int)(f5.getY() * 50 + 540));
		g2d.drawLine((int)(f2.getX() * 50 + 960), (int)(f2.getY() * 50 + 540), (int)(f6.getX() * 50 + 960), (int)(f6.getY() * 50 + 540));
		g2d.drawLine((int)(f3.getX() * 50 + 960), (int)(f3.getY() * 50 + 540), (int)(f7.getX() * 50 + 960), (int)(f7.getY() * 50 + 540));
		g2d.drawLine((int)(f4.getX() * 50 + 960), (int)(f4.getY() * 50 + 540), (int)(f8.getX() * 50 + 960), (int)(f8.getY() * 50 + 540));
		
	}
	
	public static void tick() {
/*		Double x = a.getX() - c.getX();
		Double y = a.getY() - c.getY();
		Double z = a.getZ() - c.getZ();
		
		d.setX(Math.cos(o.getY()) * (Math.sin(o.getZ()) * y) + Math.cos(o.getZ()) * x - Math.sin(o.getY()) * z);
		d.setY(Math.sin(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) + Math.cos(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		d.setZ(Math.cos(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) - Math.sin(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		
		b.setX((e.getZ() / d.getZ()) * d.getX() - e.getX());
		b.setX((e.getZ() / d.getZ()) * d.getY() - e.getY());
*/
		f1 = project(a1, c, o, e);
		f2 = project(a2, c, o, e);
		f3 = project(a3, c, o, e);
		f4 = project(a4, c, o, e);
		
		f5 = project(a5, c, o, e);
		f6 = project(a6, c, o, e);
		f7 = project(a7, c, o, e);
		f8 = project(a8, c, o, e);
		
		c.setX(c.getX()+.01);
		c.setY(c.getY()+.01);
		c.setZ(c.getZ()-.01);
		
	}
	
	public static void render() {
		Window.frame.repaint();
		
	}
	
	public static Point2D project(Point3D a, Point3D c, Point3D o, Point3D e) {
		Double x = a.getX() - c.getX();
		Double y = a.getY() - c.getY();
		Double z = a.getZ() - c.getZ();
		
		Point2D b = g3d.new Point2D();
		
		d.setX(Math.cos(o.getY()) * (Math.sin(o.getZ()) * y) + Math.cos(o.getZ()) * x - Math.sin(o.getY()) * z);
		d.setY(Math.sin(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) + Math.cos(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		d.setZ(Math.cos(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) - Math.sin(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		
		b.setX((e.getZ() / d.getZ()) * d.getX() - e.getX());
		b.setY((e.getZ() / d.getZ()) * d.getY() - e.getY());
		
		return b;
		
	}
	
}
