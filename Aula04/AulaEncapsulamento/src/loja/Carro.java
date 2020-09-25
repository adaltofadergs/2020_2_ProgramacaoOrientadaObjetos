package loja;

import javax.swing.JOptionPane;


public class Carro {
    
    public static final double CAPACIDADE_MAXIMA = 100.0;
    
    private int id;
    public String marca;
    protected String modelo;
    private double capacidadeTanque;
    private double qtdCombustivel;
    
    public Carro(){
        System.out.println("Carro construído");
    }
    
    public Carro(String marca, String modelo, double capacidadeTanque){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.qtdCombustivel = 0.0;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void cadastrar(){
        if ( this.id > 0 ) {
            String texto = "Este carro já está cadastrado";
            JOptionPane.showMessageDialog( null, texto);
            
        }else{
            String texto = "O carro com a marca " + this.marca + " e modelo " + 
                    this.modelo + " foi cadastrado com sucesso!";
            JOptionPane.showMessageDialog( null, texto);
            this.id = (int)  (Math.random() * 1000 + 1);
        }
    }
    
    public double abastecer( double qtd ){
        double espaco = this.capacidadeTanque - this.qtdCombustivel;
        if( espaco >= qtd ) {
            espaco = espaco - qtd;
        }else{
            JOptionPane.showMessageDialog(null, "Espaço insuficiente");
        }
        return espaco;
    }
    
    
    public static double calcularConsumo(double km, double litros){
        double consumo = km / litros;
        return consumo;
    }
    
}
