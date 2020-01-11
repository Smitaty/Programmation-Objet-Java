
public class Voiture extends Vehicule {
	private boolean autoradio;

	public Voiture(String model, int dachat, double pachat,String immatri,char permi,boolean autoradio) {
		super(model, dachat, pachat,immatri,permi);
		this.autoradio = autoradio;
	}

	public void ajouterAutoradio(){
		this.autoradio=true;
	}

	public void enleverAutoradio(){
		this.autoradio=false;
	}

	public void afficherVoiture(){
		super.afficherVehicule();
		System.out.println("Présence d'autoradio : " + this.autoradio);
	}
}
