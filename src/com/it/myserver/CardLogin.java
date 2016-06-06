package com.it.myserver;

import java.io.IOException;
 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.CardDAO;
import com.it.entity.Card;

public class CardLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CardLogin() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO dao = new CardDAO();
		
		 
		request.setAttribute("list",dao.findAll());
		request.getRequestDispatcher("WEB-INF/views/cardhome.jsp").forward(request, response);;
	}

	 
	 

}
