package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CargoDAO;
import dao.UFDAO;
import models.Cargo;
import models.UF;

@WebServlet(name="ServletFuncionarios", urlPatterns="/Funcionario.do")
public class FuncionarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FuncionarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CargoDAO cargoDAO = new CargoDAO();
		
		List<Cargo> listaCargos = cargoDAO.buscarTodos();
		request.getSession().setAttribute("listaCargos", listaCargos);
		
		UFDAO ufDAO = new UFDAO();
		List<UF> listaEstados = ufDAO.buscarEstados();
		request.getSession().setAttribute("listaEstados", listaEstados);
		
		response.sendRedirect("views/CadastroFunc/cadFunc.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
