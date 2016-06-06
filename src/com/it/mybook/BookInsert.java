package com.it.mybook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.BookDAO;
import com.it.dao.CardDAO;
import com.it.entity.Book;
import com.it.entity.Card;

 
public class BookInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BookInsert() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDAO dao = new BookDAO();
		Book b = new Book();
		request.setCharacterEncoding("utf-8");
		 
		
		b.setCode(request.getParameter("code"));
		b.setTitle(request.getParameter("title"));
		b.setAuthor(request.getParameter("author"));
		b.setPublishing(request.getParameter("publishing"));
		b.setTotal(Integer.parseInt(request.getParameter("total")));
		b.setCount(Integer.parseInt(request.getParameter("count")));
		dao.add(b);
		
		response.sendRedirect("/homelogin");
		
	}

}
