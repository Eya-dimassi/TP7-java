package tp7;

abstract class Utensile  {
	protected int annee;

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Utensile(int annee) {
		this.annee = annee;
	}

	public double ValeurTotale() {
	    	int v;
	    	if(annee<50) {
	    		v=0;
	    		
	    	}else {
	    		v=2024-annee-50;
	    		
	    	}
	    	
	    	return v;
	    }
	

}
