CREATE DATABASE  IF NOT EXISTS `payroll_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `payroll_db`;
-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: payroll_db
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `sss_number` varchar(20) DEFAULT NULL,
  `philhealth_number` varchar(20) DEFAULT NULL,
  `tin_number` varchar(20) DEFAULT NULL,
  `pagibig_number` varchar(20) DEFAULT NULL,
  `employment_status` varchar(20) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `supervisor` varchar(100) DEFAULT NULL,
  `basic_salary` decimal(10,2) DEFAULT NULL,
  `rice_subsidy` decimal(10,2) DEFAULT NULL,
  `phone_allowance` decimal(10,2) DEFAULT NULL,
  `clothing_allowance` decimal(10,2) DEFAULT NULL,
  `gross_semi_monthly` decimal(10,2) DEFAULT NULL,
  `hourly_rate` decimal(10,2) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Sample','Employee','1990-08-07','#25 Hello World, Java Code','966-889-370','40-2511815-0','820126853952','442-605-657-000','441093369646','Regular','Sample Position','Sample Supervisor',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'employee'),(2,'Sample','HR','1973-04-14','SAMPLE 66/77 Mann Views, Luisiana 1263 Dinagat Islands','529-705-439','11-5062972-7','177451189665','971-711-280-000','171519773969','Regular',' SAMPLE HR Rank and File','SAMPLE De Leon, Selena',24000.00,1500.00,1000.00,1000.00,12000.00,142.82,'HR'),(3,'Sample','Finance','1981-12-12','SAMPLE 66/77 Mann Views, Luisiana 1263 Dinagat Islands','526-639-511','11-5062972-7','708988234853','604-997-793-000','260107732354','Regular','SAMPLE Account Rank and File','SAMPLE De Leon, Selena',22500.00,1500.00,1000.00,1000.00,11250.00,133.93,'FINANCE'),(10001,'Garcia','Manuel III','1983-10-11','Valero Carpark Building Valero Street 1227, Makati City','966-860-270','44-4506057-3','820126853951','442-605-657-000','691295330870','Regular','Chief Executive Officer',NULL,90000.00,1500.00,2000.00,1000.00,45000.00,535.71,NULL),(10002,'Lim','Antonio','1988-06-19','San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite','171-867-411','52-2061274-9','331735646338','683-102-776-000','663904995411','Regular','Chief Operating Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,NULL),(10003,'Aquino','Bianca Sofia','1989-08-04','Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City','966-889-370','30-8870406-2','177451189665','971-711-280-000','171519773969','Regular','Chief Finance Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,NULL),(10004,'Reyes','Isabella','1994-06-16','460 Solanda Street Intramuros 1000, Manila','786-868-477','40-2511815-0','341911411254','876-809-437-000','416946776041','Regular','Chief Marketing Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,NULL),(10005,'Hernandez','Eduard','1989-09-23','National Highway, Gingoog,  Misamis Occidental','088-861-012','50-5577638-1','957436191812','031-702-374-000','952347222457','Regular','IT Operations and Systems','Lim, Antonio',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL),(10006,'Villanueva','Andrea Mae','1988-02-14','17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands','918-621-603','49-1632020-8','382189453145','317-674-022-000','441093369646','Regular','HR Manager','Lim, Antonio',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL),(10007,'San Jose','Brad','1996-03-15','99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi','797-009-261','40-2400714-1','239192926939','672-474-690-000','210850209964','Regular','HR Team Leader','Villanueva, Andrea Mae',42975.00,1500.00,800.00,800.00,21488.00,255.80,NULL),(10008,'Romualdez','Alice','1992-05-14','12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte','983-606-799','55-4476527-2','545652640232','888-572-294-000','211385556888','Regular','HR Rank and File','San, Jose Brad',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10009,'Atienza','Rosie','1948-09-24','90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte','266-036-427','41-0644692-3','708988234853','604-997-793-000','260107732354','Regular','HR Rank and File','San, Jose Brad',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10010,'Alvaro','Roderick','1988-03-30','#284 T. Morato corner, Scout Rallos Street, Quezon City','053-381-386','64-7605054-4','578114853194','525-420-419-000','799254095212','Regular','Accounting Head','Aquino, Bianca Sofia',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL),(10011,'Salcedo','Anthony','1993-09-14','93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate','070-766-300','26-9647608-3','126445315651','210-805-911-000','218002473454','Regular','Payroll Manager','Alvaro, Roderick',50825.00,1500.00,1000.00,1000.00,25413.00,302.53,NULL),(10012,'Lopez','Josie','1987-01-14','49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro','478-355-427','44-8563448-3','431709011012','218-489-737-000','113071293354','Regular','Payroll Team Leader','Salcedo, Anthony',38475.00,1500.00,800.00,800.00,19238.00,229.02,NULL),(10013,'Farala','Martha','1942-01-11','42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte','329-034-366','45-5656375-0','233693897247','210-835-851-000','631130283546','Regular','Payroll Rank and File','Salcedo, Anthony',24000.00,1500.00,500.00,500.00,12000.00,142.86,NULL),(10014,'Martinez','Leila','1970-07-11','37/46 Kulas Roads, Maragondon 0962 Quirino','877-110-749','27-2090996-4','515741057496','275-792-513-000','101205445886','Regular','Payroll Rank and File','Salcedo, Anthony',24000.00,1500.00,500.00,500.00,12000.00,142.86,NULL),(10015,'Romualdez','Fredrick','1985-03-10','22A/52 Lubowitz Meadows, Pililla 4895 Zambales','023-079-009','26-8768374-1','308366860059','598-065-761-000','223057707853','Regular','Account Manager','Lim, Antonio',53500.00,1500.00,1000.00,1000.00,26750.00,318.45,NULL),(10016,'Mata','Christian','1987-10-21','90 O\'Keefe Spur Apt. 379, Catigbian 2772 Sulu','783-776-744','49-2959312-6','824187961962','103-100-522-000','631052853464','Regular','Account Team Leader','Romualdez, Fredrick',42975.00,1500.00,800.00,800.00,21488.00,255.80,NULL),(10017,'De Leon','Selena','1975-02-20','89A Armstrong Trace, Compostela 7874 Maguindanao','975-432-139','27-2090208-8','587272469938','482-259-498-000','719007608464','Regular','Account Team Leader','Romualdez, Fredrick',41850.00,1500.00,800.00,800.00,20925.00,249.11,NULL),(10018,'San Jose','Allison','1986-06-24','08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union','179-075-129','45-3251383-0','745148459521','121-203-336-000','114901859343','Regular','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10019,'Rosario','Cydney','1996-10-06','93A/21 Berge Points, Tapaz 2180 Quezon','868-819-912','49-1629900-2','579253435499','122-244-511-000','265104358643','Regular','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10020,'Bautista','Mark','1991-02-12','65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino','683-725-348','49-1647342-5','399665157135','273-970-941-000','260054585575','Regular','Account Rank and File','Mata, Christian',23250.00,1500.00,500.00,500.00,11625.00,138.39,NULL),(10021,'Lazaro','Darlene','1985-11-25','47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino','740-721-558','45-5617168-2','606386917510','354-650-951-000','104907708845','Probationary','Account Rank and File','Mata, Christian',23250.00,1500.00,500.00,500.00,11625.00,138.39,NULL),(10022,'Delos Santos','Kolby','1980-02-26','06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur','739-443-033','52-0109570-6','357451271274','187-500-345-000','113017988667','Probationary','Account Rank and File','Mata, Christian',24000.00,1500.00,500.00,500.00,12000.00,142.86,NULL),(10023,'Santos','Vella','1983-12-31','99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur','955-879-269','52-9883524-3','548670482885','101-558-994-000','360028104576','Probationary','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10024,'Del Rosario','Tomas','1978-12-18','80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque','882-550-989','45-5866331-6','953901539995','560-735-732-000','913108649964','Probationary','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10025,'Tolentino','Jacklyn','1984-05-19','96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao','675-757-366','47-1692793-0','753800654114','841-177-857-000','210546661243','Probationary','Account Rank and File','De Leon, Selena',24000.00,1500.00,500.00,500.00,12000.00,142.86,NULL),(10026,'Gutierrez','Percival','1970-12-18','58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur','512-899-876','40-9504657-8','797639382265','502-995-671-000','210897095686','Probationary','Account Rank and File','De Leon, Selena',24750.00,1500.00,500.00,500.00,12375.00,147.32,NULL),(10027,'Manalaysay','Garfield','1986-08-28','60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur','948-628-136','45-3298166-4','810909286264','336-676-445-000','211274476563','Probationary','Account Rank and File','De Leon, Selena',24750.00,1500.00,500.00,500.00,12375.00,147.32,NULL),(10028,'Villegas','Lizeth','1981-12-12','66/77 Mann Views, Luisiana 1263 Dinagat Islands','332-372-215','40-2400719-4','934389652994','210-395-397-000','122238077997','Probationary','Account Rank and File','De Leon, Selena',24000.00,1500.00,500.00,500.00,12000.00,142.86,NULL),(10029,'Ramos','Carol','1978-08-20','72/70 Stamm Spurs, Bustos 4550 Iloilo','250-700-389','60-1152206-4','351830469744','395-032-717-000','212141893454','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10030,'Maceda','Emelia','1973-04-14','50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija','973-358-041','54-1331005-0','465087894112','215-973-013-000','515012579765','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10031,'Aguilar','Delia','1989-01-27','95 Cremin Junction, Surallah 2809 Cotabato','529-705-439','52-1859253-1','136451303068','599-312-588-000','110018813465','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,NULL),(10032,'Castro','John Rafael','1992-02-09','Hi-way, Yati, Liloan Cebu','332-424-955','26-7145133-4','601644902402','404-768-309-000','697764069311','Regular','Sales & Marketing','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL),(10033,'Martinez','Carlos Ian','1990-11-16','Bulala, Camalaniugan','078-854-208','11-5062972-7','380685387212','256-436-296-000','993372963726','Regular','Supply Chain and Logistics','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL),(10034,'Santos','Beatriz','1990-08-07','Agapita Building, Metro Manila','526-639-511','20-2987501-5','918460050077','911-529-713-000','874042259378','Regular','Customer Service and Relations','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_backup`
--

DROP TABLE IF EXISTS `employee_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_backup` (
  `employee_id` int NOT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `sss_number` varchar(20) DEFAULT NULL,
  `philhealth_number` varchar(20) DEFAULT NULL,
  `tin_number` varchar(20) DEFAULT NULL,
  `pagibig_number` varchar(20) DEFAULT NULL,
  `employment_status` varchar(20) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `supervisor` varchar(100) DEFAULT NULL,
  `basic_salary` decimal(10,2) DEFAULT NULL,
  `rice_subsidy` decimal(10,2) DEFAULT NULL,
  `phone_allowance` decimal(10,2) DEFAULT NULL,
  `clothing_allowance` decimal(10,2) DEFAULT NULL,
  `gross_semi_monthly` decimal(10,2) DEFAULT NULL,
  `hourly_rate` decimal(10,2) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_backup`
--

LOCK TABLES `employee_backup` WRITE;
/*!40000 ALTER TABLE `employee_backup` DISABLE KEYS */;
INSERT INTO `employee_backup` VALUES (10001,'Garcia','Manuel III','1983-10-11','Valero Carpark Building Valero Street 1227, Makati City','966-860-270','44-4506057-3','820126853951','442-605-657-000','691295330870','Regular','Chief Executive Officer',NULL,90000.00,1500.00,2000.00,1000.00,45000.00,535.71,'active'),(10002,'Lim','Antonio','1988-06-19','San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite','171-867-411','52-2061274-9','331735646338','683-102-776-000','663904995411','Regular','Chief Operating Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,'active'),(10003,'Aquino','Bianca Sofia','1989-08-04','Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City','966-889-370','30-8870406-2','177451189665','971-711-280-000','171519773969','Regular','Chief Finance Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,'active'),(10004,'Reyes','Isabella','1994-06-16','460 Solanda Street Intramuros 1000, Manila','786-868-477','40-2511815-0','341911411254','876-809-437-000','416946776041','Regular','Chief Marketing Officer','Garcia, Manuel III',60000.00,1500.00,2000.00,1000.00,30000.00,357.14,'active'),(10005,'Hernandez','Eduard','1989-09-23','National Highway, Gingoog,  Misamis Occidental','088-861-012','50-5577638-1','957436191812','031-702-374-000','952347222457','Regular','IT Operations and Systems','Lim, Antonio',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active'),(10006,'Villanueva','Andrea Mae','1988-02-14','17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands','918-621-603','49-1632020-8','382189453145','317-674-022-000','441093369646','Regular','HR Manager','Lim, Antonio',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active'),(10007,'San Jose','Brad','1996-03-15','99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi','797-009-261','40-2400714-1','239192926939','672-474-690-000','210850209964','Regular','HR Team Leader','Villanueva, Andrea Mae',42975.00,1500.00,800.00,800.00,21488.00,255.80,'active'),(10008,'Romualdez','Alice','1992-05-14','12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte','983-606-799','55-4476527-2','545652640232','888-572-294-000','211385556888','Regular','HR Rank and File','San, Jose Brad',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10009,'Atienza','Rosie','1948-09-24','90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte','266-036-427','41-0644692-3','708988234853','604-997-793-000','260107732354','Regular','HR Rank and File','San, Jose Brad',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10010,'Alvaro','Roderick','1988-03-30','#284 T. Morato corner, Scout Rallos Street, Quezon City','053-381-386','64-7605054-4','578114853194','525-420-419-000','799254095212','Regular','Accounting Head','Aquino, Bianca Sofia',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active'),(10011,'Salcedo','Anthony','1993-09-14','93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate','070-766-300','26-9647608-3','126445315651','210-805-911-000','218002473454','Regular','Payroll Manager','Alvaro, Roderick',50825.00,1500.00,1000.00,1000.00,25413.00,302.53,'active'),(10012,'Lopez','Josie','1987-01-14','49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro','478-355-427','44-8563448-3','431709011012','218-489-737-000','113071293354','Regular','Payroll Team Leader','Salcedo, Anthony',38475.00,1500.00,800.00,800.00,19238.00,229.02,'active'),(10013,'Farala','Martha','1942-01-11','42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte','329-034-366','45-5656375-0','233693897247','210-835-851-000','631130283546','Regular','Payroll Rank and File','Salcedo, Anthony',24000.00,1500.00,500.00,500.00,12000.00,142.86,'active'),(10014,'Martinez','Leila','1970-07-11','37/46 Kulas Roads, Maragondon 0962 Quirino','877-110-749','27-2090996-4','515741057496','275-792-513-000','101205445886','Regular','Payroll Rank and File','Salcedo, Anthony',24000.00,1500.00,500.00,500.00,12000.00,142.86,'active'),(10015,'Romualdez','Fredrick','1985-03-10','22A/52 Lubowitz Meadows, Pililla 4895 Zambales','023-079-009','26-8768374-1','308366860059','598-065-761-000','223057707853','Regular','Account Manager','Lim, Antonio',53500.00,1500.00,1000.00,1000.00,26750.00,318.45,'active'),(10016,'Mata','Christian','1987-10-21','90 O\'Keefe Spur Apt. 379, Catigbian 2772 Sulu','783-776-744','49-2959312-6','824187961962','103-100-522-000','631052853464','Regular','Account Team Leader','Romualdez, Fredrick',42975.00,1500.00,800.00,800.00,21488.00,255.80,'active'),(10017,'De Leon','Selena','1975-02-20','89A Armstrong Trace, Compostela 7874 Maguindanao','975-432-139','27-2090208-8','587272469938','482-259-498-000','719007608464','Regular','Account Team Leader','Romualdez, Fredrick',41850.00,1500.00,800.00,800.00,20925.00,249.11,'active'),(10018,'San Jose','Allison','1986-06-24','08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union','179-075-129','45-3251383-0','745148459521','121-203-336-000','114901859343','Regular','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10019,'Rosario','Cydney','1996-10-06','93A/21 Berge Points, Tapaz 2180 Quezon','868-819-912','49-1629900-2','579253435499','122-244-511-000','265104358643','Regular','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10020,'Bautista','Mark','1991-02-12','65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino','683-725-348','49-1647342-5','399665157135','273-970-941-000','260054585575','Regular','Account Rank and File','Mata, Christian',23250.00,1500.00,500.00,500.00,11625.00,138.39,'active'),(10021,'Lazaro','Darlene','1985-11-25','47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino','740-721-558','45-5617168-2','606386917510','354-650-951-000','104907708845','Probationary','Account Rank and File','Mata, Christian',23250.00,1500.00,500.00,500.00,11625.00,138.39,'active'),(10022,'Delos Santos','Kolby','1980-02-26','06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur','739-443-033','52-0109570-6','357451271274','187-500-345-000','113017988667','Probationary','Account Rank and File','Mata, Christian',24000.00,1500.00,500.00,500.00,12000.00,142.86,'active'),(10023,'Santos','Vella','1983-12-31','99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur','955-879-269','52-9883524-3','548670482885','101-558-994-000','360028104576','Probationary','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10024,'Del Rosario','Tomas','1978-12-18','80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque','882-550-989','45-5866331-6','953901539995','560-735-732-000','913108649964','Probationary','Account Rank and File','Mata, Christian',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10025,'Tolentino','Jacklyn','1984-05-19','96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao','675-757-366','47-1692793-0','753800654114','841-177-857-000','210546661243','Probationary','Account Rank and File','De Leon, Selena',24000.00,1500.00,500.00,500.00,12000.00,142.86,'active'),(10026,'Gutierrez','Percival','1970-12-18','58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur','512-899-876','40-9504657-8','797639382265','502-995-671-000','210897095686','Probationary','Account Rank and File','De Leon, Selena',24750.00,1500.00,500.00,500.00,12375.00,147.32,'active'),(10027,'Manalaysay','Garfield','1986-08-28','60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur','948-628-136','45-3298166-4','810909286264','336-676-445-000','211274476563','Probationary','Account Rank and File','De Leon, Selena',24750.00,1500.00,500.00,500.00,12375.00,147.32,'active'),(10028,'Villegas','Lizeth','1981-12-12','66/77 Mann Views, Luisiana 1263 Dinagat Islands','332-372-215','40-2400719-4','934389652994','210-395-397-000','122238077997','Probationary','Account Rank and File','De Leon, Selena',24000.00,1500.00,500.00,500.00,12000.00,142.86,'active'),(10029,'Ramos','Carol','1978-08-20','72/70 Stamm Spurs, Bustos 4550 Iloilo','250-700-389','60-1152206-4','351830469744','395-032-717-000','212141893454','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10030,'Maceda','Emelia','1973-04-14','50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija','973-358-041','54-1331005-0','465087894112','215-973-013-000','515012579765','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10031,'Aguilar','Delia','1989-01-27','95 Cremin Junction, Surallah 2809 Cotabato','529-705-439','52-1859253-1','136451303068','599-312-588-000','110018813465','Probationary','Account Rank and File','De Leon, Selena',22500.00,1500.00,500.00,500.00,11250.00,133.93,'active'),(10032,'Castro','John Rafael','1992-02-09','Hi-way, Yati, Liloan Cebu','332-424-955','26-7145133-4','601644902402','404-768-309-000','697764069311','Regular','Sales & Marketing','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active'),(10033,'Martinez','Carlos Ian','1990-11-16','Bulala, Camalaniugan','078-854-208','11-5062972-7','380685387212','256-436-296-000','993372963726','Regular','Supply Chain and Logistics','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active'),(10034,'Santos','Beatriz','1990-08-07','Agapita Building, Metro Manila','526-639-511','20-2987501-5','918460050077','911-529-713-000','874042259378','Regular','Customer Service and Relations','Reyes, Isabella',52670.00,1500.00,1000.00,1000.00,26335.00,313.51,'active');
/*!40000 ALTER TABLE `employee_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payslip`
--

DROP TABLE IF EXISTS `payslip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payslip` (
  `employee_id` int DEFAULT NULL,
  `basic_salary` decimal(10,2) DEFAULT NULL,
  `rice_subsidy` decimal(10,2) DEFAULT NULL,
  `phone_allowance` decimal(10,2) DEFAULT NULL,
  `clothing_allowance` decimal(10,2) DEFAULT NULL,
  `total_allowance` decimal(10,2) GENERATED ALWAYS AS (((`rice_subsidy` + `phone_allowance`) + `clothing_allowance`)) STORED,
  `gross_income` decimal(10,2) GENERATED ALWAYS AS ((`basic_salary` + `total_allowance`)) STORED,
  `sss_deduction` decimal(10,2) DEFAULT NULL,
  `pagibig_deduction` decimal(10,2) DEFAULT NULL,
  `philhealth_deduction` decimal(10,2) DEFAULT NULL,
  `tax_deduction` decimal(10,2) DEFAULT NULL,
  `total_deductions` decimal(10,2) GENERATED ALWAYS AS ((((`sss_deduction` + `pagibig_deduction`) + `philhealth_deduction`) + `tax_deduction`)) STORED,
  `net_pay` decimal(10,2) GENERATED ALWAYS AS ((`gross_income` - `total_deductions`)) STORED,
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `payslip_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payslip`
--

LOCK TABLES `payslip` WRITE;
/*!40000 ALTER TABLE `payslip` DISABLE KEYS */;
INSERT INTO `payslip` (`employee_id`, `basic_salary`, `rice_subsidy`, `phone_allowance`, `clothing_allowance`, `sss_deduction`, `pagibig_deduction`, `philhealth_deduction`, `tax_deduction`) VALUES (1,15000.00,1500.00,500.00,1000.00,500.00,200.00,300.00,1000.00);
/*!40000 ALTER TABLE `payslip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` enum('EMPLOYEE','HR','FINANCE') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'employee','123','EMPLOYEE'),(2,'hr','123','HR'),(3,'finance','123','FINANCE');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-20 13:43:59
