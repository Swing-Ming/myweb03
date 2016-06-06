package com.it.myserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  com.it.dao.CardDAO;
import com.it.entity.Card;
public class CardModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public CardModify() {
        super();
        
    }

    Card card = new Card();
    CardDAO dao = new CardDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String strId = request.getParameter("id");
		System.out.println(strId);
		int id = new Integer(strId);
		card.setId(id);
		card.setCode(request.getParameter("code"));
		card.setName(request.getParameter("name"));
		card.setTel(request.getParameter("tel"));
		if (dao.modify(card)) {
			response.sendRedirect("/cardlogin");
		} else {
			response.sendError(403, "没有权限操作!");
		}
	}

}
