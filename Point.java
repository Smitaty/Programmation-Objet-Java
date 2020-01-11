
public class Point implements Translation {
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	private double x;
	private double y;
	
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

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void translation(double Vx,double Vy){
		this.x=this.x+Vx;
		this.y=this.y+Vy;
	}
}
