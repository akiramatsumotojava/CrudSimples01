package br.com.akira.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.akira.entidade.Usuario;
import br.com.akira.util.ConnectionFactory;

public class UsuarioDAO {

	private Connection conn = ConnectionFactory.getConnection();

	public void adiciona(Usuario u) {
		String sql = "INSERT INTO usuario(nome,login,senha)VALUES(?,?,?)";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getNome());
			ps.setString(2, u.getLogin());
			ps.setString(3, u.getSenha());
			ps.execute();

			System.out.println("Adicionado com sucesso !!!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void edita(Usuario u) {
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE id=?";
		try (PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getNome());
			ps.setString(2, u.getLogin());
			ps.setString(3, u.getSenha());
			ps.setInt(4, u.getId());
			ps.execute();
			
			System.out.println("Editado com sucesso !!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
