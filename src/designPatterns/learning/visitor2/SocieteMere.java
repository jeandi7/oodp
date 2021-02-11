package designPatterns.learning.visitor2;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere implements Societe
{
	protected String nom, email, adresse;
	protected List<Societe> filiales =  new ArrayList<Societe>();
	
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

    public SocieteMere(String nom, String email, String adresse) {
	    this.setNom(nom);
	    this.setEmail(email);
	    this.setAdresse(adresse);
	}

    public <R> void accept(Visitor<R> visiteur) {
    visiteur.visit(this);
    for (Societe filiale: filiales)
      filiale.accept(visiteur);
    }

   public boolean ajouteFiliale(Societe filiale) {
    return filiales.add(filiale);
  }
   
   
}
