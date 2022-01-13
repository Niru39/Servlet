package org.personal.iims.controller;

import org.personal.iims.dao.StudentDao;
import org.personal.iims.dao.impl.StudentDaoImpl;
import org.personal.iims.model.Student;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentFormController", urlPatterns = {"/student-save"})
public class StudentFormController extends HttpServlet {

    private final StudentDao studentDao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        try {
            if (id != null) {
                Student student = studentDao.findOne(Integer.parseInt(id));
                request.setAttribute("student", student);
                request.setAttribute("action", "Update");
            } else {
                request.setAttribute("action", "Save");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        request.getRequestDispatcher("student/student-register-update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id").trim();
        System.out.println(id);
        int result;
        try {
            Student student = new Student();
            student.setFirstName(request.getParameter("firstName"));
            student.setLastName(request.getParameter("lastName"));
            student.setAddress(request.getParameter("address"));
            student.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));

            if (id.length() != 0) {
                student.setId(Integer.parseInt(id));
                result = studentDao.update(student);
            } else {
                result = studentDao.save(student);
            }

            if (result == 1) {
                response.sendRedirect("/servlet-demos/student");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
