package br.com.artista.artista;

import br.com.artista.artista.persistencia.entidade.Usuario;
import br.com.artista.artista.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
	}
	
	public static void testeCadastrar(){
		//Criando o Usuário
				Usuario usu = new Usuario();
				usu.setNome("Jãozão");
				usu.setLogin("jzao");
				usu.setSenha("123");
				
				//Cadastrando usuário no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("Cadastrado com sucesso");
	}
	
	public static void testeAlterar(){
		//Criando o Usuário
				Usuario usu = new Usuario();
				usu.setId(4);
				usu.setNome("Jãozão da Silva");
				usu.setLogin("jzaoss");
				usu.setSenha("12345678");
				
				//Cadastrando usuário no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("Alterado com sucesso");
	}
	
	public static void testeExcluir(){
		//Criando o Usuário
				Usuario usu = new Usuario();
				usu.setId(4);
				
				//Cadastrando usuário no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.excluir(usu);
				
				System.out.println("Excluido com sucesso");
	}

}
