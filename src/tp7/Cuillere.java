package tp7;

public class Cuillere extends Utensile{
	private double longeur;
	

	public Cuillere(int annee,double longeur) {
		super(annee);
		this.longeur=longeur;
		
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}
	 public  double ValeurTotale() {
		 return super.ValeurTotale();
		 
	 }

	

}
