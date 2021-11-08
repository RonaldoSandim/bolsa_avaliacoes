

package avaliacaoSprint2Ronaldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

public class Listar {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/desafiobolsa?useTimezone=true&serverTimezone=UTC",
						"root", "");
		
		try {
		Statement stm = connection.createStatement();
		stm.execute("select * from produto");
		
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			int idproduto=rst.getInt("idproduto");
			System.out.println(idproduto);

			String nome=rst.getString("nome");
			System.out.println(nome);
			
			String descricao=rst.getString("descricao");
			System.out.println(descricao);
			
			double desconto=rst.getDouble("desconto");
			System.out.println(desconto);
			
			String dataInicio=rst.getString("dataInicio");
			System.out.println(dataInicio);
			
			String dataFim=rst.getString("dataFim");
			System.out.println(dataFim);
		}
		}catch(SQLDataException  e) {
			System.out.println(e);
		}
				connection.close();
		
	}

}
