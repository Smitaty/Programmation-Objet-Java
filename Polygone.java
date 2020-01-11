import java.util.ArrayList;

public class Polygone extends FormeGeometrique{
	
	ArrayList<Point> point = new ArrayList<Point>();
	
	public double distance(Point p1,Point p2) {
		return(Math.sqrt(Math.pow((p2.getX()-p1.getX()),2) + Math.pow((p2.getY()-p1.getY()),2)));
	}
	
	public double perimetre() {
		double res=0;
		for(int i=0;i<point.size();++i) {
			res= res+distance(point.get(i),point.get((i+1)%point.size()));
		}
		return res;
	}
	
	public int taille() {
		return point.size();
	}
	
	public void translation(double Vx,double Vy) {
		for(int i=0;i<this.taille();++i){
			point.get(i).setX(point.get(i).getX()+Vx);
			point.get(i).setY(point.get(i).getY()+Vy);
		}
	}
}
