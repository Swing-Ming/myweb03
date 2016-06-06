package com.it.mybook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.dao.BookDAO;
import com.it.entity.Book;

 
public class HomeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	public HomeLogin() {
		super();
		 
	}
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookDAO dao = new BookDAO();
		
		
		String wd = "";
		if (request.getParameter("wd") != null) {
			wd = new String(request.getParameter("wd").getBytes("ISO-8859-1"), "utf-8");
		}
		List<Book>book = dao.findBooks(wd);
		
		
		
		request.setAttribute("book",book);
		
		//request.setAttribute("list", dao.allBooks());
		request.getRequestDispatcher("WEB-INF/views/bookhome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
