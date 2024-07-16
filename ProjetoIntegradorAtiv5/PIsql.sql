DROP DATABASE IF EXISTS empresa;
CREATE DATABASE empresa;
USE empresa;
CREATE TABLE pedido (
id int PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(150),
cpf VARCHAR(150),
telefone VARCHAR(150),
email VARCHAR(150),
produto VARCHAR(150),
quantidade VARCHAR(150)
);


SELECT * FROM empresa.pedido;