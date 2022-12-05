package ar.com.cac.modelos;

import java.sql.SQLException;
import java.util.List;

import ar.com.cac.factories.ConexionFactory;
import ar.com.cac.modelos.Usuario;

public class UsuarioDAO implements DAO<Usuario> {

	@Override
	public void insert(Usuario usuario) throws SQLException {

		var conn = ConexionFactory.getConexion();

		String query = "insert into usuarios";
		query += " (nombre, mail, password, tel)";
		query += " values (?,?,?,?)";

		var ps = conn.prepareStatement(query);

		ps.setString(1, usuario.getNombre());
		ps.setString(2, usuario.getMail());
		ps.setString(3, usuario.getPassword());
		ps.setString(4, usuario.getTel());

		ps.executeUpdate();

		conn.close();

	}

	@Override
	public void update(Usuario modelo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	public Usuario getByUsername(String username) throws SQLException {
		
		Usuario usuario = null;

		var conn = ConexionFactory.getConexion();

	

		return usuario;
	
	}

	@Override
	public Usuario getById(int id) throws SQLException {
		Usuario usuario = null;

		var conn = ConexionFactory.getConexion();
/*
		String query = "select id, username, password, activo, categoria, nickname";
		query += " from usuarios";
		query += " where id = ?";

		var ps = conn.prepareStatement(query);

		ps.setInt(1, id);

		var rs = ps.executeQuery();

		if (rs.next()) {
			usuario = new Usuario();
			usuario.setId(rs.getInt("id"));
			usuario.setUsername(rs.getString("username"));
			usuario.setPassword(rs.getString("password"));
			usuario.setActivo(rs.getInt("activo") == 1);
			usuario.setCategoria(rs.getString("categoria"));
			usuario.setNickname(rs.getString("nickname"));
		}
*/
		return usuario;
	
	}

	@Override
	public List<Usuario> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
