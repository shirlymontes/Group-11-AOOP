# MotorPH Payroll System

A **Java Swing Desktop Application** for automating payroll processes in **MotorPH**. This system provides secure login, employee record management, payroll computation, and payslip generation. It supports three types of users: **Employee**, **HR**, and **Finance**.

---

##  Features

-  **Login Authentication**
  - Role-based access:
      - **Employee** – View attendance and payslips
      - **HR** – Manage employee records
      - **Finance** – Compute payroll and generate payslips

-  **Employee Management**
    - Add, update, delete employee profiles
    - Includes position, rate, department, and employment status

-  **Payroll Computation**
  - Automated calculation of:
    - Basic Pay
    - Deductions: SSS, PhilHealth, Pag-IBIG, Withholding Tax
    - Net Pay
  - Based on cut-off period and logged hours

- **Payslip Generation**
    - Auto-generated payslip with detailed breakdown
    - Printable and downloadable

---

## Tech Stack

- **Java SE 24**
- **Java Swing** (GUI Framework)
- **MySQL** – via **JDBC**
- **Maven** – Build & dependency management
- **NetBeans IDE 25**

---

## Installation & Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/shirlymontes//Group-11-AOOP.git
2. **Import the project into NetBeans or any Java IDE.**

3. **Create the payroll_db database in MySQL and import the included SQL dump.**

4. **Set database credentials in DBConnection.java:**
   ```bash
   String url = "jdbc:mysql://localhost:3306/payroll_db";
    String user = "root";
    String password = "yourpassword";
5. **Run and launch the system.**

## Sample Users
You can use the following credentials to log in:
usernames: HR, Employees, or Finance
password: 123

This project is developed for **academic purposes** only. 

