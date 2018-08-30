package controllers;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		String str;
		
		nomecargo = request.getParameter("txtCargoFunc");
		salario = request.getParameter("txtSalario");
		salario.replaceAll(",", ".");
		salarioB = Double.parseDouble(salario);
				
		str = request.getParameter("txtCargaH");
		str = str + ":00";
		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
		Date data = null;
		try {
			data = (Date) formatador.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Time time = new Time(data.getTime());
		System.out.println(time);
		
		Cargo cargos = new Cargo();
		cargos.setCargo(nomecargo);
		cargos.setCargaH(time);
		cargos.setSalarioBase(salarioB);
		
		System.out.println(cargos.getCargaH());
		//System.out.println(cargos.getSalarioBase());
			
		CargoDAO cargoDAO = new CargoDAO();
		cargoDAO.cadastrar(cargos);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarcargos.do");
        rd.forward(request, response);
	}

}
