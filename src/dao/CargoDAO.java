package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Cargo;

public class CargoDAO<ListaCargos> {

	public void cadastrar(Cargo c) {
		
		Connection con = Conexao.recebeConexao();
		
		String sql = "INSERT INTO CARGO (CARGO, CARGA_HORARIA, SALARIO_BASE) VALUES (?, ?, ?)";
		//System.out.println(sql);
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, c.getCargo());
			preparador.setString(2, c.getCargaH());
			preparador.setDouble(3, c.getSalarioBase());
						
			preparador.execute();
			preparador.close();
			
			System.out.println("Cargo cadastrado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar cargo.");
			e.printStackTrace();
		}
		
	}
	
	public List<Cargo> buscarTodos() {
		Connection con = Conexao.recebeConexao();
		
		String sql = "SELECT * FROM CARGO";
		
		ArrayList<Cargo> lista = new ArrayList<Cargo>();
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				Cargo c = new Cargo();
				c.setCargo(resultado.getString("CARGO"));
				if (resultado.getString("CARGA_HORARIA").length() > 0 || resultado.getString("CARGA_HORARIA") != null) {
					c.setCargaH(resultado.getString("CARGA_HORARIA"));
				} else {
					c.setCargaH("00:00");
				}
				c.setSalarioBase(resultado.getDouble("SALARIO_BASE"));
				lista.add(c);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar tabela Cargo no banco.");
			e.printStackTrace();
		}
		return lista;
	}
	
}
