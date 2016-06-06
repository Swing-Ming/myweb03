package com.it.myserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.dao.CardDAO;
 
public class CardDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CardDel() {
        super();
       
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 int id = Integer.parseInt(request.getParameter("id"));
		 CardDAO dao = new CardDAO();
		 dao.remove(id);
		 response.sendRedirect("/cardlogin");
		 
	}

	 
 

}
