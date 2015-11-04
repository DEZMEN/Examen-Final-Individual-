
package Abstracta;


public  abstract class Principal {
 
private String Pais, continente;    

    public Principal(String Pais, String continente) {
        this.Pais = Pais;
        this.continente = continente;
    }
    
    
    
   public abstract String continente(); 
 
    
   public abstract String independencia(); 
    
 
   public abstract String capital(); 

}
