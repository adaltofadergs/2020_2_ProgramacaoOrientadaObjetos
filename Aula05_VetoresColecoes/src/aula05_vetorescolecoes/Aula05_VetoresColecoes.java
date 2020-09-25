package aula05_vetorescolecoes;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adaltoss
 */
public class Aula05_VetoresColecoes {

   
    public static void main(String[] args) {
        
        int idades[];
        double[] alturas;
        
        idades = new int[5];
        alturas = new double[5];
        
        String nomes[] = new String[5];
        
        idades[0] = 25;
        alturas[0] = 1.75;
        nomes[0] = "João";
        
        idades[1] = 11;
        alturas[1] = 1.3;
        nomes[1] = "Júlia";
        
        for( int i = 0; i < 5; i++){
            System.out.println("Nome: " + nomes[i] );
            System.out.println("Idade: " + idades[i] );
            System.out.println("Altura: " + alturas[i] );
        }
        
        int[][] valores = new int[3][2];
        
        int cont = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                valores[i][j] = cont;
                cont ++;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print( valores[i][j] + "  -  ");
            }
            System.out.println( "\n---------------");
        }


        Collection<String> listaNomes = new ArrayList<>();
        listaNomes.add("Adalto");
        listaNomes.add("Maria");
        listaNomes.add("Júlia");
        
        System.out.println("Tamanho da Coleção: " + listaNomes.size() );
        
        for (String nome : listaNomes ) {
            System.out.println( nome );
        }
        
        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        Pessoa p = new Pessoa();
        p.nome = "João";
        p.idade = 45;
        
        pessoas.add( p );
        
        Pessoa p2 = new Pessoa();
        p2.nome = JOptionPane.showInputDialog("Informe o nome: ");
        p2.idade = Integer.valueOf(  JOptionPane.showInputDialog("Informe a idade:")  );
        
        pessoas.add( p2 );

        for ( Pessoa vivente : pessoas ) {
            System.out.println( vivente );
        }
        
        System.out.println("------'nPrimeiro: " + pessoas.get(0).nome);
        
    }
    
}
