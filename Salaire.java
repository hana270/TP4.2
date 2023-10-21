package heritagetp_2;

public class Salaire {
	
protected int matricule;
protected String nom;
protected Double recrutement;

public Salaire(int matricule,String nom,Double recrutement) {
	this.matricule=matricule;
	this.nom=nom;
	this. recrutement= recrutement;	
}


public int getMatricule() {
	return matricule;
}


public void setMatricule(int matricule) {
	this.matricule = matricule;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public Double getRecrutement() {
	return recrutement;
}


public void setRecrutement(Double recrutement) {
	this.recrutement = recrutement;
}


@Override
public String toString() {
	return " de Matricule= " + matricule + ", Nom=" + nom + ", Recrutement=" + recrutement;
}
public void afficher() {
	System.out.println(toString());
}
protected double a=400;
protected double b=280;

public double salaire() {
	if(recrutement<2005) {
		return a;
	}else {
		return b;
	}
}
}
