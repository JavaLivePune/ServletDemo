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
