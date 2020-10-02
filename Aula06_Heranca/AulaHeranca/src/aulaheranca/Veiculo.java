package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Veiculo {
    
    public int id;
    public String modelo;
    public String placa;
    protected String marca;
    private String chassi;
    
    public Veiculo(){
        
    }
    
    public Veiculo(String modelo){
        this.modelo = modelo;
    }
    
    public void cadastrar(){
        
        JOptionPane.showMessageDialog(null,  "Veículo " + this.modelo + " cadastrado!");
        
        System.out.println("Veículo " + this.modelo + " cadastrado!");
        
    }
    
    public void imprimir(){
        String t = "Veículo: " + this.modelo;
        JOptionPane.showMessageDialog(null, t );
                
    }
    
    
}
