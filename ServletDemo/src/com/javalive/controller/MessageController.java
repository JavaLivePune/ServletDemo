package com.javalive.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.javalive.*;
/**
 * Servlet implementation class MessageServlet
 */
//@WebServlet("/Message")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("In the MessageServlet...");
		System.out.println("Getting bussiness logic content from WelcomeMessage.java file....");
		WelcomeMessage file=new WelcomeMessage();
		System.out.println("Message from WelcomeMessge.java is "+file.getMessage());
		
		//***Please note that if we uncomment following code snippet, it results in raising IllegatStateException in the application
		//as we are using forward methods more than once firstly in following code and secondly in ServletLifeCycleController servlet
		//again (to forward to AccountController servlet). This phenomenon underlines working of RequsetDeispatchers forward() method.
		
		System.out.println("Now we are going to call forward() method of RequestDispatcher class from this MessageController servlet to WelcomeJSP..."
				+ "\nPlease see web browser output......"); 
		javax.servlet.RequestDispatcher dispatcher1 = request.getRequestDispatcher("/WelcomeJSP.jsp");//WelcomeJSP.jsp");
		dispatcher1.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
