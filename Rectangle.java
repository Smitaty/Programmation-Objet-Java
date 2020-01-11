
public class Rectangle extends Polygone implements Translation {

	public Rectangle(Point p1,Point p2,Point p3,Point p4) {
		point.add(p1);
		point.add(p2);
		point.add(p3);
		point.add(p4);
	}

	public String toString() {
		return "Rectangle [point=" + point + ", perimetre()=" + perimetre()
				+ "]";
	}
	
	
}
