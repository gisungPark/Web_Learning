import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class FirstServlet extends HttpServlet{
	
	static int result = 0;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; UTF-8");
        
//        int result = 0;
        
        PrintWriter out = response.getWriter();
        String view = """
        		<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<h1>계산기 폼</h1>
		<form method="post">
			<fieldset>
				<div>
					<label>숫자1</label>
					<input name="num1">
				</div>
				<div>
					<label>숫자2</label>
					<input name="num2">
				</div>
			</fieldset>
			<div>
				<button>계산하기</button>
			</div>
			<div>
				계산결과 : %d
			</div>
			
		</form>
	</section>
</body>
</html> ∴
        		""";
        
        
        
        out.printf(view, result);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int result = 0;
		
		int num1 = 0;
        int num2 = 0;
        
        String num1_ = request.getParameter("num1");
        num1 = Integer.parseInt(num1_); // "12" -> 12
        
        String num2_ = request.getParameter("num2");
        num2 = Integer.parseInt(num1_); // "12" -> 12
        		
        result = num1+num2; 
        
        response.sendRedirect("calc");
//        response.sendRedirect("helo하하하");
        
        
        
	}	
	
  
}