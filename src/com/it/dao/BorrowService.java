package com.it.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class BorrowService {

	public String BorrowBook(String cardCode, String bookCode) {
		return callPro("{CALL pro_book_borrow(?,?,?)}", cardCode, bookCode);
	}
	
	
	public String ReBook(String cardCode, String bookCode) {
		return callPro("{CALL pro_book_re(?,?,?)}", cardCode, bookCode);
	}
	
	
	private String callPro(String proName, String cardCode, String bookCode) {
		String msg = "";
		try {
			Connection conn = DriverManager.getConnection(com.it.dao.Config.DB_URL);

			CallableStatement cstmt = conn.prepareCall(proName);
			cstmt.setString(1, bookCode);
			cstmt.setString(2, cardCode);

			cstmt.executeQuery();
			msg = cstmt.getString(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
}
