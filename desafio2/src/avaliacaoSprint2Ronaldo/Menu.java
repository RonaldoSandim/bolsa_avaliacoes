package avaliacaoSprint2Ronaldo;

import java.sql.SQLException;
import java.util.*;

public class Menu {

	public static void main(String[] args) throws SQLException{

		Scanner ler = new Scanner(System.in);
		int opcao=0;
		while(opcao != 0) {
		System.out.println("<<< MENÚ >>>:");
		 System.out.println("1 Inserir promoções");
		 System.out.println("2 Atualizar ofertas");
		 System.out.println("3 Excluir a segunda opco");
		 System.out.println("4 Emoticonss");

		 opcao = new Scanner(System.in).nextInt();
		 
		 if(opcao==1) {
			InsercaoVerifica.main(args);
		 }if(opcao==2) {
			 Emoticons.metodo();
		 }if(opcao==3) {
			 
		 }if(opcao==4) {
			 
		 }
		 
	}
	}
}


