package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Carro extends Veiculo{
    
    public int nPortas;
    
    public Carro(){
    //    super();
    }
    public Carro(String modelo){
    //    this.modelo = modelo;
        super(modelo);
    }
    
    public Carro(String modelo, int nPortas){
    //    this.modelo = modelo;
        super(modelo);
        this.nPortas = nPortas;
    }

    @Override
    public void cadastrar() {
        super.cadastrar(); 
        String t = "Carro " + this.modelo + " que tem " + 
                this.nPortas + " portas, cadastrado!";
        System.err.println( t );
    }

    @Override
    public void imprimir() {
        String t = "Carro: " + this.modelo + "\n" +
                "Número de Portas: " + this.nPortas;
        JOptionPane.showMessageDialog(null, t );
                
    }
    
    
    
   
}
