package org.personal.iims;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ServletOne", urlPatterns = {"/cookie"})
public class ServletOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("cookieValue")) {
                request.setAttribute("cookieValue", cookie.getValue());
            }
        }
        request.getRequestDispatcher("/welcome.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        Cookie cookie = new Cookie("cookieValue", URLEncoder.encode(username, StandardCharsets.UTF_8));
        response.addCookie(cookie);
        request.setAttribute("cookieValue", username);
        request.getRequestDispatcher("/welcome.jsp").include(request, response);
    }
}
