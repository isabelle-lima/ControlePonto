package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CargoDAO;
import models.Cargo;

/**
 * Servlet implementation class CargoController
 */
@WebServlet("/Cargo.do")
public class CargoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/*   
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	*/
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomecargo;
		String salario;
		double salarioB;
		
		nomecargo = request.getParameter("txtCargoFunc");
		salario = request.getParameter("txtSalario");
		salario.replaceAll(",", ".");
		salarioB = Double.parseDouble(salario);
		
		Cargo cargo = new Cargo();
		cargo.setCargo(nomecargo);
		cargo.setSalarioBase(salarioB);
		
		CargoDAO cargoDAO = new CargoDAO();
		cargoDAO.cadastrar(cargo);
		
		response.sendRedirect("../ListarCragos/listarCargo.jsp");
	}

}
