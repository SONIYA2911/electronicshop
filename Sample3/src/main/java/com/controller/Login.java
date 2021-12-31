package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineelectronicshop.daoImpl.ConnectionUtil;
import com.onlineelectronicshop.daoImpl.UserDao;
import com.onlineelectronicshop.model.User;
@WebServlet("/login")

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		System.out.println("Hi");
		Connection con=ConnectionUtil.getDbConnection();
		String emailid=request.getParameter("loginemail");
		String password=request.getParameter("loginpassword");
		UserDao userDao=new UserDao();
		System.out.println("hello"+emailid+password);
		User Currentuser=userDao.validateUser(emailid,password);
		pw.write(Currentuser.getUserName());
		pw.write("welcome");
		
		HttpSession session=request.getSession();
		session.setAttribute("CurrentUser",Currentuser);
		doGet(request, response);
	}

}
