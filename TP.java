
public class TP {
	
	public static void main(String[] args) {
		Vehicule V1= new Vehicule("Clio",2002,2400,"ET070DZ",'B');
		V1.afficherVehicule();
		System.out.println("Age du vehicule : " + V1.age() + " ans");
		
		Voiture V2= new Voiture("Twingo",2019,10000,"AB-123-CD",'B',true);
		V2.afficherVoiture();
		
		Camion C1= new Camion("J9",2008,20000,"1234-AB-56",'B',25);
		int vol=7;
		System.out.println("Le camion J9 peut-il transporter " + vol + " ? : " + C1.peutTransporterVolume(vol));
		
		System.out.println("Le cout de location de la Clio est : " + V2.coutLocation());
		System.out.println("Le cout de location du J9 est : " + C1.coutLocation());
		
		Autocars A1= new Autocars("FRI",2005,90000,"123-AB-45",'D',3,53);
		double vol2=0.1;
		int nbpass=53;
		System.out.println("L'autocar FRI peut-il transporter " + vol2 + " et " + nbpass + " ? : " + A1.peutTransporterPassagers(nbpass, vol2));
	}	
}
