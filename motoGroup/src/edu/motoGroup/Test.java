package edu.motoGroup;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = conexion.crearConexion();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
