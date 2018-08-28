package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomecargo;
		String salario;
		double salarioB;
		String carga;
		
		nomecargo = request.getParameter("txtCargoFunc");
		salario = request.getParameter("txtSalario");
		salario.replaceAll(",", ".");
		salarioB = Double.parseDouble(salario);
		carga = request.getParameter("txtCargaH");
		
		Cargo cargos = new Cargo();
		cargos.setCargo(nomecargo);
		cargos.setCargaH(carga);
		cargos.setSalarioBase(salarioB);
		
		System.out.println(cargos.getCargaH());
		//System.out.println(cargos.getSalarioBase());
			
		CargoDAO cargoDAO = new CargoDAO();
		cargoDAO.cadastrar(cargos);
		
		//response.sendRedirect("listarcargos.do");
		RequestDispatcher rd = request.getRequestDispatcher("listarcargos.do");
        rd.forward(request, response);
	}

}
