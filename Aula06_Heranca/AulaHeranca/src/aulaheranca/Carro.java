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
    
    public Carro( int nPortas){
        super();
        this.nPortas = nPortas;
    }
    
    public Carro(String modelo, int nPortas){
    //    this.modelo = modelo;
        super(modelo);
        this.nPortas = nPortas;
    }
    
    public Carro(int nPortas, String placa){
        super();
        this.placa = placa;
        this.nPortas = nPortas;
    }
    
    public void andar(){
        System.out.println("O carro andou");
    }
    public void andar(int km){
        System.out.println("O carro andou " + (km * 1000)  + " metros");
    }
    
    public void andar(double km){
        System.out.println("O carro andou " + (km * 100000)  + " centímetros");
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

    @Override
    public double getConsumo(int km) {
        return (km / 15); 
    }
    
    @Override
    public double getConsumo(double km) {
        return ( super.getConsumo(km) * 3 / 2) ; 
    }
    
    
   
}
