package designPatterns.learning.visitor2;

public class SocieteSansFiliale implements Societe
{
	protected String nom, email, adresse;
	public String getNom() { return nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}
	  
	public String getEmail() {
	    return email;
	}

	public void setEmail(String email) {
	    this.email = email;
	}
	  
    public String getAdresse() {
	    return adresse;
	}

	public void setAdresse(String adresse) {
	    this.adresse = adresse;
    }

    public SocieteSansFiliale(String nom, String email, String adresse) {
	    this.setNom(nom);
	    this.setEmail(email);
	    this.setAdresse(adresse);
	}
    
    public <R> void accept(Visitor<R> v) {
    	 v.visit(this);
    }

    public boolean ajouteFiliale(Societe filiale) {
        return false;
  }
  

}
