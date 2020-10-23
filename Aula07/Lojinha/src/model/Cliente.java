package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Cliente {
    
    public int id;
    public String nome, telefone;
    protected String endereco;
    private String email;

    public Cliente() {
        
    }
    
   
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public void imprimir(){
        String texto = "Nome: " + this.nome + "\nTelefone: " + this.telefone;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    private void imprimirEmail(){
        String texto = "Email: " + this.email ;
        JOptionPane.showMessageDialog(null, texto);
    }
   
    
}
