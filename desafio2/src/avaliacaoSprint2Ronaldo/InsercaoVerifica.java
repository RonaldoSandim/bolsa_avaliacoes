
package avaliacaoSprint2Ronaldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.*;
import java.util.Scanner;

public class InsercaoVerifica {	

	public static  void main(String[] args)throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		//ConnectionFactory factory= new ConnectionFactory();
		
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/desafiobolsa?useTimezone=true&serverTimezone=UTC",
						"root", "");
		Statement stm = connection.createStatement();
		try {
		stm.execute("insert into produto (nome, descricao, desconto, dataInicio, dataFim) values(?,?,?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		}catch(SQLSyntaxErrorException e) {
			System.out.println(e);
		}
		
        Statement stmt = connection.createStatement();
	           
			//ResultSet rst = stm.getResultSet();
        
		ResultSet rst = stm.getGeneratedKeys();
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




