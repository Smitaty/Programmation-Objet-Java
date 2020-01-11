package test;
import program.Annuaire;
import program.Client;
public class Test2 {
	public static void main(String[] args) {
		Client C1 = new Client ("Fournier");
		Client C2 = new Client ("Fournier");
		
		Annuaire annuaire2 = new Annuaire();
		annuaire2.ajoutClient(C1.getNom());
		System.out.println(annuaire2.contient(C2));
		C1.equals(C2);
		System.out.println(annuaire2.contient(C2));
	}
}
