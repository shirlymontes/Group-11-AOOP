**MotorPH Payroll System**
A desktop-based Payroll System for MotorPH developed in Java using Java Swing for the GUI and MySQL for the backend database. 
This system supports HR, Finance, and Employee roles with secure login access, automated payroll generation, and employee management.

Features
- Login system with role-based access (Employee, HR, Finance)
- Automatic payroll computation
- Payslip generation and printing
- Real-time data loading using JDBC

**Tech Stack**
- Java (Swing)
- Maven
- MySQL
- JDBC
- NetBeans IDE
- JasperReports

**How to Run**
1. Clone this repository:
  -  git clone https://github.com/yourusername/MotorPH-Payroll-System.git
2. Import the project into NetBeans or any Java IDE.
3. Create the payroll_db database in MySQL and import the included SQL dump.
4. Set database credentials in DBConnection.java:
    String url = "jdbc:mysql://localhost:3306/payroll_db";
    String user = "root";
    String password = "yourpassword";
5. Run Main.java to launch the system.
