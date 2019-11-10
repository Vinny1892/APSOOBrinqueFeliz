CREATE DATABASE  IF NOT EXISTS `brinque_feliz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `brinque_feliz`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: brinque_feliz
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `brinquedos`
--

DROP TABLE IF EXISTS `brinquedos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brinquedos` (
  `id_brinquedo` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_categoria` int(11) NOT NULL,
  `codigo_de_barras` mediumtext,
  `preco` decimal(10,0) DEFAULT NULL,
  `id_fabricante` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_fornecedor` int(11) NOT NULL,
  PRIMARY KEY (`id_brinquedo`),
  UNIQUE KEY `id_brinquedo` (`id_brinquedo`),
  KEY `fk_brinquedos_categorias` (`id_categoria`),
  KEY `fk_brinquedos_fabricantes` (`id_fabricante`),
  KEY `fk_brinquedos_fornecedores` (`id_fornecedor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brinquedos`
--

LOCK TABLES `brinquedos` WRITE;
/*!40000 ALTER TABLE `brinquedos` DISABLE KEYS */;
/*!40000 ALTER TABLE `brinquedos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cartoes`
--

DROP TABLE IF EXISTS `cartoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cartoes` (
  `id_cartao` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `titular` varchar(255) DEFAULT NULL,
  `cogigo_seguranca` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `data_validade` date DEFAULT NULL,
  `id_tipo_cartao` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cartao`),
  UNIQUE KEY `id_cartao` (`id_cartao`),
  KEY `fk_cartoes_tipos_cartoes` (`id_tipo_cartao`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartoes`
--

LOCK TABLES `cartoes` WRITE;
/*!40000 ALTER TABLE `cartoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `cartoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias` (
  `id_categoria` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`),
  UNIQUE KEY `id_categoria` (`id_categoria`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias_brinquedos`
--

DROP TABLE IF EXISTS `categorias_brinquedos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias_brinquedos` (
  `id_categoria` int(11) NOT NULL,
  `id_brinquedo` int(11) NOT NULL,
  KEY `fk_categorias_brinquedos_categorias` (`id_categoria`),
  KEY `fk_categorias_brinquedos_brinquedos` (`id_brinquedo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias_brinquedos`
--

LOCK TABLES `categorias_brinquedos` WRITE;
/*!40000 ALTER TABLE `categorias_brinquedos` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias_brinquedos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheques`
--

DROP TABLE IF EXISTS `cheques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cheques` (
  `id_cheque` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `data_do_cheque` date DEFAULT NULL,
  `date_vencimento` date DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `agencia` varchar(255) DEFAULT NULL,
  `banco` varchar(255) DEFAULT NULL,
  `conta` varchar(255) DEFAULT NULL,
  `destinatario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cheque`),
  UNIQUE KEY `id_cheque` (`id_cheque`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheques`
--

LOCK TABLES `cheques` WRITE;
/*!40000 ALTER TABLE `cheques` DISABLE KEYS */;
/*!40000 ALTER TABLE `cheques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_cliente` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_pessoa` int(11) NOT NULL,
  `rg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `id_cliente` (`id_cliente`),
  KEY `fk_clientes_pessoas` (`id_pessoa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprovantes`
--

DROP TABLE IF EXISTS `comprovantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comprovantes` (
  `id_comprovante` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_venda` int(11) NOT NULL,
  PRIMARY KEY (`id_comprovante`),
  UNIQUE KEY `id_comprovante` (`id_comprovante`),
  KEY `fk_comprovantes_vendas` (`id_venda`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprovantes`
--

LOCK TABLES `comprovantes` WRITE;
/*!40000 ALTER TABLE `comprovantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprovantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estoques`
--

DROP TABLE IF EXISTS `estoques`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estoques` (
  `id_estoque` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `local_estoque` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_estoque`),
  UNIQUE KEY `id_estoque` (`id_estoque`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estoques`
--

LOCK TABLES `estoques` WRITE;
/*!40000 ALTER TABLE `estoques` DISABLE KEYS */;
/*!40000 ALTER TABLE `estoques` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fabricantes`
--

DROP TABLE IF EXISTS `fabricantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabricantes` (
  `id_fabricante` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_fabricante`),
  UNIQUE KEY `id_fabricante` (`id_fabricante`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricantes`
--

LOCK TABLES `fabricantes` WRITE;
/*!40000 ALTER TABLE `fabricantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `fabricantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formas_pagamento`
--

DROP TABLE IF EXISTS `formas_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formas_pagamento` (
  `id_forma_pagamento` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tipo_pagamento` int(11) NOT NULL,
  `cartao` int(11) DEFAULT NULL,
  `cheque` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_forma_pagamento`),
  UNIQUE KEY `id_forma_pagamento` (`id_forma_pagamento`),
  KEY `fk_formas_pagamento_tipos_pagamento` (`tipo_pagamento`),
  KEY `fk_formas_pagamento_cartoes` (`cartao`),
  KEY `fk_formas_pagamento_cheques` (`cheque`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formas_pagamento`
--

LOCK TABLES `formas_pagamento` WRITE;
/*!40000 ALTER TABLE `formas_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `formas_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedores`
--

DROP TABLE IF EXISTS `fornecedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedores` (
  `id_fornecedor` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(255) DEFAULT NULL,
  `nome_fantasia` varchar(255) DEFAULT NULL,
  `razao_social` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_fornecedor`),
  UNIQUE KEY `id_fornecedor` (`id_fornecedor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedores`
--

LOCK TABLES `fornecedores` WRITE;
/*!40000 ALTER TABLE `fornecedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedores_fabricantes`
--

DROP TABLE IF EXISTS `fornecedores_fabricantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedores_fabricantes` (
  `id_fornecedor` int(11) NOT NULL,
  `id_fabricante` int(11) NOT NULL,
  KEY `fk_fornecedores_fabricantes_fornecedor` (`id_fornecedor`),
  KEY `fk_fornecedores_fabricantes_fabricantes` (`id_fabricante`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedores_fabricantes`
--

LOCK TABLES `fornecedores_fabricantes` WRITE;
/*!40000 ALTER TABLE `fornecedores_fabricantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedores_fabricantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios` (
  `id_funcionario` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `matricula` varchar(255) DEFAULT NULL,
  `telefone_residencial` varchar(255) DEFAULT NULL,
  `telefone_celular` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `data_contratacao` date DEFAULT NULL,
  `tipo_permissao` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `id_funcionario` (`id_funcionario`),
  UNIQUE KEY `login` (`login`),
  KEY `fk_funcionarios_tipos_permissao` (`tipo_permissao`),
  KEY `fk_funcionarios_pessoas` (`id_pessoa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itens_estoque`
--

DROP TABLE IF EXISTS `itens_estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itens_estoque` (
  `id_item_estoque` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_brinquedo` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `id_estoque` int(11) NOT NULL,
  PRIMARY KEY (`id_item_estoque`),
  UNIQUE KEY `id_item_estoque` (`id_item_estoque`),
  KEY `fk_itens_estoque_brinquedos` (`id_brinquedo`),
  KEY `fk_itens_estoque_estoques` (`id_estoque`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itens_estoque`
--

LOCK TABLES `itens_estoque` WRITE;
/*!40000 ALTER TABLE `itens_estoque` DISABLE KEYS */;
/*!40000 ALTER TABLE `itens_estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itens_venda`
--

DROP TABLE IF EXISTS `itens_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itens_venda` (
  `id_item_venda` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_venda` int(11) NOT NULL,
  `id_brinquedo` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_item_venda`),
  UNIQUE KEY `id_item_venda` (`id_item_venda`),
  KEY `fk_itens_venda_vendas` (`id_venda`),
  KEY `fk_itens_venda_brinquedos` (`id_brinquedo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itens_venda`
--

LOCK TABLES `itens_venda` WRITE;
/*!40000 ALTER TABLE `itens_venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `itens_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoas`
--

DROP TABLE IF EXISTS `pessoas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoas` (
  `id_pessoa` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pessoa`),
  UNIQUE KEY `id_pessoa` (`id_pessoa`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
/*!40000 ALTER TABLE `pessoas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_cartoes`
--

DROP TABLE IF EXISTS `tipos_cartoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_cartoes` (
  `id_tipo_cartao` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_cartao`),
  UNIQUE KEY `id_tipo_cartao` (`id_tipo_cartao`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_cartoes`
--

LOCK TABLES `tipos_cartoes` WRITE;
/*!40000 ALTER TABLE `tipos_cartoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos_cartoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_pagamento`
--

DROP TABLE IF EXISTS `tipos_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_pagamento` (
  `id_tipo_pagamento` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_pagamento`),
  UNIQUE KEY `id_tipo_pagamento` (`id_tipo_pagamento`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_pagamento`
--

LOCK TABLES `tipos_pagamento` WRITE;
/*!40000 ALTER TABLE `tipos_pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_permissao`
--

DROP TABLE IF EXISTS `tipos_permissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_permissao` (
  `id_permissao` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `permissao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_permissao`),
  UNIQUE KEY `id_permissao` (`id_permissao`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_permissao`
--

LOCK TABLES `tipos_permissao` WRITE;
/*!40000 ALTER TABLE `tipos_permissao` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos_permissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendas` (
  `id_venda` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `data_venda` date DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `id_funcionario` int(11) NOT NULL,
  `id_forma_pagamento` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  PRIMARY KEY (`id_venda`),
  UNIQUE KEY `id_venda` (`id_venda`),
  KEY `fk_vendas_funcionarios` (`id_funcionario`),
  KEY `fk_vendas_forma_pagamento` (`id_forma_pagamento`),
  KEY `fk_vendas_clientes` (`id_cliente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas`
--

LOCK TABLES `vendas` WRITE;
/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-09 22:14:51
