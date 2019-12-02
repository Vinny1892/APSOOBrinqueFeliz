-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 02-Dez-2019 às 21:57
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `brinque_feliz`
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

--
-- Extraindo dados da tabela `brinquedos`
--

INSERT INTO `brinquedos` (`id_brinquedo`, `id_categoria`, `nome`, `codigo_de_barras`, `preco`, `id_fabricante`, `descricao`, `id_fornecedor`) VALUES
(1, 1, 'Caixa de Lego', '4252665474856', '175', 1, 'Caixa de Lego pequena', 1),
(2, 1, 'Caixa de lego', '4225265474856', '350', 2, 'Caixa de Lego grande', 2),
(3, 2, 'Quebra Cabeça', '589416537', '89', 3, 'Quebra-cabeça 200 peças', 3),
(4, 3, 'Bateria', '234239492359', '155', 4, 'Bateria de som para crianças', 4),
(5, 4, 'Cubo Magico', '31241152546', '79', 5, 'Cubo magico iniciante', 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `categorias`
--

CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categorias`
--

INSERT INTO `categorias` (`id_categoria`, `nome`) VALUES
(8, 'Boneca Barbie'),
(6, 'Boneco de Heroi'),
(12, 'Brinquedos de Praia'),
(11, 'Carro de Controle Remoto'),
(9, 'Copos Infantis'),
(10, 'Lancheira'),
(1, 'Lego'),
(3, 'Musical'),
(5, 'Pelucia'),
(2, 'Quebra-Cabeca'),
(4, 'Raciocinio');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `rg` varchar(25) NOT NULL,
  `cpf` varchar(25) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `rg`, `cpf`, `nome`, `data_nascimento`, `endereco`, `cep`, `cidade`, `estado`) VALUES
(1, '2134141246', '4848412044', 'Jucelino Alves', '1990-11-04', 'Rua das Paineiras ', '547898', 'Campo Grande', 'Mato Grosso do Sul'),
(2, '15878616', '889785156', 'Marta Alves', '1989-03-20', 'Rua das aguas', '9875487', 'Campo Grande', 'Mato Grosso do Sul'),
(3, '981075156', '06385684', 'Bruna Fonseca', '1970-02-15', 'Avenida Mato Grosso', '84972400', 'Campo Grande', 'Mato Grosso do Sul'),
(4, '0032597', '998754152', 'Carlos Dias', '1995-09-04', 'Avenida Afonso Pena', '99875755', 'Campo Grande', 'Mato Grosso do Sul'),
(5, '7778954465', '000012525', 'Felipe Gonçalves', '1988-10-04', 'Avenida Senador Filinto Miller', '2222448', 'Campo Grande', 'Mato Grosso do Sul');

-- --------------------------------------------------------

--
-- Estrutura da tabela `comprovantes`
--

CREATE TABLE `comprovantes` (
  `id_comprovante` int(11) NOT NULL,
  `nome_cliente` varchar(50) DEFAULT NULL,
  `rg_cliente` varchar(25) DEFAULT NULL,
  `nome_funcionario` varchar(50) DEFAULT NULL,
  `cpf_funcionario` varchar(25) DEFAULT NULL,
  `forma_pagamento` varchar(255) DEFAULT NULL,
  `id_venda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fabricantes`
--

CREATE TABLE `fabricantes` (
  `id_fabricante` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cnpj` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fabricantes`
--

INSERT INTO `fabricantes` (`id_fabricante`, `nome`, `cnpj`) VALUES
(1, 'Estrela', '62565481'),
(2, 'Balila', '54158513'),
(3, 'Trol', '5123054'),
(4, 'GlassLite', '6487851'),
(5, 'Atma', '6548151');

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

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`id_fornecedor`, `cnpj`, `nome_fantasia`, `razao_social`, `endereco`, `cidade`, `estado`, `telefone`, `email`) VALUES
(1, '35465415', 'Joao LTDA', 'Joao Almeida ', 'Rua das Paineiras', 'Sao Paulo', 'Sao Paulo', '11 5487 4842', 'joaoalmeira@gmail.com'),
(2, '40465415', 'Felipe LTDA', 'Felipe Almeida', 'Rua das Aguas', 'Sao Paulo', 'Sao Paulo', '11 5487 4842', 'felipealmeira@gmail.com'),
(3, '1547865', 'Carlos LTDA', 'Dias Dias', 'Rua 9', 'Curitiba', 'Parana', '21 5487 4842', 'carlosalmeira@gmail.com'),
(4, '7841265', 'Drandao LTDA', 'Juliane Brandao ', 'Rua Sete', 'Curitiba', 'Parana', '21 5487 4842', 'brandao@gmail.com'),
(5, '14585415', 'Foz LTDA', 'Bruna Fonseca ', 'Rua Sete', 'Curitiba', 'Parana', '21 5487 4842', 'brandao@gmail.com');

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

--
-- Extraindo dados da tabela `itens_estoque`
--

INSERT INTO `itens_estoque` (`id_item_estoque`, `id_brinquedo`, `data_aquisicao`, `quantidade`) VALUES
(1, 1, '2019-11-27', 100),
(2, 2, '2019-12-02', 50),
(3, 5, '2019-11-13', 50),
(4, 3, '2019-11-22', 2);

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
  `forma_pagamento` varchar(255) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brinquedos`
--
ALTER TABLE `brinquedos`
  ADD PRIMARY KEY (`id_brinquedo`),
  ADD KEY `id_categoria` (`id_categoria`),
  ADD KEY `id_fabricante` (`id_fabricante`),
  ADD KEY `id_fornecedor` (`id_fornecedor`);

--
-- Indexes for table `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`id_categoria`),
  ADD UNIQUE KEY `nome` (`nome`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `rg` (`rg`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Indexes for table `comprovantes`
--
ALTER TABLE `comprovantes`
  ADD PRIMARY KEY (`id_comprovante`),
  ADD KEY `id_venda` (`id_venda`);

--
-- Indexes for table `fabricantes`
--
ALTER TABLE `fabricantes`
  ADD PRIMARY KEY (`id_fabricante`),
  ADD UNIQUE KEY `cnpj` (`cnpj`);

--
-- Indexes for table `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`id_fornecedor`),
  ADD UNIQUE KEY `cnpj` (`cnpj`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Indexes for table `itens_estoque`
--
ALTER TABLE `itens_estoque`
  ADD PRIMARY KEY (`id_item_estoque`),
  ADD UNIQUE KEY `id_brinquedo` (`id_brinquedo`);

--
-- Indexes for table `itens_venda`
--
ALTER TABLE `itens_venda`
  ADD PRIMARY KEY (`id_item_venda`),
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_brinquedo` (`id_brinquedo`);

--
-- Indexes for table `tipos_pagamento`
--
ALTER TABLE `tipos_pagamento`
  ADD PRIMARY KEY (`id_tipo_pagamento`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `id_funcionario` (`id_funcionario`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Constraints for dumped tables
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
