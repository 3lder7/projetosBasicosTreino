package br.com.agenda.factory;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionFactory {
	
	//Nome do Usuário MYSQL
	private static final String USERNAME = "root";
	
	//Senha Banco
	private static final String PASSWORD= "";
	
	//Caminho banco de Dados, porta, nome do banco
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/agenda";
	
	/*
	 * Conexão com Banco de Dados
	 */
	
	public static Connection createConnectionToMySQL() throws Exception{
		//Faz a classe ser carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		//Recuperar uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
