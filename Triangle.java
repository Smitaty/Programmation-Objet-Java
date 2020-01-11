
public class Triangle extends Polygone implements Translation {
	
	public Triangle(Point p1,Point p2,Point p3) {
		point.add(p1);
		point.add(p2);
		point.add(p3);
	}

	public String toString() {
		return "Triangle [point=" + point + ", perimetre()=" + perimetre()
				+ "]";
	}
}
