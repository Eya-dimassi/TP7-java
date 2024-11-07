package tp7;

public class AssietteCarree extends Assiette {
	private double cote;
	
	public AssietteCarree(int annee,double cote) {
		super(annee);
		this.cote=cote;
		
	}
	public double surface() {
		return  cote * cote;
	}
	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	public double ValeurTotale() {
		return 5*super.ValeurTotale();
		
	}
	

}
