package program;
import java.util.ArrayList;

public class Annuaire {
	private ArrayList<Client> client = new ArrayList<Client>();
	
	public void ajoutClient(String nom){
		client.add(new Client(nom));
	}

	public ArrayList<Client> getClient() {
		return client;
	}

	public void setClient(ArrayList<Client> client) {
		this.client = client;
	}
	
	public int taille() {
		return client.size();
	}

	public String toString() {
		return "Annuaire [client=" + client + "]";
	}
	
	public boolean contient(Client val) {
		for (int i=0;i<this.taille();++i) {
			if (client.get(i).getNom()==val.getNom()) return true;
		}
		return false;
	}
}
