package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author adaltoss
 */
public class ProdutoDAO {
    
    public static void inserir( Produto produto ){
        String query = "INSERT INTO produtos (nome, preco) VALUES ( "
                     + " '" + produto.nome +  "' , "
                     + "  " + produto.preco + " ) ";
        
        Conexao.executar( query );
    }
    
    public static void editar( Produto produto ){
        String query = "UPDATE produtos SET "
                     + " nome = '" + produto.nome +  "' , "
                     + " preco = " + produto.preco + "   "
                     + " WHERE id = " + produto.id ;
        
        Conexao.executar( query );  
    }
    
    
    public static void excluir( int idProduto ){
        String query = "DELETE produtos WHERE id = " + idProduto ;
        
        Conexao.executar( query );  
    }
    
    public static List<Produto> getProdutos(){
        List<Produto> listaDeProdutos = new ArrayList<>();
        
        String query = "SELECT id , nome, preco FROM produtos ORDER BY nome ";
        
        ResultSet rs = Conexao.consultar( query );
        
        if( rs != null ){
            
            try{
                while( rs.next() ){
                    
                    Produto prod = new Produto();
                    prod.id = rs.getInt( 1 );
                    prod.nome = rs.getString( 2 ) ;
                    prod.preco = rs.getDouble( 3 ) ;
                    
                    listaDeProdutos.add( prod );
                }
                
            }catch(Exception e){
                
            }
        }
        return listaDeProdutos;
    }
    
    
    
    
}
