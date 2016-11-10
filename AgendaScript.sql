-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Agenda
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Agenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Agenda` DEFAULT CHARACTER SET utf8 ;
USE `Agenda` ;

-- -----------------------------------------------------
-- Table `Agenda`.`Setor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Agenda`.`Setor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(64) NULL,
  `ramal` Int NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Agenda`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Agenda`.`Funcionario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(90) NULL,
  `endereco` VARCHAR(64) NULL,
  `cidade/estado` VARCHAR(64) NULL,
  `tel_residencial` VARCHAR(14) NULL,
  `tel_comercial1` VARCHAR(14) NULL,
  `tel_comercial2` VARCHAR(14) NULL,
  `celular1` VARCHAR(14) NULL,
  `celular2` VARCHAR(14) NULL,
  `celular3` VARCHAR(14) NULL,
  `email` VARCHAR(64) NULL,
  `dia` VARCHAR(45) NULL,
  `horario` VARCHAR(90) NULL,
  `observacao` VARCHAR(150) NULL,
  `id_setor` INT NULL,
  `docente` INT NULL,
  `inativo` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_setor_idx` (`id_setor` ASC),
  CONSTRAINT `id_setor`
    FOREIGN KEY (`id_setor`)
    REFERENCES `Agenda`.`Setor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Agenda`.`Consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Agenda`.`Consulta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(90) NULL,
  `endereco` VARCHAR(64) NULL,
  `cidade/estado` VARCHAR(64) NULL,
  `telefone` VARCHAR(14) NULL,
  `setor` VARCHAR(64) NULL,
  `docente` INT NULL,
  `inativo` INT NULL,
  `id_funcionario` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_funcionario_idx` (`id_funcionario` ASC),
  CONSTRAINT `id_funcionario`
    FOREIGN KEY (`id_funcionario`)
    REFERENCES `Agenda`.`Funcionario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `Agenda`.`Usuario`(
 `id` INT NOT NULL AUTO_INCREMENT,
 `nome` VARCHAR(90) NOT NULL,
 `usuario` VARCHAR(20) NOT NULL UNIQUE,
 `senha` VARCHAR(20) NOT NULL,
 `admin` boolean NOT NULL,
  PRIMARY KEY (`id`)
);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

insert into Usuario values(NULL,"usuário root","root","root",1);
insert into Usuario values(NULL,"usuario a","a","a",1);
insert into Setor values(NULL,"NUPSI",10100);
insert into Setor values(NULL,"CPD",10101);

insert into Funcionario values(NULL,"Danilo Vieira","R. Paraná, 23","Frutal/MG","3423-0000","3421-0000","3421-0005","(34)99214-0000","(34)99214-0005","(34)99214-0010","danilo@gmail.com","2ª,3ª,4ª,5ª,6ª","13:00 ate 16:00","nenhuma",1,0,0);
insert into Funcionario values(NULL,"Gustavo Pinottti","R. Arapongas, 30","Frutal/MG","3423-0001","3421-0001","3421-0006","(34)99214-0001","(34)99214-0006","(34)99214-0011","gustavo@live.com","2ª,3ª,4ª,5ª,6ª","13:30 ate 16:30","nenhuma",1,0,0);
insert into Funcionario values(NULL,"Murillo Taruôco Cuervo","R. Rotary, 27","Frutal/MG","3423-0002","3421-0002","3421-0007","(34)99214-0002","(34)99214-0007","(34)99214-0012","murilo@live.com","2ª,3ª,4ª,5ª,6ª","14:00 ate 17:00","nenhuma",1,0,0);
insert into Funcionario values(NULL,"Fabio Viera","R. Luiz Vieira de Queiroz, 150","Frutal/MG","3423-0003","3421-0003","3421-0008","(34)99214-0003","(34)99214-0008","(34)99214-0013","fabio@live.com","2ª,3ª,4ª,5ª,6ª","14:30 ate 17:30","nenhuma",2,0,0);
insert into Funcionario values(NULL,"Juliana Bernardes","Av. Romero Alves, 78","Frutal/MG","3423-0004","3421-0004","3421-0009","(34)99214-0004","(34)99214-0009","(34)99214-0014","juliana@live.com","2ª,3ª,4ª,5ª,6ª","15:00 ate 18:00","nenhuma",2,0,0);


