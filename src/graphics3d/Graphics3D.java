package graphics3d;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Robot;

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
	
	public static Point3D a1 = g3d.new Point3D(100, -200, 0);
	public static Point3D a2 = g3d.new Point3D(100, -300, 0);
	public static Point3D a3 = g3d.new Point3D(200, -200, 0);
	public static Point3D a4 = g3d.new Point3D(200, -300, 0);
	
	static double q = -100;
	public static Point3D a5 = g3d.new Point3D(100, -200, q);
	public static Point3D a6 = g3d.new Point3D(100, -300, q);
	public static Point3D a7 = g3d.new Point3D(200, -200, q);
	public static Point3D a8 = g3d.new Point3D(200, -300, q);
	
	public static Point3D c = g3d.new Point3D(0, 0, -500);
	public static Point3D o = g3d.new Point3D(0, 0, 0);
	public static Point3D e = g3d.new Point3D(0, 0, 200);
	public static Point3D d = g3d.new Point3D();
	
	public static boolean keyW = false;
	public static boolean keyA = false;
	public static boolean keyS = false;
	public static boolean keyD	= false;
	public static boolean keySpace = false;
	public static boolean keyShift = false;
	
	public static double mouseX, mouseY;
	
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
			try {
				tick();
			} catch (AWTException e1) {
			}
			render();
			
			try {
				Thread.sleep(16);
			
			} catch (InterruptedException e) {

			}
			
		}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(0, 0, 0));
		
		g2d.drawLine((int)(f1.getX() + 960), (int)(f1.getY() + 540), (int)(f2.getX() + 960), (int)(f2.getY() + 540));
		g2d.drawLine((int)(f1.getX() + 960), (int)(f1.getY() + 540), (int)(f3.getX() + 960), (int)(f3.getY() + 540));
		g2d.drawLine((int)(f2.getX() + 960), (int)(f2.getY() + 540), (int)(f4.getX() + 960), (int)(f4.getY() + 540));
		g2d.drawLine((int)(f3.getX() + 960), (int)(f3.getY() + 540), (int)(f4.getX() + 960), (int)(f4.getY() + 540));
		
		g2d.drawLine((int)(f5.getX() + 960), (int)(f5.getY() + 540), (int)(f6.getX() + 960), (int)(f6.getY() + 540));
		g2d.drawLine((int)(f5.getX() + 960), (int)(f5.getY() + 540), (int)(f7.getX() + 960), (int)(f7.getY() + 540));
		g2d.drawLine((int)(f6.getX() + 960), (int)(f6.getY() + 540), (int)(f8.getX() + 960), (int)(f8.getY() + 540));
		g2d.drawLine((int)(f7.getX() + 960), (int)(f7.getY() + 540), (int)(f8.getX() + 960), (int)(f8.getY() + 540));
		
		g2d.drawLine((int)(f1.getX() + 960), (int)(f1.getY() + 540), (int)(f5.getX() + 960), (int)(f5.getY() + 540));
		g2d.drawLine((int)(f2.getX() + 960), (int)(f2.getY() + 540), (int)(f6.getX() + 960), (int)(f6.getY() + 540));
		g2d.drawLine((int)(f3.getX() + 960), (int)(f3.getY() + 540), (int)(f7.getX() + 960), (int)(f7.getY() + 540));
		g2d.drawLine((int)(f4.getX() + 960), (int)(f4.getY() + 540), (int)(f8.getX() + 960), (int)(f8.getY() + 540));
		

		Point3D origin = new Point3D(0, 0, 0);
		Point3D xAxis = new Point3D(500, 0, 0);
		Point3D yAxis = new Point3D(0, -500, 0);
		Point3D zAxis = new Point3D(0, 0, 500);

		g2d.setColor(new Color(255, 0, 0));
		g2d.drawLine((int)project(origin).getX() + 960, (int)project(origin).getY() + 540, (int)project(xAxis).getX() + 960, (int)project(xAxis).getY() + 540);
		
		g2d.setColor(new Color(0, 255, 0));
		g2d.drawLine((int)project(origin).getX() + 960, (int)project(origin).getY() + 540, (int)project(yAxis).getX() + 960, (int)project(yAxis).getY() + 540);
		
		g2d.setColor(new Color(0, 0, 255));
		g2d.drawLine((int)project(origin).getX() + 960, (int)project(origin).getY() + 540, (int)project(zAxis).getX() + 960, (int)project(zAxis).getY() + 540);
		
	}
	
	public static void tick() throws AWTException {
/*		Double x = a.getX() - c.getX();
		Double y = a.getY() - c.getY();
		Double z = a.getZ() - c.getZ();
		
		d.setX(Math.cos(o.getY()) * (Math.sin(o.getZ()) * y) + Math.cos(o.getZ()) * x - Math.sin(o.getY()) * z);
		d.setY(Math.sin(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) + Math.cos(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		d.setZ(Math.cos(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) - Math.sin(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		
		b.setX((e.getZ() / d.getZ()) * d.getX() - e.getX());
		b.setX((e.getZ() / d.getZ()) * d.getY() - e.getY());
*/
		f1 = project(a1);
		f2 = project(a2);
		f3 = project(a3);
		f4 = project(a4);
		
		f5 = project(a5);
		f6 = project(a6);
		f7 = project(a7);
		f8 = project(a8);
		
//		c.setX(c.getX()+.01);
//		c.setY(c.getY()+.01);
//		c.setZ(c.getZ()-.01);
		
		mouseX = MouseInfo.getPointerInfo().getLocation().getX() - 800;
		mouseY = MouseInfo.getPointerInfo().getLocation().getY() - 450;
		
		o.setY(o.getY() + mouseX * .001);
		o.setX(o.getX() - mouseY * .001);
		
		if(o.getX() >= 2 * Math.PI) o.setX(0);
		if(o.getX() < 0) o.setX(2 * Math.PI + o.getX());
		if(o.getY() >= 2 * Math.PI) o.setY(0);
		if(o.getY() < 2 * 0) o.setY(2 * Math.PI + o.getY());
		Robot rbt = new Robot();
		rbt.mouseMove(800, 450);
		
		System.out.println(o.getY());
		
		if(keyW) {
			Graphics3D.c.setZ(Graphics3D.c.getZ() + 5 * Math.cos(o.getY()));
			Graphics3D.c.setX(Graphics3D.c.getX() + 5 * Math.sin(o.getY()));
		}
		
		if(keyA) {
			Graphics3D.c.setZ(Graphics3D.c.getZ() + 5 * Math.sin(o.getY()));
			Graphics3D.c.setX(Graphics3D.c.getX() - 5 * Math.cos(o.getY()));
		}
		
		if(keyS) {
			Graphics3D.c.setZ(Graphics3D.c.getZ() - 5 * Math.cos(o.getY()));
			Graphics3D.c.setX(Graphics3D.c.getX() - 5 * Math.sin(o.getY()));
		}
		
		if(keyD) {
			Graphics3D.c.setZ(Graphics3D.c.getZ() - 5 * Math.sin(o.getY()));
			Graphics3D.c.setX(Graphics3D.c.getX() + 5 * Math.cos(o.getY()));
		}
		
		if(keySpace) {
			Graphics3D.c.setY(Graphics3D.c.getY() - 5);
		}
		
		if(keyShift) {
			Graphics3D.c.setY(Graphics3D.c.getY() + 5);
		}
		
		
		
	}
	
	public static void render() {
		Window.frame.repaint();
		
	}
	
	public static Point2D project(Point3D a) {
		Double x = a.getX() - c.getX();
		Double y = a.getY() - c.getY();
		Double z = a.getZ() - c.getZ();
		
		Point2D b = g3d.new Point2D();
		
		d.setX(Math.cos(o.getY()) * (Math.sin(o.getZ()) * y) + Math.cos(o.getZ()) * x - Math.sin(o.getY()) * z);
		d.setY(Math.sin(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) + Math.cos(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		d.setZ(Math.cos(o.getX()) * (Math.cos(o.getY()) * z + Math.sin(o.getY()) * (Math.sin(o.getZ()) * y + Math.cos(o.getZ()) * x)) - Math.sin(o.getX()) * (Math.cos(o.getZ()) * y - Math.sin(o.getZ()) * x));
		
		System.out.println(d.getZ() + "; " + d.getX());
//		b.setX((e.getZ() / d.getZ()) * d.getX() - e.getX());
//		b.setY((e.getZ() / d.getZ()) * d.getY() - e.getY());
		
		b.setX(e.getZ() * d.getX() / d.getZ());
		b.setY(e.getZ() * d.getY() / d.getZ());
		
		return b;
		
	}
	
}
