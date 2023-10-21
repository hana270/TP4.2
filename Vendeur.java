package heritagetp_2;

public class Vendeur extends Salaire{
	private double vente;
	private double pourcentage;
	
	public Vendeur(int matricule,String nom,double recrutement,double vente,double pourcentage) {
		super(matricule,nom,recrutement);
		this.vente=vente;
		this.pourcentage=pourcentage;
	}

	public double getVente() {
		return vente;
	}

	public void setVente(double vente) {
		this.vente = vente;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}
@Override
public String toString() {
	return super.toString()+ " vente ="+vente+" de pourcentage ="+pourcentage;
	
}
public void afficher() {
	
	System.out.println(this.getClass().getSimpleName()+"  "+toString());
}
public double salaire() {
	return super.salaire()+(vente*pourcentage);
}
}
