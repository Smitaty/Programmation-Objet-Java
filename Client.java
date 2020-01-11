package program;
public class Client {


	private int NumeroClient;
	private String Nom;
	private double Solde;
	private static int cptClient=0;
	
	public Client(String nom) {
		this.NumeroClient=Client.cptClient;
		this.Nom = nom;
		this.Solde=0;
		++cptClient;
	}

	public int getNumeroClient() {
		return NumeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		NumeroClient = numeroClient;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public double getSolde() {
		return Solde;
	}

	public void setSolde(double solde) {
		Solde = solde;
	}

	public static int getCptClient() {
		return cptClient;
	}

	public static void setCptClient(int cptClient) {
		Client.cptClient = cptClient;
	}

	@Override
	public String toString() {
		return "Client [NumeroClient=" + NumeroClient + ", Nom=" + Nom
				+ ", Solde=" + Solde + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		return true;
	}
}


