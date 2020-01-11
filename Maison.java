
public class Maison extends Batiment {
	private int nbPiece ;
	private int surfaceJardin ;

	public Maison(String adresse, int surfaceHabitable, int nbPiece, int surfaceJardin) {
		super(adresse, surfaceHabitable);
		this.nbPiece = nbPiece;
		this.surfaceJardin = surfaceJardin;
	}

	public String toString() {
		return "Maison [nbPiece=" + nbPiece + ", surfaceJardin="
				+ surfaceJardin + "]";
	}	
}
