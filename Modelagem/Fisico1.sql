create database Agencia;

use Agencia;

CREATE TABLE Contato (
Email VARCHAR(10) PRIMARY KEY,
Nome VARCHAR(10),
Mensagem VARCHAR(10),
CPF NUMERIC(10)
);

CREATE TABLE Promocoes (
Cod_Pedido INTEGER PRIMARY KEY auto_increment,
Desconto NUMERIC(10),
Data_venda DATETIME
);

CREATE TABLE Passagens (
Destino VARCHAR(10),
Origem VARCHAR(10),
Cod_Viagem INTEGER PRIMARY KEY
);

CREATE TABLE Cliente (
Email VARCHAR(10),
Nome VARCHAR(10),
CPF NUMERIC(10) PRIMARY KEY,
Cod_Viagem INTEGER,
Cod_Pedido INTEGER,
FOREIGN KEY(Cod_Viagem) REFERENCES Passagens (Cod_Viagem),
FOREIGN KEY(Cod_Pedido) REFERENCES Promocoes (Cod_Pedido)
);

CREATE TABLE Endereco (
Endereco_PK INTEGER,
Cidade VARCHAR(10),
UF VARCHAR(10),
Logradouro VARCHAR(10),
PRIMARY KEY(Endereco_PK,Logradouro)
);
