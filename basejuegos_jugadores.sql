-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: basejuegos
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugadores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) NOT NULL,
  `apodo` varchar(255) NOT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `provincia` varchar(255) DEFAULT NULL,
  `contraseña` varchar(20) NOT NULL,
  `contraseña2` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_42quka54b0cy3hksx4ykbwvxb` (`apodo`),
  UNIQUE KEY `UK_btxbms433os4vjuvhv185ylvf` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores`
--

LOCK TABLES `jugadores` WRITE;
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
INSERT INTO `jugadores` VALUES (1,'garay','estefi12','caba','elgaray@bpba.com','estefania',NULL,'',''),(3,'garay','florcita','caba','florchete@hotmail.com','florencia',NULL,'',''),(4,'cornejo','clara12','caba','clara@gmail.com','clara',NULL,'',''),(5,'garay','juli12','caba','juli@gmail.com','julia',NULL,'',''),(6,'bravo','laura12','caba','laura@gmail.com','laura','Ciudad Autónoma de Buenos Aires','',''),(7,'idgv','cjbdcj','chascomoooozzz','sahs','iugi','Buenos Aires','',''),(8,'carlos','elrober','roberto','roberto@gmail.com','roberto','Misiones','1221','1221'),(9,'garay','epi_garay','caba','epi_garay@hotmail.com','estefania','Ciudad Autónoma de Buenos Aires','12211221','1221121'),(10,'Entanga','tuherma','jdkeajf','tuhermanaentanga@gmail.com','Tuhermana','Tucumán','12345','12345'),(11,'garay','estefi','caba','prueba1@gmail.com','estefania','Ciudad Autónoma de Buenos Aires','1221','1221'),(12,'oviedo','pablito','cordoba','prueba2@gmail.com','pablo','Córdoba','1221','1221'),(13,'altamirano','cele','misiones','prueba3@gmail.com','jimena celeste','Misiones','1221','1221'),(14,'cornejo','luz','caba','claraluzgeller@hotmail.es','clara','Ciudad Autónoma de Buenos Aires','1234','123'),(15,'jdahjdhja','sdskjfks','neuquen','prueba4@gmail.com','batman','Neuquén','1221','1221');
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-08 17:21:01
