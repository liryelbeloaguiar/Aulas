--PROJETO PARA CURSO: Java, MySQL - Sistema Completo

-- Criando a tabela tbusuarios

create table tbusuarios(
iduser integer,
usuario varchar(30) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null,
CONSTRAINT iduser_pk primary key (iduser)
);

--Descrição da tabela
desc tbusuarios;

--Inserindo dados na tabela (CRUD)
-- > Create - insert
insert into tbusuarios values(2,'Laraa','0000-0000','larinhab','654321');

-- > Read - select 
select * from tbusuarios;

-- Update -- update
update tbusuarios set fone = '222-222' where iduser=1;

-- Delete -- delete
delete from tbusuarios where iduser = '2';

-- -------------------------------------------------------

create table tbclientes(
idcli integer,
nome varchar(30) not null,
endcliente varchar(100),
fone varchar(15),
emailcliente varchar(50) not null unique,
CONSTRAINT idcli_pk primary key(idcli)
);

insert into tbclientes values(1,'Laraa','Rua Clovis cavalcante de lima','0000-0000','lararinha@gmail.com');
select * from tbclientes;