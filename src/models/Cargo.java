package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Cargo {

	private int id;
	private String cargo;
	private double salarioBase;
	private String cargaH;
	
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String getCargaH() {
		return cargaH;
	}
	public void setCargaH(String cargaH) {
		
		DateFormat formato = new SimpleDateFormat("HH:MM");
		try {
			this.cargaH = formato.parse(cargaH);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}
	
}
