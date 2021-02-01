package com.ss.login;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class LoginHandler extends HttpServlet {

  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  res.setContentType("text/html;characterset=UTF=8");
	  PrintWriter out = res.getWriter();
	  
	  String user = req.getParameter("user");
	  String pass = req.getParameter("pass");
	  
	  if(Validate.checkUser(user, pass)) {
		  RequestDispatcher rs = req.getRequestDispatcher("Welcome "+user);
		  rs.forward(req, res);
	  } else {
		  out.println("Password or Username is incorrect");
		  RequestDispatcher rs = req.getRequestDispatcher("index.html");
		  rs.include(req, res);
	  }
  }
   public void destroy() {
      /* leaving empty for now this can be
       * used when we want to do something at the end
       * of Servlet life cycle
       */
   }
}
