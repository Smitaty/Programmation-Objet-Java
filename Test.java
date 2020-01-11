package test;
import program.Annuaire;
import util.Saisie;
public class Test {

	public static void main(String[] args) {
	
		Annuaire annuaire = new Annuaire();	
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){              
	
				String nom = Saisie.lireString("Quel est votre nom ?");
				annuaire.ajoutClient(nom);
				
			} else if (rep ==2){ 
				
				System.out.println("Le nombre de clients dans l'annuaire est : " + annuaire.taille());
		
	
			} else if (rep ==3){ 
					System.out.println(annuaire.getClient());
				
			} else if (rep ==4){ 
				
				int i=0;
				int num = Saisie.lireEntier("Donnez le numéro du client recherché :");
				while(i<annuaire.taille()){
					if(annuaire.getClient().get(i).getNumeroClient()==num) {
						System.out.println("Le client recherché est : " + annuaire.getClient().get(i));
						break;
					}
					else ++i;
				}
				if(i==annuaire.taille()) System.out.println("Le numéro de client recherché n'existe pas");
				
			} else if (rep ==5){ 
				
				int i=0;
				int taille = annuaire.taille();
				int num2 = Saisie.lireEntier("Donner le numéro à supprimer ");
				while(i<taille){
					if(annuaire.getClient().get(i).getNumeroClient()==num2) {
						System.out.println("Le client " + annuaire.getClient().get(i) + "a été supprimé");
						annuaire.getClient().remove(i);						
						break;
					}
					else ++i;
				}
				if(i==taille) System.out.println("Le numéro de client recherché n'existe pas");
				
			} else if (rep ==6){ 
				
				int num3 = Saisie.lireEntier("Donnez le numéro du client recherché :");
				double credit = Saisie.lireEntier("Donnez le montant à créditer :");
				int i = 0;
				while(i<annuaire.taille()) {
					if(annuaire.getClient().get(i).getNumeroClient()==num3) {
						annuaire.getClient().get(i).setSolde(credit);
						System.out.println(annuaire.getClient().get(i));
						break;
					}
					else ++i;
				}
				if(i==annuaire.taille()) System.out.println("Le numéro de client recherché n'existe pas");
				
			} else if (rep ==7){ 
				
				int i=0;
				double somme=0;
				while(i<annuaire.taille()) {
					somme=somme+annuaire.getClient().get(i).getSolde();
					++i;
				}
				System.out.println("Le total des soldes est : " + somme);
			}
		}
		
		
		
	}
}
