package org.personal.iims;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProfileController", urlPatterns = {"/profile"})
public class ProfileController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        if (session != null) {
            String value = (String) session.getAttribute("userName");
            if (!value.equals("")) {
                request.setAttribute("userName", value);
                request.getRequestDispatcher("/profile.jsp").forward(request, response);
            } else {
                out.println("<font color=red>Please login first</font>");
                request.getRequestDispatcher("/login.jsp").include(request, response);
            }
        } else {
            out.println("<font color=red>Please login first</font>");
            request.getRequestDispatcher("/login.jsp").include(request, response);
        }
    }

}
