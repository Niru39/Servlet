package org.personal.iims;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Add", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numberOne = Integer.parseInt(request.getParameter("numberOne"));
        int numberTwo = Integer.parseInt(request.getParameter("numberTwo"));
        int result = numberOne + numberTwo;
        request.setAttribute("sum", result);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
        requestDispatcher.include(request, response);

    }
}
