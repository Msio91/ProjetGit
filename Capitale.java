/*blablabla*/ 
/*oh oh oh*/
public class Capitale {
	
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	public Capitale(String unNom, int unNbHabitant, int uneSuperficie) {
		   
		this.nom = unNom;
		this.nbHabitants =unNbHabitant;
		this.superficie =uneSuperficie;
		
	}
  public String getNom(){
	  return this.nom;
	
  } 
  public void setNom(String unNom){
	  this.nom =unNom;
  }

  public int getNbHabitants(){
	  return this.nbHabitants;
  }
  public void setNom(int unNbHabitants){
	  this.nbHabitants = unNbHabitants;
  }

  public int getSuperficie(){
	  return this.superficie;
  }

  public void setSuperficie(int uneSuperficie){
	  this.superficie = uneSuperficie; 
  }
  
 public String toString(){
	 String chaine;
	 
	 chaine ="Nom :"+" "+this.nom;
	 chaine =chaine+ " "+"Nombre d'habitants : "+this.nbHabitants;
	 chaine = chaine +" "+"Superficie : "+ " "+this.superficie;
	 return chaine;
 }
 
	
  }
