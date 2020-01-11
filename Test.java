
public class Test {
	public static void main(String[] args) {
		
		Polygone P = new Polygone();
		Point P1 = new Point(5.0,2.0);
		Point P2 = new Point (10.0,4.0);
		Point P3 = new Point (1.0,6.0);
		Point P4 = new Point (3.0,7.0);
		P.point.add(P1);
		P.point.add(P2);
		P.point.add(P3);
		P.point.add(P4);
		Cercle C = new Cercle(P1,2.0);
		Rectangle R = new Rectangle(P1,P2,P3,P4);
		Triangle T = new Triangle(P1,P2,P3);
		
		FormeGeometrique Tab[] = new FormeGeometrique[10];
		Tab[0]=R;
		Tab[1]=T;
		Tab[2]=C;
		
		System.out.println("Forme de base : ");
		System.out.println(R);
		System.out.println(C);
		System.out.println(T);
		
		double Vx=1.0;
		double Vy=2.0;
		
		P.translation(Vx, Vy);
		System.out.println("Cercle translaté : ");
		System.out.println(C);
		System.out.println("Rectangle translaté : ");	
		System.out.println(R);
		System.out.println("Triangle translaté : ");
		System.out.println(T);
		
		
	}
}
