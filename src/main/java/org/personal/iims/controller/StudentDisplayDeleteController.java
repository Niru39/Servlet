package org.personal.iims.controller;

import org.personal.iims.dao.StudentDao;
import org.personal.iims.dao.impl.StudentDaoImpl;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentDisplaySaveController", urlPatterns = {"/student"})
public class StudentDisplayDeleteController extends HttpServlet {

    private final StudentDao studentDao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        try {
            if (id != null) {
                int result = studentDao.delete(Integer.parseInt(id));
                if (result == 1) {
                    request.setAttribute("students", studentDao.findAll());
                    response.sendRedirect("/servlet-demos/student");
                }
            } else {
                request.setAttribute("students", studentDao.findAll());
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
