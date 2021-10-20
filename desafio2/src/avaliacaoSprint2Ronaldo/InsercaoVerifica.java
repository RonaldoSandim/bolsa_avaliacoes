
package avaliacaoSprint2Ronaldo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class InsercaoVerifica {	

	public static void main(String[] args) throws SQLException {

		Scanner ler = new Scanner(System.in);
		ConnectionFactory factory= new ConnectionFactory();
		
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/desafiobolsa?useTimezone=true&serverTimezone=UTC",
						"root", "");
		PreparedStatement stm = (PreparedStatement) connection.createStatement();
		stm.execute("insert into produto (nome, descricao, desconto, dataInicio, dataFim) values(?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		
		
        Statement stmt = connection.createStatement();
	     //rst.setString(Produto.getNome());
	           /* stmt.setString(2,  usuario.getDescricao());
	            stmt.setString(3, usuario.getEmail());
	            stmt.setString(4, usuario.getTelefone());
	            stmt.execute();
	            stmt.close();*/
	    
			ResultSet rst = stm.getResultSet();

			Integer idproduto = rst.getInt("idproduto");
			
			String nome=rst.getString("nome");
			 nome=ler.nextLine();
			
			String descricao=rst.getString("descricao");
			 descricao=ler.nextLine();	

			 String desconto= rst.getString("desconto");
		 desconto=ler.nextLine();	
			
			String dataInicio=rst.getString("dataInicio");
			dataInicio = ler.nextLine();			
			
			System.out.println("data de fim");
			String dataFim=rst.getString("dataFim");

				System.out.println(connection+"ok, inseriu !!!!");
				connection.close();
	
	}
}



