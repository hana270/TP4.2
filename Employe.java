package heritagetp_2;

public class Employe extends Salaire{
private double Hsupp;
private double PHsupp;

public Employe(double Hsupp,double PHsupp,int matricule,String nom,double recrutement) {
	super(matricule,nom,recrutement);
	this.Hsupp=Hsupp;
	this.PHsupp=PHsupp;
}
public void setHsupp(Double d) {
	this.Hsupp = d;
}
public double getHsupp() {
	return Hsupp;
}

public void setPHsupp(Double d) {
	this.PHsupp = d;
}
public double getPHsupp() {
	return PHsupp;
}
@Override
public String toString() {
	return super.toString()+ " heures supp ="+Hsupp+"  le taux de rémunération ="+PHsupp;
}
public void afficher() {	
	System.out.println(this.getClass().getSimpleName()+"  "+toString());
	
}

public double salaire() {
	return super.salaire()+(PHsupp*Hsupp);
}
}
