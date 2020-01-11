
public class Cercle extends FormeGeometrique implements Translation {
	
	public Cercle(Point centre, double rayon) {
		super();
		this.centre = centre;
		this.rayon = rayon;
		this.nom="Cercle";
	}

	private Point centre;
	private double rayon;
	
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + ", nom=" + nom
				+ ", perimetre()=" + perimetre() + "]";
	}
	
	public double perimetre(){
		return (2*Math.PI*this.rayon);
	}
	
	public void translation(double Vx,double Vy){
		this.centre.setX(this.centre.getX()+Vx);
		this.centre.setY(this.centre.getY()+Vy);
	}
}
