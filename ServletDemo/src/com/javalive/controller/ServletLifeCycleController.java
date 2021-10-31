package com.javalive.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class ServletLifeCycleDemo
 */
//@WebServlet("/ServletLifeCycle")
public class ServletLifeCycleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLifeCycleController() {
        super();
        System.out.println("in the constructor of ServletLifeCycleController servlet......");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("We are in ServletLifeCycleController servlet......."
				+ "\nNow including response from MessageController servlet.......\n");
		javax.servlet.RequestDispatcher dispatcher1 = request.getRequestDispatcher("/Message");//WelcomeJSP.jsp");
		dispatcher1.include(request, response);
		System.out.println("\nAs we have called include() method of RequestDispatcher class, "
		+ "controll get again shifts to ServletLifeCycleController servlet after include() method......"
		+ "\nHence we are again in ServletLifeCycleController servlet......"
		+ "\nNow we are going to call forward() method of RequestDispatcher class from this ServletLifeCycleController servlet "
		+ "to AccountController servlet.. "
		+ "\nHence controll will get permenantly transfferd to AccountColtroller servlet.\n");
		javax.servlet.RequestDispatcher dispatcher2 = getServletContext().getRequestDispatcher("/Account");
		dispatcher2.forward(request, response);
		
		//***Please note that if we uncomment last commented code snippet in MessageController servlet file, it results in 
		//raising IllegatStateException in the application
		//as we are using forward methods more than once firstly in that commented code of MessageController servlet file 
		//and secondly in above code line again (to forward to AccountController servlet).
		//This phenomenon underlines working of RequsetDeispatchers forward() method.
		
		
		//**Also please note the following line. It transfers the control permanently from our application to 
		// some other application/website(to google in this case)
		//response.sendRedirect("https://www.google.co.in");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
