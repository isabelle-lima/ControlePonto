package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CargoDAO;
import models.Cargo;

/**
 * Servlet implementation class ListarCargosController
 */
@WebServlet("/listarcargos.do")
public class ListarCargosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CargoDAO cargoDAO = new CargoDAO();
		
		List<Cargo> lista = cargoDAO.buscarTodos();
		
		RequestDispatcher rd = request.getRequestDispatcher("views/ListarCargos/listarCargo.jsp");
		request.setAttribute("listaCargos", lista);
		rd.forward(request, response);
	}

}
