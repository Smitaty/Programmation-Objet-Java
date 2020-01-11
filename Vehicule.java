
public class Vehicule {
	private String modele;
	private int dateAchat;
	private double prixAchat;
	private String immatriculation;
	private char permis;

	public Vehicule(String model,int dachat,double pachat,String immatri,char permi){
		modele=model;
		dateAchat=dachat;
		prixAchat=pachat;
		immatriculation=immatri;
		permis=permi;
	}
	
	public int age(){
		return (2019-(this.dateAchat));
	}
	
	public void afficherVehicule(){
		System.out.println("Modèle du véhicule : " + this.modele);
		System.out.println("Année d'achat : " + this.dateAchat);
		System.out.println("Prix d'achat : " + this.prixAchat);
		System.out.println("Numéro d'immatriculation : " + this.immatriculation);
		System.out.println("Type du permis : " + this.permis);
	}
	
	public double coutLocation(){
		if(this.age()<=1) return (this.prixAchat/200);
		else return (this.prixAchat/250);
	}
}
