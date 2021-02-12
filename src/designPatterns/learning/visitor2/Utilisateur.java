package designPatterns.learning.visitor2;


public class Utilisateur
{

  public static void main(String[] args)
  {
    Societe societe1 = new SocieteSansFiliale("oodrive-societe1",
      "info@oodrive-societe1.com", "26 rue du faubourg poissoniere 75010 PARIS");
    Societe societe2 = new SocieteSansFiliale("oodrive-societe2",
      "info@oodrive-societe2.com", "10 rue Stella, 69002 LYON");
    Societe groupe1 = new SocieteMere("oodrive-groupe1", 
      "info@oodrive-groupe1.com", "26 rue du faubourg poissoniere 75010 PARIS");
    groupe1.ajouteFiliale(societe1);
    groupe1.ajouteFiliale(societe2);
    
    Societe societe3 = new SocieteSansFiliale("oodrive-societe",
      "info@oodrive-societe3.com", "Maximiliansplatz 17 80333 Munich");
    Societe groupe2 = new SocieteMere("groupe2", 
      "info@oodrive-groupe2.com", "Maximiliansplatz 15 80333 Munich");
    groupe2.ajouteFiliale(groupe1);
    groupe2.ajouteFiliale(societe3);
    
   
    VisitorMailingCommercial v = new VisitorMailingCommercial();
    groupe2.accept(v);
   
    
  }
}
