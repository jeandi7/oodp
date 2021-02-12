package designPatterns.learning.visitor2;

// le component

public interface Societe extends Visitable {
  public String getNom();
  public  void setNom(String nom);
  public String getEmail();
  public void setEmail(String email);
  public String getAdresse();
  public  void setAdresse(String adresse);
  public abstract boolean ajouteFiliale(Societe filiale);
}
