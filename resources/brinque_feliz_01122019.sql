-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Dez-2019 às 20:54
-- Versão do servidor: 10.4.8-MariaDB
-- versão do PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `brinque_feliz_01122019`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `brinquedos`
--

CREATE TABLE `brinquedos` (
  `id_brinquedo` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `codigo_de_barras` mediumtext NOT NULL,
  `preco` decimal(10,0) NOT NULL,
  `id_fabricante` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_fornecedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `categorias`
--

CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `rg` varchar(255) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `comprovantes`
--

CREATE TABLE `comprovantes` (
  `id_comprovante` int(11) NOT NULL,
  `nome_cliente` varchar(50) DEFAULT NULL,
  `rg_cliente` varchar(50) DEFAULT NULL,
  `nome_funcionario` varchar(50) DEFAULT NULL,
  `cpf_funcionario` varchar(50) DEFAULT NULL,
  `id_forma_pagamento` varchar(255) DEFAULT NULL,
  `id_venda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fabricantes`
--

CREATE TABLE `fabricantes` (
  `id_fabricante` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cnpj` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `id_fornecedor` int(11) NOT NULL,
  `cnpj` varchar(25) NOT NULL,
  `nome_fantasia` varchar(255) DEFAULT NULL,
  `razao_social` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id_funcionario` int(11) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `telefone_residencial` varchar(255) DEFAULT NULL,
  `telefone_celular` varchar(255) DEFAULT NULL,
  `email` varchar(25) NOT NULL,
  `data_contratacao` date DEFAULT NULL,
  `is_adm` tinyint(1) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(25) NOT NULL,
  `data_nascimento` date DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_estoque`
--

CREATE TABLE `itens_estoque` (
  `id_item_estoque` int(11) NOT NULL,
  `id_brinquedo` int(11) NOT NULL,
  `data_aquisicao` date DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_venda`
--

CREATE TABLE `itens_venda` (
  `id_item_venda` int(11) NOT NULL,
  `id_venda` int(11) NOT NULL,
  `id_brinquedo` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Acionadores `itens_venda`
--
DELIMITER $$
CREATE TRIGGER `valida_quantidade_item_de_venda_insert` AFTER INSERT ON `itens_venda` FOR EACH ROW begin 
		
        if ! (new.id_brinquedo in ( select itens_estoque.id_brinquedo from itens_estoque ) ) then 
			
            signal sqlstate '45000' set message_text = 'o brinquedo selecionado nunca foi inserido no estoque'; 
		
        elseif new.quantidade > ( select sum(itens_estoque.quantidade) from itens_estoque where itens_estoque.id_brinquedo = new.id_brinquedo group by itens_estoque.id_brinquedo)  then 
			signal sqlstate '45000' set message_text = 'a quantidade de produtos em uma venda nao pode ser maior que a em estoque'; 
		elseif ( ( select count( * ) from itens_venda where itens_venda.id_venda = new.id_venda and itens_venda.id_brinquedo = new.id_brinquedo) ) > 1 and ( select count(*) from itens_venda ) > 1 then 
			signal sqlstate '45000' set message_text = 'esse item de venda ja foi inserido, nao e possivel inseri-lo novamente, modifique-o ou o remova'; 
		
		
        end if; 
	
    end
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `valida_quantidade_item_de_venda_update` AFTER UPDATE ON `itens_venda` FOR EACH ROW begin 
		
		if new.quantidade > ( select sum(itens_estoque.quantidade) from itens_estoque where itens_estoque.id_brinquedo = new.id_brinquedo group by itens_estoque.id_brinquedo) then 
			signal sqlstate '45000' set message_text = 'a quantidade de produtos em uma venda nao pode ser maior que a em estoque'; 
		
        end if; 
	
    end
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipos_pagamento`
--

CREATE TABLE `tipos_pagamento` (
  `id_tipo_pagamento` int(11) NOT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `id_venda` int(11) NOT NULL,
  `data_venda` date DEFAULT NULL,
  `valor` decimal(10,0) DEFAULT NULL,
  `id_funcionario` int(11) DEFAULT NULL,
  `id_forma_pagamento` varchar(255) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `fechada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `brinquedos`
--
ALTER TABLE `brinquedos`
  ADD PRIMARY KEY (`id_brinquedo`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_fabricante` (`id_fabricante`),
  ADD KEY `id_fornecedor` (`id_fornecedor`);

--
-- Índices para tabela `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_categoria`),
  ADD UNIQUE KEY `nome` (`nome`);

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `rg` (`rg`);

--
-- Índices para tabela `comprovantes`
--
ALTER TABLE `comprovantes`
  ADD PRIMARY KEY (`id_comprovante`),
  ADD KEY `id_venda` (`id_venda`);

--
-- Índices para tabela `fabricantes`
--
ALTER TABLE `fabricantes`
  ADD PRIMARY KEY (`id_fabricante`);

--
-- Índices para tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`id_fornecedor`),
  ADD UNIQUE KEY `cnpj` (`cnpj`);

--
-- Índices para tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Índices para tabela `itens_estoque`
--
ALTER TABLE `itens_estoque`
  ADD PRIMARY KEY (`id_item_estoque`),
  ADD UNIQUE KEY `id_brinquedo` (`id_brinquedo`);

--
-- Índices para tabela `itens_venda`
--
ALTER TABLE `itens_venda`
  ADD PRIMARY KEY (`id_item_venda`),
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_brinquedo` (`id_brinquedo`);

--
-- Índices para tabela `tipos_pagamento`
--
ALTER TABLE `tipos_pagamento`
  ADD PRIMARY KEY (`id_tipo_pagamento`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_funcionario` (`id_funcionario`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `brinquedos`
--
ALTER TABLE `brinquedos`
  ADD CONSTRAINT `brinquedos_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id_categoria`),
  ADD CONSTRAINT `brinquedos_ibfk_2` FOREIGN KEY (`id_fabricante`) REFERENCES `fabricantes` (`id_fabricante`),
  ADD CONSTRAINT `brinquedos_ibfk_3` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedores` (`id_fornecedor`);

--
-- Limitadores para a tabela `comprovantes`
--
ALTER TABLE `comprovantes`
  ADD CONSTRAINT `comprovantes_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `vendas` (`id_venda`);

--
-- Limitadores para a tabela `itens_estoque`
--
ALTER TABLE `itens_estoque`
  ADD CONSTRAINT `itens_estoque_ibfk_1` FOREIGN KEY (`id_brinquedo`) REFERENCES `brinquedos` (`id_brinquedo`);

--
-- Limitadores para a tabela `itens_venda`
--
ALTER TABLE `itens_venda`
  ADD CONSTRAINT `itens_venda_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `vendas` (`id_venda`),
  ADD CONSTRAINT `itens_venda_ibfk_2` FOREIGN KEY (`id_brinquedo`) REFERENCES `brinquedos` (`id_brinquedo`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
