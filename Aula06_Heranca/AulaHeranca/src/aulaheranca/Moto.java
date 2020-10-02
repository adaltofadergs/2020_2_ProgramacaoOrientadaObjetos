package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Moto extends Veiculo{
    public int cilindradas;
    
    public Moto(){
        
    }
    
    public Moto(String modelo, int cilindradas){
        super(modelo);
        this.cilindradas = cilindradas;
        
    }

    @Override
    public void imprimir() {
         String t = "Moto: " + this.modelo + " que tem " + 
                this.cilindradas + " cilindradas, cadastrada!";
        JOptionPane.showMessageDialog(null, t );
   
    }
    
}
