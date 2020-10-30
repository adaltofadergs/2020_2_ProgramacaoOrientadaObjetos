package projetoclasseabtrata;

/**
 *
 * @author adaltoss
 */
public class ProjetoClasseAbtrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  Animal a = new Animal();
      
//        Mamifero m = new Mamifero();
//        m.cadastrar();

        Elefante e = new Elefante();
        e.cadastrar();
        
        Elefante e2 = new Elefante();
        
        Coruja c = new Coruja();
        System.out.println("Coruja ponhou " + c.ponhar() + " ovos" );
        
        
        
    }
    
    
    
}
