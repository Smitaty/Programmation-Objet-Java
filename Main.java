
public class Main {
	public static void main(String[] args) {
		Batiment B = new Batiment("123 rue bonjour",35);
		Batiment B2 = new Batiment("ABC",19);
		Batiment B3 = new Batiment("DEF",70);
		Maison M = new Maison("456 rue Aurevoir",30,10,100);
		Immeuble I = new Immeuble("Wallah",60,20);
		Quartier Q = new Quartier();

		Batiment tab[] = new Batiment[3];		
		tab[0]=B;
		tab[1]=B2;	
		tab[2]=B3;

		System.out.println(B);
		System.out.println(M);
		System.out.println(I);
		System.out.println("\n");

		for (int i=0;i<tab.length;++i){
			System.out.println(tab[i]);
		}

		System.out.println("\n");
		Q.ajoutBatiment(B);
		Q.ajoutBatiment(B2);
		Q.ajoutBatiment(B3);

		for (int i=0;i<Q.getTAB().length;++i){
			if(Q.getTAB()[i]!=null)System.out.println(Q.getTAB()[i]);
		}

		System.out.println("\n");
		System.out.println("La catégorie du batiment " + B.getAdresse() + " est " + B.categorie());
		System.out.println("\n");
		Q.afficherBatiments(2);
		System.out.println("\n");
		System.out.println("Le plus grand Batiment est : " + B.comparer(B2));
		System.out.println("\n");
		System.out.println("Le plus grand Batiment du quartier est : " + Q.plusGrandBatiments());
	}
}
