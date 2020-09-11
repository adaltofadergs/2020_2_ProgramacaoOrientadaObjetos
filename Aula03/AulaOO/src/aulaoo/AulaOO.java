
package aulaoo;

/**
 *
 * @author adaltoss
 */
public class AulaOO {

   
    public static void main(String[] args) {
        
        Produto prod = new Produto("Doblo", "Fiat");
        prod.quantidade = 1.0;
        
        System.out.println("Marca: " + prod.marca + "\nModelo: " + 
                prod.modelo + "\nQuantidade: " + prod.quantidade);
        
        Produto p2 = new Produto();
        
        p2.setCodigo(15);
        
        int x = p2.getCodigo() * 2;
        
        System.out.println("----------\nCódigo: " + x );
        
        // ---------------------------------------------


        Produto p3 = new Produto("Novo Uno", "Fiat", 25000.99);
        p3.imprimir();
        p3.codigo = 10;
        p3.modelo = "Corolla";
        p3.setMarca("Toyota");
        p3.imprimir();

        
         
    }
 
    
}
