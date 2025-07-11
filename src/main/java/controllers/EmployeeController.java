package controllers;

import model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import service.DBConnection;

public class EmployeeController {

    public Employee getEmployeeById(int empId) {
        Employee emp = null;

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM employee WHERE employee_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                emp = new Employee(
                    rs.getInt("employee_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getDate("birthday").toString(),
                    rs.getString("address"),
                    rs.getString("phone_number"),
                    rs.getString("position")
                );
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return emp;
    }
}
