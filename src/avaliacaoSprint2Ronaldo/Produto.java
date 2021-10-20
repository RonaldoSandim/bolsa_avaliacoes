

package avaliacaoSprint2Ronaldo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produto {

		protected Integer idproduto;
		protected String nome;
		protected String  descricao;
	   protected String desconto;
		protected String dataInicio;
		protected  String dataFim;
		
		public Produto(Integer idproduto, String nome, String descricao, String desconto, String dataInicio,
				String dataFim) {
			//super();
			this.idproduto = idproduto;
			this.nome = nome;
			this.descricao = descricao;
			this.desconto = desconto;
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
		}

		public  Integer getIdproduto() {
			return idproduto;
		}
		
		public void setIdproduto(Integer idproduto) {
			this.idproduto = idproduto;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricaoo() {
			return descricao;
		}
		public void setDescricaoo(String descricaoo) {
			this.descricao = descricaoo;
		}
		public String getDesconto() {
			return desconto;
		}
		public void setDesconto(String desconto) {
			this.desconto = desconto;
		}
		public String getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(String dataInicio) {
			this.dataInicio = dataInicio;
		}
		public String getDataFim() {
			return dataFim;
		}
		public void setDataFim(String dataFim) {
			this.dataFim = dataFim;
		}
		 
		 
	}


