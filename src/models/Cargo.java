package models;

import java.sql.Time;

public class Cargo {

	private int id;
	private String cargo;
	private double salarioBase;
	private Time cargaH;
	
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
	
	public Time getCargaH() {
		return cargaH;
	}
	
	public void setCargaH(Time cargaH) {
		this.cargaH = cargaH;
	}
		
}
