package br.com.akira.testaDAO;

import br.com.akira.dao.UsuarioDAO;
import br.com.akira.entidade.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		// edita();
		// adiciona();

	}

	private static void edita() {
		Usuario u = new Usuario();
		u.setId(3);
		u.setNome("Pedro");
		u.setLogin("ped");
		u.setSenha("987");

		UsuarioDAO dao = new UsuarioDAO();
		dao.edita(u);
	}

	private static void adiciona() {
		Usuario u = new Usuario();
		u.setNome("Maria");
		u.setLogin("mar");
		u.setSenha("654");

		UsuarioDAO dao = new UsuarioDAO();
		dao.adiciona(u);
	}

}
