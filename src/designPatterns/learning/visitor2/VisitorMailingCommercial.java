package designPatterns.learning.visitor2;

public class VisitorMailingCommercial implements Visitor<Object> {
  
public void visit(SocieteSansFiliale societe)
  {
    // je n'envoie qu'un email pour les societes sans filiales
	  System.out.println("Envoi d'un email " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre societe  (sans filiale) ");
    System.out.println("----");
    
  }

  public void visit(SocieteMere societe)
  {
     // j'envoie un email et un imprime pour les societes groupes
	  System.out.println("Envoi d'un email  " +
      societe.getNom() + " adresse : " + societe.getEmail
      () + " Proposition commerciale pour votre groupe ");
    System.out.println("Impression d'un courrier  " +
      societe.getNom() + " adresse : " +
      societe.getAdresse() + 
      " Proposition commerciale pour votre groupe");
    System.out.println("-----");
  }
}
