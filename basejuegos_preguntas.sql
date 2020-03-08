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
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enunciado` varchar(255) NOT NULL,
  `puntaje` int(11) NOT NULL,
  `tema_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKskh7y7ooatieus16q59agosxm` (`tema_id`),
  CONSTRAINT `FKskh7y7ooatieus16q59agosxm` FOREIGN KEY (`tema_id`) REFERENCES `temas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
INSERT INTO `preguntas` VALUES (1,'¿En que año fue la Revolucion de Mayo?',5,3),(2,'¿Cual es el segundo nombre del futbolista Diego Maradona?',5,6),(3,'A quien pertenece la frase -Se te escapo la tortuga-',5,1),(4,'cual de los siguientes musicos nunca formo parte de Los Abuelos de la Nada',5,2),(5,'El Aconcagua es el pico mas alto del pais, cual es el segundo',5,4),(6,'¿En que año el Dr. rene Favaloro realizo la primer cirugia de bypass aortocoronario?',5,5),(7,'¿Cuántas invasiones inglesas se produjeron en tiempos del Virreinato',5,3),(8,'¿Cómo se le llamó al proceso de independencia argentino?',4,3),(9,'¿Que efectos tiene la cumbia?',4,1),(10,'¿Qué es lo que no se mancha?',4,1),(11,'¿Qué jugadora de hockey sobre césped ha ganado 7 veces el premio a la mejor jugadora del mundo de 2013?',4,6),(12,'¿Cuántas finales del mundo jugó la Selección Argentina de fútbol?',4,6),(13,'El tango surgió en la zona del Río de la Plata alrededor de la década de...',4,2),(14,'¿De qué región es caracteristico el chamame?',4,2),(15,'¿En qué provincia se encuentra el lago Traful?',5,4),(16,'¿Cuál de estos rios es mas extensos?',5,4),(17,'¿Qué premio novel ganó Luis Federico Leloir?',3,5),(18,'El instituto Balseiro es una unidad académica que se dedica a...',5,5),(19,'¿Que haces con $15 ?',10,1),(20,'¿Que edad tiene Edu?',10,1),(21,'¿como se llama la fan de Susana?',10,1),(22,'porque sibarita es tan rica',10,1),(23,'¿Cuantas neuronas viven en tu cabeza despues de este curso?',20,1),(24,'¿Como Hicimos para que esto funcione en forma medianamente  digna?',20,1),(25,'¿En que año murió Carlos Gardel?',5,2),(26,'¿Cuál es la infusión típica en Argentina?',5,1),(27,'¿Quien dijo la frase \"Dicen que soy aburrido\"?',5,1),(28,'¿Cual es el nombre solista que utiliza el cantante de los Fabulosos Cádilacs?',5,2),(29,'¿En que banda cantaba Piti Alvarez antes de Intoxicados?',5,2),(30,'¿A que banda pertenece la canción Costumbres Argentinas?',5,2),(31,'¿Como se llamaba el cantante de Sumo?',5,2),(32,'¿En que provincia nació el cantante Paulo Londra?',5,2),(33,'¿Que revolea \"La Sole\"?',5,1),(34,'¿En que año se formó la banda \"Bandana\"?',5,2),(35,'¿En que ciudad se declaró nuestra independencia?',5,3),(36,'¿En que año comenzó la guerra de Malvinas?',5,3),(37,'¿Quien dijo la frase \"Siganme, no los voy a defraudar\"?',5,1),(38,'¿En que año el General San Martín cruzó los Andes?',5,3),(39,'¿En que año tuvo lugar el mayor terremoto de San Juan?',5,3),(40,'¿A que barrio porteño pertenece el club de fútbol San Lorenzo?',5,6),(41,'¿En que deporte se destaca Paula \"Peque\" Pareto?',5,6),(42,'¿En que provincia se encuentra el Parque Nacional Talampaya?',5,4),(43,'¿Cual es la anchura máxima del Rio de la Plata?',5,4),(44,'¿Cantos  volcanes activos hay en el pais?',5,4),(45,'¿Quien fue el creador de la identificación por huellas digitales?',5,5),(46,'En el año 1953, que argentino invento el secador de piso?',5,5),(47,'¿Qué argentino fue el primer ganador del premio nobel de medicina?',5,5);
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
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
