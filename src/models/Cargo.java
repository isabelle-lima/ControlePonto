package models;

import java.text.ParseException;
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
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			java.util.Date d = sdf.parse(cargaH);
			System.out.println(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
		
}
