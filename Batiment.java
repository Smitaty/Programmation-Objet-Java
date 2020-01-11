public class Batiment {
	private String adresse;
	private int surfaceHabitable;

	public Batiment(String adresse, int surfaceHabitable) {
		this.adresse = adresse;
		this.surfaceHabitable = surfaceHabitable;
	}

	public String toString() {
		return "Batiment [adresse=" + adresse + ", surfaceHabitable="
				+ surfaceHabitable + "]";
	}

	public int categorie(){
		if(this.surfaceHabitable<30) return 1;
		else if(this.surfaceHabitable<=70 && this.surfaceHabitable>=30) return 2;
		else return 3;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getsurfaceHabitable() {
		return surfaceHabitable;
	}
	
	public Batiment comparer(Batiment B){
			if(this.surfaceHabitable>=B.surfaceHabitable) return this;
			else return B;
		}

}