package heritagetp_2;

public class Entreprise {

	public static void main(String[] args) {
		Salaire[] tabSalaire=new Salaire[5];
		
		Employe e1=new Employe(15.0,4.0,1234,"walid",2002.0);
		Employe e2=new Employe(19.0,5.0,87698,"Aymen",2003.0);
		Employe e3=new Employe(7.0,4.0,12345,"Khaled",2008.0);
		//e1.afficher();
		
		Vendeur v1=new Vendeur(23345,"Yessine",2007.0,1000.0,0.1);
		//v1.afficher();
		Vendeur v2=new Vendeur(6548,"Nassime",2000.0,1000.0,19.5);
		tabSalaire[0]=e1;
		tabSalaire[1]=v1;
		tabSalaire[2]=v2;
		tabSalaire[3]=e2;
		tabSalaire[4]=e3;
		System.out.println("*******************Liste des Employés*******************");
		for(int i=0;i<tabSalaire.length;i++) {
			if(tabSalaire[i] instanceof Employe) {
				tabSalaire[i].afficher();
			}
		}
		System.out.println("***************** **Liste des Vendeurs** *****************");
		for(int i=0;i<tabSalaire.length;i++) {
			if(tabSalaire[i] instanceof Vendeur) {
				tabSalaire[i].afficher();
			}
		}

	System.out.println("****************************** **Nom de Salairé le plus ancien** ***********************************");
		Salaire ancien=tabSalaire[0];
		for(int i=1 ; i<tabSalaire.length ;i++) {			
			if(ancien.getRecrutement() > tabSalaire[i].getRecrutement()) {
				ancien=tabSalaire[i];
			}
		}
		System.out.println("Nom: "+ancien.getNom()+" recruté en l'an "+ancien.getRecrutement());
	System.out.println("****************************** ** Matricule du vendeur disposant du plus grand salaire *** ***********************************");
	Salaire pgrand=null;
	for(int i=1 ; i<tabSalaire.length ;i++) {
		if(tabSalaire[i] instanceof Vendeur) {	
			if(pgrand==null) {
				pgrand=tabSalaire[i];
			}
			else if(pgrand.salaire()<tabSalaire[i].salaire()) {
				pgrand=tabSalaire[i];
			}		
		}
	}
	System.out.println("Matricule ="+pgrand.getRecrutement()+" de Salaire ="+pgrand.salaire());
	System.out.println("*********************************************************************************************************************************");
	}
}
