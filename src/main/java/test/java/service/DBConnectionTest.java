/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author shirl
 */

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import service.DBConnection;

public class DBConnectionTest {

    @Test
    public void testConnection() {
        try (Connection conn = DBConnection.getConnection()) {
            assertNotNull(conn, "Connection should not be null");
            assertFalse(conn.isClosed(), "Connection should be open");
        } catch (SQLException ex) {
            fail("Connection failed: " + ex.getMessage());
        }
    }
}
