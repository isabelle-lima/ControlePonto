package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.Cargo;

public class CargoDAO {

	public void cadastrar(Cargo c) {
		
		Connection con = Conexao.recebeConexao();
		
		String sql = "INSERT INTO CARGO (CARGO, SALARIO_BASE) VALUES (?, ?)";
		//System.out.println(sql);
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, c.getCargo());
			preparador.setDouble(2, c.getSalarioBase());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cargo cadastrado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar cargo.");
			e.printStackTrace();
		}
		
	}
	
}
