package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
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
			preparador.setTime(2, c.getCargaH());
			preparador.setDouble(3, c.getSalarioBase());
						
			preparador.execute();
			preparador.close();
			
			System.out.println("Cargo cadastrado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar cargo.");
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
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
				c.setId(resultado.getInt("ID"));
				c.setCargo(resultado.getString("CARGO"));
				c.setCargaH(resultado.getTime("CARGA_HORARIA"));
				c.setSalarioBase(resultado.getDouble("SALARIO_BASE"));
				lista.add(c);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao consultar tabela Cargo no banco.");
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
}
