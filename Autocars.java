
public class Autocars extends Camion{
	private int nbpassager;

	public Autocars(String model, int dachat, double pachat,String immatri,char permi,double volume, int nbpassager) {
		super(model, dachat, pachat,immatri,permi, volume);
		this.nbpassager = nbpassager;
	}
	
	public boolean peutTransporterPassagers(int nbpass,double vol){
		if((nbpass<=this.nbpassager) && (super.peutTransporterVolume(vol)==true)) return true;
		else return false;
	}
	
	public void afficherAutocar(){
		super.afficherCamion();
		System.out.println("Le nombre de passager pouvant être transporté est : " + this.nbpassager);
	}
}
