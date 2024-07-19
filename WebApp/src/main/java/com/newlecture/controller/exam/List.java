package com.newlecture.controller.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import com.newlecture.entity.Exam;
import com.newlecture.service.ExamService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/exam/list")
public class List extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; UTF-8");
		PrintWriter out = resp.getWriter();
		
		int page = 1;
		
		ExamService service = new ExamService();
		
		Exam[] exams = service.getList();
		
//		----------------------------------------------------
		
		String n = "최윤성";
		req.setAttribute("name", n);
		req.setAttribute("exam", exams[0]);
		req.setAttribute("list", exams);
		// /exam/list -> forward -> /WEB-INF/view/exam/list.jsp
		req.getRequestDispatcher("/WEB-INF/view/exam/list.jsp").forward(req, resp);
		//resp.sendRedirect("list.jsp");
	}
	


}
