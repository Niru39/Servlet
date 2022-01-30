package org.personal.iims;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();

        if (userName.equals("admin") && password.equals("admin123")) {
            request.setAttribute("userName", userName);
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);

            response.sendRedirect(request.getContextPath() + "/profile");
        } else {
            out.println("<font color=red>Either username or password is incorrect</font>");
            request.getRequestDispatcher("/login.jsp").include(request, response);
        }
    }
}
