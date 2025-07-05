USE payroll_db;

INSERT INTO employee (
  employee_id, last_name, first_name, birthday, address, phone_number,
  sss_number, philhealth_number, tin_number, pagibig_number, employment_status,
  position, supervisor, basic_salary, rice_subsidy, phone_allowance,
  clothing_allowance, gross_semi_monthly, hourly_rate, username, password_hash, role, status
) VALUES
(10001, 'Garcia', 'Manuel III', '1983-10-11', 'Valero Carpark Building Valero Street 1227, Makati City', '966-860-270', '44-4506057-3', '820126853951', '442-605-657-000', '691295330870', 'Regular', 'Chief Executive Officer', NULL, 90000, 1500, 2000, 1000, 45000, 535.71, 'garciam', '<HASHED_PASSWORD>', 'admin', 'active'),
(10002, 'Lim', 'Antonio', '1988-06-19', 'San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite', '171-867-411', '52-2061274-9', '331735646338', '683-102-776-000', '663904995411', 'Regular', 'Chief Operating Officer', 'Garcia, Manuel III', 60000, 1500, 2000, 1000, 30000, 357.14, 'lima', '<HASHED_PASSWORD>', 'finance', 'active'),
(10003, 'Aquino', 'Bianca Sofia', '1989-08-04', 'Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City', '966-889-370', '30-8870406-2', '177451189665', '971-711-280-000', '171519773969', 'Regular', 'Chief Finance Officer', 'Garcia, Manuel III', 60000, 1500, 2000, 1000, 30000, 357.14, 'aquino', '<HASHED_PASSWORD>', 'finance', 'active'),
(10004, 'Reyes', 'Isabella', '1994-06-16', '460 Solanda Street Intramuros 1000, Manila', '786-868-477', '40-2511815-0', '341911411254', '876-809-437-000', '416946776041', 'Regular', 'Chief Marketing Officer', 'Garcia, Manuel III', 60000, 1500, 2000, 1000, 30000, 357.14, 'reyesi', '<HASHED_PASSWORD>', 'finance', 'active'),
(10005, 'Hernandez', 'Eduard', '1989-09-23', 'National Highway, Gingoog,  Misamis Occidental', '088-861-012', '50-5577638-1', '957436191812', '031-702-374-000', '952347222457', 'Regular', 'IT Operations and Systems', 'Lim, Antonio', 52670, 1500, 1000, 1000, 26335, 313.51, 'hernandeze', '<HASHED_PASSWORD>', 'it', 'active');