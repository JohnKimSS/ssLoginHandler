package com.ss.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Welcome extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;characterset=UTF=8");
		PrintWriter out = res.getWriter();
		out.println("Welcome user");
	}

}
