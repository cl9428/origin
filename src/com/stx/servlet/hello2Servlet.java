package com.stx.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.bean.Person;

/**
 * Servlet implementation class helloServlet
 */
public class hello2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		Person p = new Person();
		p.setAge(23);
		p.setName("cl");
		l.add(p);
		
		Person p1 = new Person();
		p.setAge(223);
		p.setName("cl");
		l.add(p1);
		
		
		request.getSession().setAttribute("plist",l);
		request.getSession().setAttribute("p1list",l);
		request.getRequestDispatcher("show2.jsp").forward(request,response);
		
		
	}

}
