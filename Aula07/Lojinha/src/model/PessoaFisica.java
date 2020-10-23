package model;

import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class PessoaFisica extends Cliente{
    
    public String cpf;
    
    public PessoaFisica(){
        super();
    }
    public PessoaFisica(int id) {
        this.id= id;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public void imprimir() {
        String texto = "Nome: " + this.nome + "\nTelefone: " + this.telefone + 
                "\nCPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto);
      
        
    }
    
   
    
}
