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
  `id` INT NOT NULL,
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
  `setor` VARCHAR(64) NULL,
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


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
