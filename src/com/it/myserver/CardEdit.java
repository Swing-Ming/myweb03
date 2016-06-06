package com.it.myserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.dao.CardDAO;
import com.it.entity.Card; 
public class CardEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public CardEdit() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String strId = request.getParameter("id");
		System.out.println(strId);
		
		int id = new Integer(strId);
		System.out.println(id);
		
		CardDAO dao = new CardDAO();
		Card card = dao.findOne(id);
		request.setAttribute("card", card);
		request.getRequestDispatcher("/WEB-INF/views/cardmodifyhome.jsp").forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

}
