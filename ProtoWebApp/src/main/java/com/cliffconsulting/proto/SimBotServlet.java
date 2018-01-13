package com.cliffconsulting.proto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SimBotServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6334911230933771229L;

	public void init() throws ServletException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
    {
    	// log this to JSON
    	
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> this is  my message </h1>");
    }

    public void destroy() {
    }

}

