
package projetointegradorativ4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   private Connection conexao;
   
     public Connection getConexao() {
        return conexao;
    }
   
   public void conectar (){
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/cenaflix","root","Amora2702.");
           System.out.println("Sucesso de conexão!");
       
       } catch (ClassNotFoundException e){
           System.out.println("Falha ao carregar a classe de conexão. Classe não encontrada!");
       } catch (SQLException ex) {
           System.out.println("Falha ao conectar com o banco. Erro de SQL.");
       }
   }

   
   public void desconectar() {
       try {
           if(conexao != null && !conexao.isClosed()) {
               conexao.close();
           System.out.println("Desconectado com sucesso!");
           }
       } catch (SQLException e){
           System.out.println("Erro ao desconectar1");
       }
   }

}
