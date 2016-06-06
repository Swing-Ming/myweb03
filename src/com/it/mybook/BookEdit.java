package com.it.mybook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.BookDAO;
import com.it.entity.Book;

public class BookEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookEdit() {
		super();

	}

	BookDAO dao = new BookDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Book book = dao.findOne(id);
		request.setAttribute("book", book);
		request.getRequestDispatcher("/WEB-INF/views/bookmodifyhome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publishing = request.getParameter("publishing");
		int total = Integer.parseInt(request.getParameter("total"));
		int count = Integer.parseInt(request.getParameter("count"));

		Book book = new Book();
		book.setId(id);
		book.setCode(code);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublishing(publishing);
		book.setTotal(total);
		book.setCount(count);

		if (dao.modify(book)) {
			response.sendRedirect("/homelogin");
		} else {
			response.sendError(400, "ÐÂÔöÒì³££¡");
		}
	}
}
