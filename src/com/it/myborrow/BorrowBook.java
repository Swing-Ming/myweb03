package com.it.myborrow;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.dao.BorrowService;

import com.it.dao.BorrowService;
public class BorrowBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BorrowBook() {
        super();
       
    }

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BorrowService bs = new BorrowService();
		String bookcode = request.getParameter("bookcode");
		String cardcode = request.getParameter("cardcode");
		
		String msg = bs.BorrowBook(cardcode,bookcode);
		response.sendRedirect("/login?msg="+msg);
	}

}
