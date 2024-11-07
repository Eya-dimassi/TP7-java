package tp7;

public class AssietteRonde extends Assiette{
	private double rayon ;
	public AssietteRonde(int annee, double rayon) {
		super(annee);
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

    public double surface() {
		
		return 3.14 * rayon * rayon;
		
	}
    public double ValeurTotale() {
    	return super.ValeurTotale();
    }
	
	

	
	

}
