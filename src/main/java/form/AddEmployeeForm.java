package form;

import com.motorph.gui.HRFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



public class AddEmployeeForm extends javax.swing.JPanel {

    private HRFrame hrFrame;
    
    public AddEmployeeForm(HRFrame hrFrame) {
        initComponents();
        this.hrFrame = hrFrame;
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfEmployeeNum = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSss = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfPhilHealth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfPagIbig = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfPosition = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfSupervisor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        tfBasicSalary = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfGrossSemi = new javax.swing.JTextField();
        btnAddedEmployee = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        tfHourlyRate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfPhoneAllowance = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfClothingAllowance = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfRiceSubsidy = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 244, 244));

        jLabel1.setText("Employee Number: ");

        jLabel2.setText("Last Name: ");

        jLabel3.setText("First Name:");

        jLabel4.setText("Birthday:");

        jLabel5.setText("Address:");

        jLabel6.setText("Phone Number:");

        tfEmployeeNum.setBackground(new java.awt.Color(255, 255, 255));
        tfEmployeeNum.setBorder(null);

        tfLastName.setBackground(new java.awt.Color(255, 255, 255));
        tfLastName.setBorder(null);

        tfFirstName.setBackground(new java.awt.Color(255, 255, 255));
        tfFirstName.setBorder(null);
        tfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstNameActionPerformed(evt);
            }
        });

        tfBirthday.setBackground(new java.awt.Color(255, 255, 255));
        tfBirthday.setBorder(null);
        tfBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBirthdayActionPerformed(evt);
            }
        });

        tfPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        tfPhoneNumber.setBorder(null);
        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });

        tfAddress.setBackground(new java.awt.Color(255, 255, 255));
        tfAddress.setBorder(null);
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        jLabel7.setText("SSS Number : ");

        tfSss.setBackground(new java.awt.Color(255, 255, 255));
        tfSss.setBorder(null);
        tfSss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSssActionPerformed(evt);
            }
        });

        jLabel8.setText("PhilHealth Number:");

        tfPhilHealth.setBackground(new java.awt.Color(255, 255, 255));
        tfPhilHealth.setBorder(null);
        tfPhilHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhilHealthActionPerformed(evt);
            }
        });

        jLabel9.setText("TIN:");

        tfTin.setBackground(new java.awt.Color(255, 255, 255));
        tfTin.setBorder(null);
        tfTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTinActionPerformed(evt);
            }
        });

        jLabel10.setText("Pag-IBIG Number:");

        tfPagIbig.setBackground(new java.awt.Color(255, 255, 255));
        tfPagIbig.setBorder(null);
        tfPagIbig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPagIbigActionPerformed(evt);
            }
        });

        jLabel11.setText("Status:");

        tfPosition.setBackground(new java.awt.Color(255, 255, 255));
        tfPosition.setBorder(null);
        tfPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPositionActionPerformed(evt);
            }
        });

        jLabel12.setText("Position:");

        tfStatus.setBackground(new java.awt.Color(255, 255, 255));
        tfStatus.setBorder(null);
        tfStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStatusActionPerformed(evt);
            }
        });

        jLabel13.setText("Immediate Supervisor: ");

        tfSupervisor.setBackground(new java.awt.Color(255, 255, 255));
        tfSupervisor.setBorder(null);
        tfSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupervisorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        jLabel14.setText("Basic Salary: ");

        tfBasicSalary.setBackground(new java.awt.Color(255, 255, 255));
        tfBasicSalary.setBorder(null);
        tfBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBasicSalaryActionPerformed(evt);
            }
        });

        jLabel15.setText("Gross Semi-Montly Rate");

        tfGrossSemi.setBackground(new java.awt.Color(255, 255, 255));
        tfGrossSemi.setBorder(null);
        tfGrossSemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGrossSemiActionPerformed(evt);
            }
        });

        btnAddedEmployee.setText("Add Employee");
        btnAddedEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddedEmployeeActionPerformed(evt);
            }
        });

        jLabel16.setText("Hourly Rate:");

        tfHourlyRate.setBackground(new java.awt.Color(255, 255, 255));
        tfHourlyRate.setBorder(null);
        tfHourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHourlyRateActionPerformed(evt);
            }
        });

        jLabel17.setText("Phone Allowance:");

        tfPhoneAllowance.setBackground(new java.awt.Color(255, 255, 255));
        tfPhoneAllowance.setBorder(null);
        tfPhoneAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneAllowanceActionPerformed(evt);
            }
        });

        jLabel18.setText("Clothing Allowance: ");

        tfClothingAllowance.setBackground(new java.awt.Color(255, 255, 255));
        tfClothingAllowance.setBorder(null);
        tfClothingAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClothingAllowanceActionPerformed(evt);
            }
        });

        jLabel19.setText("Rice Subsidy:");

        tfRiceSubsidy.setBackground(new java.awt.Color(255, 255, 255));
        tfRiceSubsidy.setBorder(null);
        tfRiceSubsidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRiceSubsidyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPosition))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPhoneNumber))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfEmployeeNum))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfClothingAllowance))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfHourlyRate))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfBasicSalary))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfGrossSemi))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfPhilHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfPagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel17)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfRiceSubsidy)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddedEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfEmployeeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfPhilHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfPagIbig, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAddedEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstNameActionPerformed

    private void tfBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBirthdayActionPerformed

    private void tfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNumberActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfSssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSssActionPerformed

    private void tfPhilHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhilHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhilHealthActionPerformed

    private void tfTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTinActionPerformed

    private void tfPagIbigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPagIbigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPagIbigActionPerformed

    private void tfPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPositionActionPerformed

    private void tfStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStatusActionPerformed

    private void tfSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupervisorActionPerformed

    private void tfBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBasicSalaryActionPerformed

    private void tfGrossSemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGrossSemiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGrossSemiActionPerformed

    private void btnAddedEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddedEmployeeActionPerformed
    String employeeNum = tfEmployeeNum.getText();
    String firstName = tfFirstName.getText();
    String lastName = tfLastName.getText();
    String birthday = tfBirthday.getText();
    String address = tfAddress.getText();
    String phoneNumber = tfPhoneNumber.getText();
    String sss = tfSss.getText();
    String philHealth = tfPhilHealth.getText();
    String tin = tfTin.getText();
    String pagIbig = tfPagIbig.getText();
    String employmentStatus = tfStatus.getText();
    String position = tfPosition.getText();
    String supervisor = tfSupervisor.getText();
    String basicSalary = tfBasicSalary.getText();
    String riceSubsidy = tfRiceSubsidy.getText();
    String phoneAllowance = tfPhoneAllowance.getText();
    String clothingAllowance = tfClothingAllowance.getText();
    String hourlyRate = tfHourlyRate.getText();
    String grossSemi = tfGrossSemi.getText();

    try {
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/payroll_db", "root", "mmdcaoop");

        String sql = "INSERT INTO employee (employee_id, first_name, last_name, birthday, address, phone_number, sss_number, philhealth_number, tin_number, pagibig_number, employment_status, position, supervisor, basic_salary, rice_subsidy, phone_allowance, clothing_allowance, hourly_rate, gross_semi_monthly)"
                   + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, employeeNum);
        stmt.setString(2, firstName);
        stmt.setString(3, lastName);
        stmt.setString(4, birthday);
        stmt.setString(5, address);
        stmt.setString(6, phoneNumber);
        stmt.setString(7, sss);
        stmt.setString(8, philHealth);
        stmt.setString(9, tin);
        stmt.setString(10, pagIbig);
        stmt.setString(11, employmentStatus);
        stmt.setString(12, position);
        stmt.setString(13, supervisor);
        stmt.setString(14, basicSalary);
        stmt.setString(15, riceSubsidy);
        stmt.setString(16, phoneAllowance);
        stmt.setString(17, clothingAllowance);
        stmt.setString(18, hourlyRate);
        stmt.setString(19, grossSemi);

        int rowsInserted = stmt.executeUpdate();

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Employee added successfully!");

            if (hrFrame != null) {
                hrFrame.loadEmployeeData(); 
            }

            SwingUtilities.getWindowAncestor(this).dispose();
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    }//GEN-LAST:event_btnAddedEmployeeActionPerformed

    private void tfHourlyRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHourlyRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHourlyRateActionPerformed

    private void tfPhoneAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneAllowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneAllowanceActionPerformed

    private void tfClothingAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClothingAllowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClothingAllowanceActionPerformed

    private void tfRiceSubsidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRiceSubsidyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRiceSubsidyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddedEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfBasicSalary;
    private javax.swing.JTextField tfBirthday;
    private javax.swing.JTextField tfClothingAllowance;
    private javax.swing.JTextField tfEmployeeNum;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfGrossSemi;
    private javax.swing.JTextField tfHourlyRate;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPagIbig;
    private javax.swing.JTextField tfPhilHealth;
    private javax.swing.JTextField tfPhoneAllowance;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRiceSubsidy;
    private javax.swing.JTextField tfSss;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfSupervisor;
    private javax.swing.JTextField tfTin;
    // End of variables declaration//GEN-END:variables
}
