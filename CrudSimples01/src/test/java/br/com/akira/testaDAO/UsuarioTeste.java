package br.com.akira.testaDAO;

import br.com.akira.dao.UsuarioDAO;
import br.com.akira.entidade.Usuario;

public class UsuarioTeste {
	
	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setNome("Maria");
		u.setLogin("mar");
		u.setSenha("654");
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.adiciona(u);
		
	}

}
