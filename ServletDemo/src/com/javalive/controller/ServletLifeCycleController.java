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
        System.out.println("in the constructor of ServletLifeCycle......");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*javax.servlet.RequestDispatcher dispatcher1 = request.getRequestDispatcher("/Message");//WelcomeJSP.jsp");
		dispatcher1.include(request, response);
		//response.getWriter().write("\nIn the calling servet after include method......");
		System.out.println("\nIn the calling servet after include method......");*/
		//javax.servlet.RequestDispatcher dispatcher2 = request.getRequestDispatcher("WelcomeJSP.jsp");
		javax.servlet.RequestDispatcher dispatcher2 = getServletContext().getRequestDispatcher("/Account");
		dispatcher2.forward(request, response);
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
