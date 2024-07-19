import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/hi")
public class FirstServlet extends HttpServlet {
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    System.out.println("hello world");
    PrintWriter out = response.getWriter();
    out.println("hello");
  }
}
