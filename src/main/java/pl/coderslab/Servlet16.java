package pl.coderslab;

import sun.security.x509.IPAddressName;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet("/Servlet16")
public class Servlet16 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ip = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");
        LocalTime localTime = LocalTime.now();
        String time = localTime.toString();
        response.getWriter().append(ip + "\n" + userAgent + "\n" + time);
    }
}
