
package avaliacaoSprint2Ronaldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoVerifica {

	public static void main(String[] args) throws SQLException  {

		Connection connection = DriverManager
		.getConnection("jdbc:mysql://localhost/desafiobolsa?useTimezone=true&serverTimezone=UTC",
				"root", "");
		connection.close();
	}
	
}
