
public class Quartier {
	private Batiment TAB[]= new Batiment[5];

	public void ajoutBatiment(Batiment B){
		int i=0;
		while(TAB[i]!=null){
			++i;
		}
		if(i>TAB.length) System.out.println("Quartier plein");
		else TAB[i]=B;
	}

	public Batiment[] getTAB() {
		return TAB;
	}

	public void afficherBatiments(int cat){
		for(int i=0;i<TAB.length;++i){
			if(TAB[i]!=null && TAB[i].categorie()>=cat) System.out.println(TAB[i]);
		}
	}

	public Batiment plusGrandBatiments(){
		Batiment B=TAB[0];
		for(int i=0;i<TAB.length;++i){
			if(TAB[i]!=null){
				if(TAB[i].getsurfaceHabitable()>B.getsurfaceHabitable()) B=TAB[i];
			}
		}
		return B;
	}
}
