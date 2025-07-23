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
- MySQL
- JDBC
- NetBeans IDE
- JasperReports

**How to Run
**
Clone this repository:

bash
Copy
Edit
git clone https://github.com/yourusername/MotorPH-Payroll-System.git
Import the project into NetBeans or any Java IDE.

Create the payroll_db database in MySQL and import the included SQL dump.

Set database credentials in DBConnection.java:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/payroll_db";
String user = "root";
String password = "yourpassword";
Run Main.java to launch the system.
