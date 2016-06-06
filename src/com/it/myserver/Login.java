package com.it.myserver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.it.dao.AdminDAO;
 
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String name =  request.getParameter("username");
		String pwd =  request.getParameter("userpwd");
		
		AdminDAO dao = new AdminDAO();
		
		if(dao.find(name, pwd)){
			request.getSession().setAttribute("username",name );
			 response.sendRedirect("/login");
			 //response.sendRedirect("/WEB-INF/views/home.jsp");
		}else{
			 response.sendRedirect("/index.jsp?err=1001");
		}
		
		
		
	}

}
