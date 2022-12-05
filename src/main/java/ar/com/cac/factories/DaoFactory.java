package ar.com.cac.factories;

import ar.com.cac.modelos.UsuarioDAO;

public class DaoFactory {

	public static UsuarioDAO getUsuariosDAO() {
		return new UsuarioDAO();
	}

}
