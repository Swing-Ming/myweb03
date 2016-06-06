package com.it.myserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.dao.CardDAO; 
import com.it.entity.Card;
 
public class CardInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public CardInsert() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO dao = new CardDAO();
		Card card = new Card();
		request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		card.setCode(request.getParameter("code"));
		card.setName(request.getParameter("name"));
		card.setTel(request.getParameter("tel"));
		
		dao.add(card);
		
		response.sendRedirect("/cardlogin");
		
	}

}
