# 💼 Payroll System - MotorPH

A **Java Swing Desktop Application** for automating payroll processes in **MotorPH**. This system provides secure login, employee record management, attendance tracking, payroll computation, and payslip generation. It supports three types of users: **Employee**, **HR**, and **Finance**.

---

## 📌 Features

- 🔐 **Login Authentication**
  - Role-based access:
    - **Employee** – View attendance and payslips
    - **HR** – Manage employee records, attendance, and leave requests
    - **Finance** – Compute payroll and generate payslips

- 👤 **Employee Management**
  - Add, update, delete employee profiles
  - Includes position, rate, department, and employment status

- ⏱️ **Attendance Tracking**
  - Time-in and time-out logs
  - Accessible by HR and employees

- 📝 **Leave Management**
  - Leave request system for employees
  - HR can approve or reject requests

- 💰 **Payroll Computation**
  - Automated calculation of:
    - Basic Pay
    - Deductions: SSS, PhilHealth, Pag-IBIG, Withholding Tax
    - Net Pay
  - Based on cut-off period and logged hours

- 🧾 **Payslip Generation**
  - Auto-generated payslip with detailed breakdown
  - Printable and downloadable

---

## 🛠️ Tech Stack

- **Java SE 24**
- **Java Swing** (GUI Framework)
- **MySQL** – via **JDBC**
- **Maven** – Build & dependency management
- **NetBeans IDE 25**

---

## ⚙️ Installation & Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/PayrollSystem.git
