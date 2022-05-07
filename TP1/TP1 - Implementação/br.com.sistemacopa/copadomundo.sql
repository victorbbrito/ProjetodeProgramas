CREATE DATABASE  IF NOT EXISTS `copa_do_mundo` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `copa_do_mundo`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: copa_do_mundo
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `fase_de_grupos`
--

DROP TABLE IF EXISTS `fase_de_grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fase_de_grupos` (
  `pais` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `grupo` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `pontos` int DEFAULT NULL,
  `partidas` int DEFAULT '3',
  `vitorias` int DEFAULT NULL,
  `empates` int DEFAULT NULL,
  `derrotas` int DEFAULT NULL,
  PRIMARY KEY (`pais`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fase_de_grupos`
--

LOCK TABLES `fase_de_grupos` WRITE;
/*!40000 ALTER TABLE `fase_de_grupos` DISABLE KEYS */;
INSERT INTO `fase_de_grupos` VALUES ('Alemanha','G',7,3,2,1,0),('Argélia','H',4,3,1,1,1),('Argentina','F',9,3,3,0,0),('Austrália','B',0,3,0,0,3),('Bélgica','H',9,3,3,0,0),('Bósnia','F',3,3,1,0,2),('Brasil','A',7,3,2,1,0),('Camarões','A',0,3,0,0,3),('Chile','B',6,3,2,0,1),('Colômbia','C',9,3,3,0,0),('Coreia do Sul','H',1,3,0,1,2),('Costa do Marfim','C',3,3,1,0,2),('Costa Rica','D',7,3,2,1,0),('Croácia','A',3,3,1,0,2),('Equador','E',4,3,1,1,1),('Espanha','B',3,3,1,0,2),('Estados Unidos','G',4,3,1,1,1),('França','E',7,3,2,1,0),('Gana','G',1,3,0,1,2),('Grécia','C',4,3,1,1,1),('Holanda','B',9,3,3,0,0),('Honduras','E',0,3,0,0,3),('Inglaterra','D',1,3,0,1,2),('Irã','F',1,3,0,1,2),('Itália','D',3,3,1,0,2),('Japão','C',1,3,0,1,2),('México','A',7,3,2,1,0),('Nigéria','F',4,3,1,1,1),('Portugal','G',4,3,1,1,1),('Rússia','H',2,3,0,2,1),('Suíça','E',6,3,2,0,1),('Uruguai','D',6,3,2,0,1);
/*!40000 ALTER TABLE `fase_de_grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogos`
--

DROP TABLE IF EXISTS `jogos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jogos` (
  `time1` varchar(50) NOT NULL,
  `time2` varchar(50) NOT NULL,
  `datas` varchar(20) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `estadio` varchar(80) NOT NULL,
  `placar` varchar(3) NOT NULL,
  `penalti` varchar(3) DEFAULT NULL,
  `tipo` varchar(20) NOT NULL,
  `resultado` varchar(30) NOT NULL,
  `jogoscol` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogos`
--

LOCK TABLES `jogos` WRITE;
/*!40000 ALTER TABLE `jogos` DISABLE KEYS */;
INSERT INTO `jogos` VALUES ('Argentina','Alemanha','13-07-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','0x1','xxx','final','Alemanha',NULL),('Holanda','Argentina','09-07-2014','São Paulo','São Paulo','Estádio Neo Química Arena','0x0','2x4','Semi Final 2','Argentina',NULL),('Brasil','Alemanha','08-07-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','1x7','xxx','Semi Final 1','Alemanha',NULL),('Costa Rica','Holanda','05-07-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','0x0','3x4','Quarta de Final 4','Holanda',NULL),('Argentina','Bélgica','05-07-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','1x0','xxx','Quarta de Final 3','Argentina',NULL),('Colômbia','Brasil','04-07-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','1x2','xxx','Quarta de Final 2','Brasil',NULL),('França','Alemanha','04-07-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','0x1','xxx','Quarta de Final 1','Alemanha',NULL),('Estados Unidos','Bélgica','01-07-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','1x2','xxx','Oitavas de Final 8','Bélgica',NULL),('Suíça','Argentina','01-07-2014','São Paulo','São Paulo','Estádio Neo Química Arena','0x1','xxx','Oitavas de Final 7','Argentina',NULL),('Argélia','Alemanha','30-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','1x2','xxx','Oitavas de Final 6','Alemanha',NULL),('França','Nigéria','30-06-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','2x0','xxx','Oitavas de Final 5','França',NULL),('Costa Rica','Grécia','29-06-2014','Pernambuco','São Lourenço da Mata','Estádio Governador Carlos Wilson Campos - Arena Pernambuco','1x1','5x3','Oitavas de Final 4','Costa Rica',NULL),('Holanda','México','29-06-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','2x1','xxx','Oitavas de Final 3','Holanda',NULL),('Colômbia','Uruguai','28-06-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','2x0','xxx','Oitavas de Final 2','Colômbia',NULL),('Brasil','Chile','28-06-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','1x1','3x2','Oitavas de Final 1','Brasil',NULL),('Argélia','Rússia','26-06-2014','Paraná','Curitiba','Estádio Joaquim Américo Guimarães - Arena da Baixada','1x1',NULL,'Fase de Grupos','Empate',NULL),('Coreia do Sul','Bélgica','26-06-2014','São Paulo','São Paulo','Estádio Neo Química Arena','0x1',NULL,'Fase de Grupos','Bélgica',NULL),('Portugal','Gana','26-06-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','2x1',NULL,'Fase de Grupos','Portugal',NULL),('Estados Unidos','Alemanha','26-06-2014','Pernambuco','São Lourenço da Mata','Estádio Governador Carlos Wilson Campos - Arena Pernambuco','0x1',NULL,'Fase de Grupos','Alemanha',NULL),('Honduras','Suíça','25-06-2014','Amazonas','Manaus','Arena da Amazônia – Vivaldo Lima','0x3',NULL,'Fase de Grupos','Suíça',NULL),('Equador','França','25-06-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','0x0',NULL,'Fase de Grupos','Empate',NULL),('Nigéria','Argentina','25-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','2x3',NULL,'Fase de Grupos','Argentina',NULL),('Bósnia','Irã','25-06-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','3x1',NULL,'Fase de Grupos','Bósnia',NULL),('Grécia','Costa do Marfim','24-06-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','2x1',NULL,'Fase de Grupos','Grécia',NULL),('Japão','Colômbia','24-06-2014','Mato Grosso','Cuiabá','Arena Pantanal','1x4',NULL,'Fase de Grupos','Colômbia',NULL),('Costa Rica','Inglaterra','24-06-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','0x0',NULL,'Fase de Grupos','Empate',NULL),('Itália','Uruguai','24-06-2014','Rio Grande do Norte','Natal','Arena das Dunas','0x1',NULL,'Fase de Grupos','Uruguai',NULL),('Croácia','México','23-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','1x3',NULL,'Fase de Grupos','México',NULL),('Brasil','Camarões','23-06-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','4x1',NULL,'Fase de Grupos','Brasil',NULL),('Holanda','Chile','23-06-2014','São Paulo','São Paulo','Estádio Neo Química Arena','2x0',NULL,'Fase de Grupos','Holanda',NULL),('Austrália','Espanha','23-06-2014','Paraná','Curitiba','Estádio Joaquim Américo Guimarães - Arena da Baixada','0x3',NULL,'Fase de Grupos','Espanha',NULL),('Estados Unidos','Portugal','22-06-2014','Amazonas','Manaus','Arena da Amazônia – Vivaldo Lima','2x2',NULL,'Fase de Grupos','Empate',NULL),('Coreia do Sul','Argélia','22-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','2x4',NULL,'Fase de Grupos','Argélia',NULL),('Bélgica','Rússia','22-06-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','1x0',NULL,'Fase de Grupos','Bélgica',NULL),('Nigéria','Bósnia','21-06-2014','Mato Grosso','Cuiabá','Arena Pantanal','1x0',NULL,'Fase de Grupos','Nigéria',NULL),('Alemanha','Gana','21-06-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','2x2',NULL,'Fase de Grupos','Empate',NULL),('Argentina','Irã','21-06-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','1x0',NULL,'Fase de Grupos','Argentina',NULL),('Honduras','Equador','20-06-2014','Paraná','Curitiba','Estádio Joaquim Américo Guimarães - Arena da Baixada','1x2',NULL,'Fase de Grupos','Equador',NULL),('Suíça','França','20-06-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','2x5',NULL,'Fase de Grupos','França',NULL),('Itália','Costa Rica','20-06-2014','Pernambuco','São Lourenço da Mata','Estádio Governador Carlos Wilson Campos - Arena Pernambuco','0x1',NULL,'Fase de Grupos','Costa Rica',NULL),('Japão','Grécia','19-06-2014','Rio Grande do Norte','Natal','Arena das Dunas','0x0',NULL,'Fase de Grupos','Empate',NULL),('Uruguai','Inglaterra','19-06-2014','São Paulo','São Paulo','Estádio Neo Química Arena','2x1',NULL,'Fase de Grupos','Uruguai',NULL),('Colômbia','Costa do Marfim','19-06-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','2x1',NULL,'Fase de Grupos','Colômbia',NULL),('Camarões','Croácia','18-06-2014','Amazonas','Manaus','Arena da Amazônia – Vivaldo Lima','0x4',NULL,'Fase de Grupos','Croácia',NULL),('Espanha','Chile','18-06-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','0x2',NULL,'Fase de Grupos','Chile',NULL),('Austrália','Holanda','18-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','2x3',NULL,'Fase de Grupos','Holanda',NULL),('Brasil','México','17-06-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','0x0',NULL,'Fase de Grupos','Empate',NULL),('Rússia','Coreia do Sul','17-06-2014','Mato Grosso','Cuiabá','Arena Pantanal','1x1',NULL,'Fase de Grupos','Empate',NULL),('Bélgica','Argélia','17-06-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','2x1',NULL,'Fase de Grupos','Bélgica',NULL),('Gana','Estados Unidos','16-06-2014','Rio Grande do Norte','Natal','Arena das Dunas','1x2',NULL,'Fase de Grupos','Estados Unidos',NULL),('Irã','Nigéria','16-06-2014','Paraná','Curitiba','Estádio Joaquim Américo Guimarães - Arena da Baixada','0x0',NULL,'Fase de Grupos','Empate',NULL),('Alemanha','Portugal','16-06-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','4x0',NULL,'Fase de Grupos','Alemanha',NULL),('Argentina','Bósnia','15-06-2014','Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã','2x1',NULL,'Fase de Grupos','Argentina',NULL),('França','Honduras','15-06-2014','Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio','3x0',NULL,'Fase de Grupos','França',NULL),('Suíça','Equador','15-06-2014','Distrito Federal','Brasília','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha','2x1',NULL,'Fase de Grupos','Suíça',NULL),('Costa do Marfim','Japão','14-06-2014','Pernambuco','São Lourenço da Mata','Estádio Governador Carlos Wilson Campos - Arena Pernambuco','2x1',NULL,'Fase de Grupos','Costa do Marfim',NULL),('Inglaterra','Itália','14-06-2014','Amazonas','Manaus','Arena da Amazônia – Vivaldo Lima','1x2',NULL,'Fase de Grupos','Itália',NULL),('Uruguai','Costa Rica','14-06-2014','Ceará','Fortaleza','Estádio Governador Plácido Castelo - Arena Castelão','1x3',NULL,'Fase de Grupos','Costa Rica',NULL),('Colômbia','Grécia','14-06-2014','Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão','3x0',NULL,'Fase de Grupos','Colômbia',NULL),('Chile','Austrália','13-06-2014','Mato Grosso','Cuiabá','Arena Pantanal','3x1',NULL,'Fase de Grupos','Chile',NULL),('Espanha','Holanda','13-06-2014','Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova','1x5',NULL,'Fase de Grupos','Holanda',NULL),('México','Camarões','13-06-2014','Rio Grande do Norte','Natal','Arena das Dunas','1x0',NULL,'Fase de Grupos','México',NULL),('Brasil','Croácia','12-06-2014','São Paulo','São Paulo','Estádio Neo Química Arena','3x1',NULL,'Fase de Grupos','Uruguai',NULL);
/*!40000 ALTER TABLE `jogos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locais`
--

DROP TABLE IF EXISTS `locais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locais` (
  `estado` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estadio` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locais`
--

LOCK TABLES `locais` WRITE;
/*!40000 ALTER TABLE `locais` DISABLE KEYS */;
INSERT INTO `locais` VALUES ('São Paulo','São Paulo','Neo Química Arena'),('Rio Grande do Norte','Natal','Arena das Dunas'),('Bahia','Salvador','Complexo Esportivo Cultural Octávio Mangabeira - Arena Fonte Nova'),('Mato Grosso','Cuiabá','Arena Pantanal'),('Minas Gerais','Belo Horizonte','Estádio Governador Magalhães Pinto - Mineirão'),('Ceará','Fortaleza','Estádio Governador Plácido Castelo - Castelão'),('Amazonas','Manaus','Arena da Amazônia – Vivaldo Lima'),('Pernambuco','São Lourenço da Mata','Estádio Governador Carlos Wilson Campos - Arena Pernambuco'),('Distrito Federal','Brasilia','Estádio Nacional de Brasília Mané Garrincha - Mané Garrincha'),('Rio Grande do Sul','Porto Alegre','Estádio José Pinheiro Borda - Beira Rio'),('Paraná','Curitiba','Estádio Joaquim Américo Guimarães - Arena da Baixada'),('Rio de Janeiro','Rio de Janeiro','Estádio Jornalista Mário Filho - Maracanã');
/*!40000 ALTER TABLE `locais` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-20 22:34:56
