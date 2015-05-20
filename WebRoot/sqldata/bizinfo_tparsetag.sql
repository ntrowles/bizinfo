CREATE DATABASE  IF NOT EXISTS `bizinfo` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `bizinfo`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bizinfo
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tparsetag`
--

DROP TABLE IF EXISTS `tparsetag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tparsetag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `urlid` int(11) NOT NULL,
  `content` varchar(10000) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tparsetag`
--

LOCK TABLES `tparsetag` WRITE;
/*!40000 ALTER TABLE `tparsetag` DISABLE KEYS */;
INSERT INTO `tparsetag` VALUES (1,1,'div[class=main]; table[class=border_5]; td[height=25]; a[href]'),(2,2,'div[class=row-wrapper clearfix row-3-wrapper col-count-3 cols-1-2-3]; div[class=panel-col panel-col-1]; span[class=field-content]; a[href]'),(3,3,'div[id=content]; h2[class=post-title]; a[href]'),(4,4,'div[id=postlist]; a[class=post]'),(10,2,'div[class=row-wrapper clearfix row-6-wrapper col-count-3 cols-1-2-3]; div[class=panel-col panel-col-1]; span[class=field-content]; a[href]'),(11,2,'div[class=row-wrapper clearfix row-8-wrapper col-count-3 cols-1-2-3]; div[class=panel-col panel-col-1]; span[class=field-content]; a[href]'),(12,5,'li[class=menu_3], a=class=current; ul; li[class=menu_4]; a[href]'),(13,5,'li[class=menu_3]; ul; li[class=menu_4]; a[href]'),(14,6,'a[class=s xst]'),(15,7,'a[class=s xst]');
/*!40000 ALTER TABLE `tparsetag` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-13 14:20:22
