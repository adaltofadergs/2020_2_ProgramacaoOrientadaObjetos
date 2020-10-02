package aulaheranca;

/**
 *
 * @author adaltoss
 */
public class AulaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Carro c1 = new Carro();
        c1.nPortas = 5;
        c1.modelo = "Doblo";
        c1.cadastrar();
       // c1.imprimir();
       
        Moto m1 = new Moto("Biz", 125);
        m1.imprimir();
        
        
    }
    
}
