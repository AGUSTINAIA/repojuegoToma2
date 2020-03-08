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
-- Table structure for table `respuestas`
--

DROP TABLE IF EXISTS `respuestas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `respuestas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `es_correcta` bit(1) DEFAULT NULL,
  `una_respuesta` varchar(255) NOT NULL,
  `pregunta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKptndav2td8pqi7e51ihgq95gp` (`pregunta_id`),
  CONSTRAINT `FKptndav2td8pqi7e51ihgq95gp` FOREIGN KEY (`pregunta_id`) REFERENCES `preguntas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=144 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuestas`
--

LOCK TABLES `respuestas` WRITE;
/*!40000 ALTER TABLE `respuestas` DISABLE KEYS */;
INSERT INTO `respuestas` VALUES (1,_binary '\0','1801',1),(2,_binary '','1810',1),(3,_binary '\0','1816',1),(4,_binary '\0','Arnaldo',2),(5,_binary '','Armando',2),(6,_binary '\0','Ronaldo',2),(7,_binary '\0','Mariano Grondona',3),(8,_binary '','Diego Maradona',3),(9,_binary '\0','Susana Gimenez',3),(10,_binary '\0','Pappo',4),(11,_binary '','Ciro Fogliatta',4),(12,_binary '\0','Kubero Diaz',4),(13,_binary '\0','Tupungato, Mendoza',5),(14,_binary '','Montepissis, Catamarca/La Rioja',5),(15,_binary '\0','Ojos Del Salado, Tandil',5),(16,_binary '\0','1970',6),(17,_binary '','1967',6),(18,_binary '\0','1972',6),(19,_binary '\0','Tres',7),(20,_binary '','Dos',7),(21,_binary '\0','Uno',7),(22,_binary '\0','Cordobazo',8),(23,_binary '\0','Conquista del Desierto',8),(24,_binary '','Revolucion De Mayo',8),(25,_binary '\0','Silla',9),(26,_binary '','Mesita',9),(27,_binary '\0','Cajonera',9),(28,_binary '','La pelota',10),(29,_binary '\0','Las medias',10),(30,_binary '\0','El piso recién encerado por Mamá',10),(31,_binary '\0','Belen Succi',11),(32,_binary '\0','Maria Cecilia Rognoni',11),(33,_binary '','Luciana Aymar',11),(34,_binary '\0','Cinco',12),(35,_binary '\0','Siete',12),(36,_binary '','Cuatro',12),(37,_binary '','1880',13),(38,_binary '\0','1914',13),(39,_binary '\0','1893',13),(40,_binary '\0','Noroeste',14),(41,_binary '','Litoral',14),(42,_binary '\0','Patagonia',14),(43,_binary '','Neuquen',15),(44,_binary '\0','Rio Negro',15),(45,_binary '\0','Santa Cruz',15),(46,_binary '\0','Parana',16),(47,_binary '\0','Bermejo',16),(48,_binary '','Salado Norte',16),(49,_binary '\0','Literatura',17),(50,_binary '\0','Medicina',17),(51,_binary '','Quimica',17),(52,_binary '\0','Realizar investigaciones sobre el cancer',18),(53,_binary '','Forma profesionales en física e ingeniería nuclear',18),(54,_binary '\0','Forma profesionales en quimica, bioquimica y ciencias biologicas',18),(55,_binary '\0','Compras dolares.',19),(56,_binary '\0','Cargas la sube',19),(57,_binary '','Alto Guiso!!!!',19),(58,_binary '','26',20),(59,_binary '\0','15',20),(60,_binary '\0','Un Misterio',20),(61,_binary '','Lorna',21),(62,_binary '\0','Norma',21),(63,_binary '\0','Wanda',21),(64,_binary '\0','Porque se dijo en la tele',22),(65,_binary '\0','Porque es carisima',22),(66,_binary '','No hay pollllque',22),(67,_binary '\0','Babas... muchas babas',23),(68,_binary '\0','que es una neurona?',23),(69,_binary '\0','estoy \"muerte\" asique no tengo neuronas',23),(70,_binary '','todas las anteriores son correctas',23),(71,_binary '','Automagicamente',24),(72,_binary '','No lo sabemos aun',24),(73,_binary '','Si sos creyente ya sabes a quien asignarle la responsabilidad',24),(74,_binary '','Todas son correctas',24),(75,_binary '','1935',25),(76,_binary '\0','1980',25),(77,_binary '\0','1975',25),(78,_binary '\0','Terere',26),(79,_binary '','Mate',26),(80,_binary '\0','Café',26),(81,_binary '\0','Carlos Saul Menem',27),(82,_binary '','Fernando De La Rua',27),(83,_binary '\0','Carlos Bilardo',27),(84,_binary '\0','Villano',28),(85,_binary '','Vicentico',28),(86,_binary '\0','Miranda',28),(87,_binary '\0','La 25',29),(88,_binary '','Viejas Locas',29),(89,_binary '\0','Ratones Paranoicos',29),(90,_binary '\0','Los Rodriguez',30),(91,_binary '\0','Soda Estereo',30),(92,_binary '','Los Abuelos de la Nada',30),(93,_binary '','Luca Prodan',31),(94,_binary '','Gustavo Cerati',31),(95,_binary '\0','Pappo',31),(96,_binary '\0','Salta',32),(97,_binary '','Cordoba',32),(98,_binary '\0','Mendoza',32),(99,_binary '','El poncho',33),(100,_binary '\0','La chancleta',33),(101,_binary '\0','Las boleadoras',33),(102,_binary '\0','2002',34),(103,_binary '\0','2003',34),(104,_binary '','2001',34),(105,_binary '','San Miguel de Tucuman',35),(106,_binary '','Ciudad de Buenos Aires',35),(107,_binary '\0','San Salvador de Jujuy',35),(108,_binary '\0','1979',36),(109,_binary '','1982',36),(110,_binary '\0','1983',36),(111,_binary '\0','Juan Manuel Fangio',37),(112,_binary '','Carlos Saul Menem ',37),(113,_binary '\0','Domingo Felipe Cavallo',37),(114,_binary '\0','1812',38),(115,_binary '','1817',38),(116,_binary '\0','1817',38),(117,_binary '\0','1950',39),(118,_binary '\0','1942',39),(119,_binary '','1894',39),(120,_binary '','Boedo',40),(121,_binary '\0','La boca',40),(122,_binary '\0','Paternal',40),(123,_binary '\0','Hockey',41),(124,_binary '','Judo',41),(125,_binary '\0','Karate',41),(126,_binary '\0','Jujuy',42),(127,_binary '\0','Salta',42),(128,_binary '','La Rioja',42),(129,_binary '','219 Km',43),(130,_binary '\0','119 Km',43),(131,_binary '\0','319 Km',43),(132,_binary '\0','18',44),(133,_binary '\0','19',44),(134,_binary '','37',44),(135,_binary '','Juan Vusetich',45),(136,_binary '\0','Ramon Lorenzo Falcon',45),(137,_binary '\0','Patricio Ugarte',45),(138,_binary '\0','Claudio Fernandez',46),(139,_binary '','Jose Fandi',46),(140,_binary '\0','Eduardo Parra',46),(141,_binary '','Bernardo Houssay',47),(142,_binary '\0','Cesar Milstein',47),(143,_binary '\0','René Favaloro',47);
/*!40000 ALTER TABLE `respuestas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-08 17:21:03
