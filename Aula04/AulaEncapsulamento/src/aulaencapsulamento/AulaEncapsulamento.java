package aulaencapsulamento;

import loja.Carro;

/**
 *
 * @author adaltoss
 */
public class AulaEncapsulamento {

    public static void main(String[] args) {
        int x = 0;
        int y;
        y = 0;
        Carro c2 = new Carro();
        Carro c1 = new Carro("Fiat", "Novo Uno", 48.0);
        
        c1.cadastrar();
        System.out.println("id: " + c1.getId());
        c1.cadastrar();
        System.out.println("id: " + c1.getId());
        
        Carro c3 = new Carro("WV" , "Kombi", 50.0);
        c3.cadastrar();
        System.out.println("id: " + c3.getId());
    }
    
}
