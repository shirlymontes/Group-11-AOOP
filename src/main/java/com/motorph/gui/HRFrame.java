 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.motorph.gui;

import java.sql.ResultSet;
import form.AddEmployeeForm; 
import form.EditEmployeeForm;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class HRFrame extends javax.swing.JFrame {

    
    public HRFrame() {
        initComponents();
        loadEmployeeData();
        int totalEmployees = getEmployeeCount();
        employeeCountLabel.setText(String.valueOf(totalEmployees));

        
         AddEmployeeForm form = new AddEmployeeForm(this);
           form.setVisible(true);
           
            EmployeeMngtTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
             EmployeeMngtTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            EmployeeMngtTable.getColumnModel().getColumn(1).setPreferredWidth(150); 
            EmployeeMngtTable.getColumnModel().getColumn(2).setPreferredWidth(150); 
            EmployeeMngtTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            EmployeeMngtTable.getColumnModel().getColumn(4).setPreferredWidth(250); 
            EmployeeMngtTable.getColumnModel().getColumn(5).setPreferredWidth(100); 
                
        employeeCountLabel.setFont(new Font("Roboto", Font.BOLD, 60));
        employeeCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }

            private int getEmployeeCount() {
            int count = 0;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_db", "root", "mmdcaoop");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COUNT(employee_id) AS total FROM employee");
                if (rs.next()) {
                    count = rs.getInt("total");
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return count;
        }

            public void refreshEmployeeCount() {
            int total = getEmployeeCount();
            employeeCountLabel.setText(String.valueOf(total));
        }

   public void loadEmployeeData() {
    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/payroll_db", "root", "mmdcaoop");

        String sql = "SELECT employee_id, first_name, last_name, birthday, address, phone_number, " +
                     "sss_number, philhealth_number, tin_number, pagibig_number, employment_status, " +
                     "position, supervisor, basic_salary, rice_subsidy, phone_allowance, clothing_allowance, " +
                     "hourly_rate, gross_semi_monthly " +
                     "FROM employee";

        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        DefaultTableModel model = (DefaultTableModel) EmployeeMngtTable.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            int employeeId = rs.getInt("employee_id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String birthday = rs.getString("birthday");
            String address = rs.getString("address");
            String phoneNumber = rs.getString("phone_number");
            String sss = rs.getString("sss_number");
            String philHealth = rs.getString("philhealth_number");
            String tin = rs.getString("tin_number");
            String pagIbig = rs.getString("pagibig_number");
            String employmentStatus = rs.getString("employment_status");
            String position = rs.getString("position");
            String supervisor = rs.getString("supervisor");
            String basicSalary = rs.getString("basic_salary");
            String riceSubsidy = rs.getString("rice_subsidy");
            String phoneAllowance = rs.getString("phone_allowance");
            String clothingAllowance = rs.getString("clothing_allowance");
            String hourlyRate = rs.getString("hourly_rate");
            String grossSemi = rs.getString("gross_semi_monthly");

            model.addRow(new Object[]{
                employeeId, firstName, lastName, birthday, address, phoneNumber, sss, philHealth, tin, pagIbig,
                employmentStatus, position, supervisor, basicSalary, riceSubsidy, phoneAllowance,
                clothingAllowance, hourlyRate, grossSemi
            });
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading employee data: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        banner1 = new com.motorph.gui.Banner();
        roundedPanel1 = new com.motorph.gui.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeCountLabel = new javax.swing.JLabel();
        roundedPanel2 = new com.motorph.gui.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        roundedPanel3 = new com.motorph.gui.RoundedPanel();
        btnDelete = new javax.swing.JButton();
        btnToEditEmployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnToAddEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeMngtTable = new javax.swing.JTable();
        roundedPanel4 = new com.motorph.gui.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("TOTAL EMPLOYEES");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employees (2).png"))); // NOI18N

        employeeCountLabel.setBackground(new java.awt.Color(51, 51, 51));
        employeeCountLabel.setForeground(new java.awt.Color(0, 0, 102));
        employeeCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                        .addComponent(employeeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(employeeCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("ATTENDANCE");

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDelete.setBackground(new java.awt.Color(226, 99, 103));
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("DELETE");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnToEditEmployee.setBackground(new java.awt.Color(151, 192, 131));
        btnToEditEmployee.setForeground(new java.awt.Color(0, 0, 0));
        btnToEditEmployee.setText("EDIT");
        btnToEditEmployee.setToolTipText("");
        btnToEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToEditEmployeeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("EMPLOYEE LIST");

        btnToAddEmployee.setBackground(new java.awt.Color(255, 215, 119));
        btnToAddEmployee.setForeground(new java.awt.Color(0, 0, 0));
        btnToAddEmployee.setText("ADD");
        btnToAddEmployee.setToolTipText("");
        btnToAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToAddEmployeeActionPerformed(evt);
            }
        });

        EmployeeMngtTable.setBackground(new java.awt.Color(255, 255, 255));
        EmployeeMngtTable.setForeground(new java.awt.Color(0, 51, 102));
        EmployeeMngtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Last Name", "First Name", "Birthday", "Address", "Phone Number", "SSS #", "PhilHealh #", "TIN #", "Pag-IBIG #", "Status", "Position", "Immediate Supervisor", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance", "Hourly Rate", "Gross Semi-Monthly Rate"
            }
        ));
        EmployeeMngtTable.setGridColor(new java.awt.Color(255, 255, 255));
        EmployeeMngtTable.setSelectionBackground(new java.awt.Color(153, 204, 255));
        EmployeeMngtTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(EmployeeMngtTable);

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundedPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundedPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(560, 560, 560)
                        .addComponent(btnToAddEmployee)
                        .addGap(18, 18, 18)
                        .addComponent(btnToEditEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDelete)))
                .addGap(51, 51, 51))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnToEditEmployee)
                    .addComponent(btnToAddEmployee)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("LEAVE REQUESTS");

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(banner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnToAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToAddEmployeeActionPerformed
    
    AddEmployeeForm form = new AddEmployeeForm(this);
    javax.swing.JFrame frame = new javax.swing.JFrame("Add Employee");
    frame.setContentPane(form);
    frame.pack();
    frame.setLocationRelativeTo(this);
    frame.setVisible(true);
    }//GEN-LAST:event_btnToAddEmployeeActionPerformed

    private void btnToEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToEditEmployeeActionPerformed
                
     int selectedRow = EmployeeMngtTable.getSelectedRow();
                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(null, "Please select an employee to edit.");
                    return;
                }

                // Get data from the selected row
                int employeeId = (int) EmployeeMngtTable.getValueAt(selectedRow, 0);
                String firstName = (String) EmployeeMngtTable.getValueAt(selectedRow, 2);
                String lastName = (String) EmployeeMngtTable.getValueAt(selectedRow, 1);
                String birthday = EmployeeMngtTable.getValueAt(selectedRow, 3).toString();
                String address = (String) EmployeeMngtTable.getValueAt(selectedRow, 4);
                String phoneNumber = (String) EmployeeMngtTable.getValueAt(selectedRow, 5);
                String sss = (String) EmployeeMngtTable.getValueAt(selectedRow, 6);
                String philHealth = (String) EmployeeMngtTable.getValueAt(selectedRow, 7);
                String tin = (String) EmployeeMngtTable.getValueAt(selectedRow, 8);
                String pagIbig = (String) EmployeeMngtTable.getValueAt(selectedRow, 9);
                String employmentStatus = (String) EmployeeMngtTable.getValueAt(selectedRow, 10);
                String position = (String) EmployeeMngtTable.getValueAt(selectedRow, 11);
                String supervisor = (String) EmployeeMngtTable.getValueAt(selectedRow, 12);
                String basicSalary = (String) EmployeeMngtTable.getValueAt(selectedRow, 13);
                String riceSubsidy = (String) EmployeeMngtTable.getValueAt(selectedRow, 14);
                String phoneAllowance = (String) EmployeeMngtTable.getValueAt(selectedRow, 15);
                String clothingAllowance = (String) EmployeeMngtTable.getValueAt(selectedRow, 16);
                String hourlyRate = (String) EmployeeMngtTable.getValueAt(selectedRow, 17);
                String grossSemi = (String) EmployeeMngtTable.getValueAt(selectedRow, 18);

                // Open the form
                EditEmployeeForm form = new EditEmployeeForm(
                    HRFrame.this,
                    employeeId, firstName, lastName, birthday, address, phoneNumber,
                    sss, philHealth, tin, pagIbig, employmentStatus,
                    position, supervisor, basicSalary, riceSubsidy,
                    phoneAllowance, clothingAllowance, hourlyRate, grossSemi
                );
                form.setVisible(true);
    }//GEN-LAST:event_btnToEditEmployeeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // Get the selected row index
    int selectedRow = EmployeeMngtTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an employee to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the employee ID from the table model
    DefaultTableModel model = (DefaultTableModel) EmployeeMngtTable.getModel();
    String employeeId = model.getValueAt(selectedRow, 0).toString();

    // Confirm deletion
    int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to delete Employee #" + employeeId + "?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        deleteEmployeeFromDatabase(employeeId);
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Employee deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
    }

    }
    
    private void deleteEmployeeFromDatabase(String employeeId) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
           
            String url = "jdbc:mysql://localhost:3306/payroll_db";
            String username = "root";
            String password = "mmdcaoop"; 

            conn = DriverManager.getConnection(url, username, password);

            String sql = "DELETE FROM employee WHERE employee_id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, employeeId);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

    }//GEN-LAST:event_btnDeleteActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeMngtTable;
    private com.motorph.gui.Banner banner1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnToAddEmployee;
    private javax.swing.JButton btnToEditEmployee;
    private javax.swing.JLabel employeeCountLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.motorph.gui.RoundedPanel roundedPanel1;
    private com.motorph.gui.RoundedPanel roundedPanel2;
    private com.motorph.gui.RoundedPanel roundedPanel3;
    private com.motorph.gui.RoundedPanel roundedPanel4;
    // End of variables declaration//GEN-END:variables
}
