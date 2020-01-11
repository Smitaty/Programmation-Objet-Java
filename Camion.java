
public class Camion extends Vehicule{
	private double volume;

	public Camion(String model, int dachat, double pachat,String immatri,char permi,double volume) {
		super(model, dachat, pachat,immatri,permi);
		this.volume = volume;
	}
	
	public boolean peutTransporterVolume(double vol){
		if(this.volume>=vol) return true;
		else return false;
	}
	
	public void afficherCamion(){
		super.afficherVehicule();
		System.out.println("Le volume du camion est : " + this.volume);
	}
}
