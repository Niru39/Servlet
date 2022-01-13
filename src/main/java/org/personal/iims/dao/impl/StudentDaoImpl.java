package org.personal.iims.dao.impl;

import org.personal.iims.connectionfactory.ConnectionFactory;
import org.personal.iims.dao.StudentDao;
import org.personal.iims.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private static Connection connection;

    private static PreparedStatement preparedStatement;

    private static ResultSet resultSet;

    @Override
    public int save(Student student) throws ClassNotFoundException, SQLException {
        final String QUERY = "INSERT INTO student (first_name, last_name, address, phone_number) VALUES (?,?,?,?)";
        connection = ConnectionFactory.getConnection();
        preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setString(1, student.getFirstName());
        preparedStatement.setString(2, student.getLastName());
        preparedStatement.setString(3, student.getAddress());
        preparedStatement.setLong(4, student.getPhoneNumber());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int update(Student student) throws ClassNotFoundException, SQLException {
        final String QUERY = "UPDATE student set first_name = ?, last_name = ?, address = ?, phone_number = ? WHERE id = ?";
        connection = ConnectionFactory.getConnection();
        preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setString(1, student.getFirstName());
        preparedStatement.setString(2, student.getLastName());
        preparedStatement.setString(3, student.getAddress());
        preparedStatement.setLong(4, student.getPhoneNumber());
        preparedStatement.setInt(5, student.getId());
        return preparedStatement.executeUpdate();

    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        final String QUERY = "DELETE FROM student where id = ?";
        connection = ConnectionFactory.getConnection();
        preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate();
    }

    @Override
    public List<Student> findAll() throws ClassNotFoundException, SQLException {
        final List<Student> students = new ArrayList<>();
        final String QUERY = "SELECT *FROM student";
        connection = ConnectionFactory.getConnection();
        resultSet = connection.prepareStatement(QUERY).executeQuery();
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setLastName(resultSet.getString("last_name"));
            student.setAddress(resultSet.getString("address"));
            student.setPhoneNumber(resultSet.getLong("phone_number"));
            students.add(student);
        }
        return students;
    }

    @Override
    public Student findOne(int id) throws ClassNotFoundException, SQLException {
        final String QUERY = "SELECT *FROM student where id = ?";
        connection = ConnectionFactory.getConnection();
        preparedStatement = connection.prepareStatement(QUERY);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setLastName(resultSet.getString("last_name"));
            student.setAddress(resultSet.getString("address"));
            student.setPhoneNumber(resultSet.getLong("phone_number"));
        }
        return student;
    }
}
