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
       // c1.cadastrar();
       // c1.imprimir();
       
        Moto m1 = new Moto("Biz", 125);
        //m1.imprimir();
        
        
        c1.andar();
        c1.andar(2);
        c1.andar( 2.0 );
        c1.getConsumo(30);
        
        int x = 1;
        double y = 1.0;
        
        
        y=x;
        
        if( x == y ){
            System.out.println("X é igual a Y");
        }else{
            System.out.println("São diferentes");
        }
        
        
        
        
    }
    
}
