package aulaoo;

import javax.swing.JOptionPane;



/**
 *
 * @author adaltoss
 */
public class Produto {
    
    // Atributos
    public int codigo;
    public String marca , modelo;
    public double preco;
    public Double quantidade;
    public boolean perecivel;
    
    
    // Métodos Get e Set
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String _marca){
        marca = _marca;
    }
    
    
    //Métodos Construtores
    
    public Produto(){
 //       System.out.println("Objeto criado");
    }
    
    public Produto(String _marca){
        this.marca = _marca;        
    }
    
    public Produto(String modelo, String marca ){
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public Produto(String modelo, String marca , double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    public Produto(double preco, String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    
    
    public void imprimir(){
        String texto = "Marca: " + this.marca + "\n" + 
                       "Modelo: " + modelo + "\n" + 
                       "Preço: " + preco ;
        
        JOptionPane.showMessageDialog( null , texto );
        
    }
    
    
}
