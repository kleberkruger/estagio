-- MySQL Workbench Synchronization
-- Generated: 2017-09-20 16:32
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Supervisor

CREATE SCHEMA `estagio` DEFAULT CHARACTER SET utf8;

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE TABLE IF NOT EXISTS `estagio`.`tb_endereco` (
  `end_id` INT(10) UNSIGNED NOT NULL,
  `end_logradouro` VARCHAR(255) NOT NULL,
  `end_numero` SMALLINT(5) NOT NULL,
  `end_complemento` VARCHAR(255) NULL DEFAULT NULL,
  `end_bairro` VARCHAR(255) NOT NULL,
  `end_cep` CHAR(8) NOT NULL,
  `end_referencia` VARCHAR(255) NULL DEFAULT NULL,
  `mun_codigo_ibge` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`end_id`),
  INDEX `fk_tb_endereco_tb_municipio_idx` (`mun_codigo_ibge` ASC),
  INDEX `fk_tb_endereco_tb_pessoa_idx` (`end_id` ASC),
  CONSTRAINT `fk_tb_endereco_tb_municipio_idx`
    FOREIGN KEY (`mun_codigo_ibge`)
    REFERENCES `estagio`.`tb_municipio` (`mun_codigo_ibge`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_endereco_tb_pessoa_idx`
    FOREIGN KEY (`end_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_municipio` (
  `mun_codigo_ibge` INT(10) UNSIGNED NOT NULL,
  `mun_nome` VARCHAR(255) NOT NULL,
  `mun_uf` ENUM('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 'SP', 'SE', 'TO') NOT NULL,
  PRIMARY KEY (`mun_codigo_ibge`),
  UNIQUE INDEX `mun_id_UNIQUE` (`mun_codigo_ibge` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_telefone` (
  `tel_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `tel_numero` VARCHAR(11) NOT NULL,
  `tel_ramal` VARCHAR(5) NULL DEFAULT NULL,
  `tel_uso` ENUM('PESSOAL', 'TRABALHO', 'RECADO') NOT NULL,
  `tel_contato` VARCHAR(255) NULL DEFAULT NULL,
  `tel_operadora` VARCHAR(32) NULL DEFAULT NULL,
  `tel_mensageiro` TINYINT(1) NULL DEFAULT NULL,
  `tel_prioridade` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `p_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`tel_id`),
  UNIQUE INDEX `tel_id_UNIQUE` (`tel_id` ASC),
  INDEX `fk_tb_telefone_tb_pessoa_idx` (`p_id` ASC),
  CONSTRAINT `fk_tb_telefone_tb_pessoa_idx`
    FOREIGN KEY (`p_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_curso` (
  `cs_codigo` SMALLINT(4) UNSIGNED ZEROFILL NOT NULL,
  `cs_nome` VARCHAR(255) NOT NULL,
  `cs_sigla` VARCHAR(32) NULL DEFAULT NULL,
  `cs_periodo` ENUM('MATUTINO', 'VESPERTINO', 'INTEGRAL', 'NOTURNO') NOT NULL,
  `cs_modalidade` ENUM('BACHARELADO', 'LICENCIATURA', 'SEQUENCIAL', 'TECNOLOGICO') NOT NULL,
  `cs_ativo` TINYINT(1) NOT NULL,
  `doc_id_coordenador` INT(10) UNSIGNED NOT NULL,
  `doc_id_presidente_coe` INT(10) UNSIGNED NULL DEFAULT NULL,
  `uni_id_unidade` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`cs_codigo`),
  UNIQUE INDEX `cur_id_UNIQUE` (`cs_codigo` ASC),
  INDEX `fk_tb_curso_tb_docente_idx` (`doc_id_coordenador` ASC),
  INDEX `fk_tb_curso_tb_unidade_idx` (`uni_id_unidade` ASC),
  INDEX `fk_tb_curso_tb_docente_coe_idx` (`doc_id_presidente_coe` ASC),
  CONSTRAINT `fk_tb_curso_tb_docente_idx`
    FOREIGN KEY (`doc_id_coordenador`)
    REFERENCES `estagio`.`tb_docente` (`doc_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_curso_tb_unidade_idx`
    FOREIGN KEY (`uni_id_unidade`)
    REFERENCES `estagio`.`tb_unidade` (`uni_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_curso_tb_docente_coe_idx`
    FOREIGN KEY (`doc_id_presidente_coe`)
    REFERENCES `estagio`.`tb_docente` (`doc_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_pessoa` (
  `p_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `p_tipo` ENUM('PESSOA_FISICA', 'PESSOA_JURIDICA') NOT NULL,
  `p_nome` VARCHAR(255) NOT NULL,
  `p_cpf_cnpj` VARCHAR(14) NOT NULL,
  `p_criado_em` DATETIME NOT NULL,
  `p_atualizado_em` DATETIME NOT NULL,
  PRIMARY KEY (`p_id`),
  UNIQUE INDEX `p_id_UNIQUE` (`p_id` ASC),
  UNIQUE INDEX `p_cpf_cnpj_UNIQUE` (`p_cpf_cnpj` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_unidade` (
  `uni_id` INT(10) UNSIGNED NOT NULL,
  `uni_sigla` VARCHAR(32) NOT NULL,
  `doc_id_responsavel` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`uni_id`),
  UNIQUE INDEX `uni_sigla_unidade_UNIQUE` (`uni_sigla` ASC),
  INDEX `fk_tb_unidade_tb_docente_idx` (`doc_id_responsavel` ASC),
  CONSTRAINT `fk_tb_unidade_tb_pessoa_juridica_idx`
    FOREIGN KEY (`uni_id`)
    REFERENCES `estagio`.`tb_pessoa_juridica` (`pj_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_unidade_tb_docente_idx`
    FOREIGN KEY (`doc_id_responsavel`)
    REFERENCES `estagio`.`tb_docente` (`doc_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_area_estagio` (
  `ar_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `ar_nome` VARCHAR(64) NOT NULL,
  `ar_descricao` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`ar_id`),
  UNIQUE INDEX `arees_UNIQUE` (`ar_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_curso_area_estagio` (
  `cs_codigo` SMALLINT(4) UNSIGNED ZEROFILL NOT NULL,
  `ar_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`cs_codigo`, `ar_id`),
  INDEX `fk_tb_curso_tb_area_estagio_area_idx` (`ar_id` ASC),
  INDEX `fk_tb_curso_tb_area_estagio_curso_idx` (`cs_codigo` ASC),
  CONSTRAINT `fk_tb_curso_tb_area_estagio_curso_idx`
    FOREIGN KEY (`cs_codigo`)
    REFERENCES `estagio`.`tb_curso` (`cs_codigo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_curso_tb_area_estagio_area_idx`
    FOREIGN KEY (`ar_id`)
    REFERENCES `estagio`.`tb_area_estagio` (`ar_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_formacao_academica` (
  `form_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `form_grau_academico` ENUM('GRADUACAO', 'ESPECIALIZACAO', 'MESTRADO', 'DOUTORADO', 'POS_DOUTORADO') NOT NULL,
  `form_titulo` VARCHAR(64) NOT NULL,
  `form_area` VARCHAR(255) NULL DEFAULT NULL,
  `form_instituicao` VARCHAR(128) NOT NULL,
  `form_ano_conclusao` SMALLINT(4) UNSIGNED ZEROFILL NOT NULL,
  `sup_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`form_id`),
  UNIQUE INDEX `form_id_UNIQUE` (`form_id` ASC),
  INDEX `fk_tb_formacao_academica_tb_supervisor_idx` (`sup_id` ASC),
  CONSTRAINT `fk_tb_formacao_academica_tb_supervisor_idx`
    FOREIGN KEY (`sup_id`)
    REFERENCES `estagio`.`tb_supervisor` (`sup_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_seguro` (
  `seg_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `seg_numero_apolice` BIGINT(20) UNSIGNED NOT NULL,
  `seg_seguradora` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`seg_id`),
  UNIQUE INDEX `seg_id_UNIQUE` (`seg_id` ASC),
  UNIQUE INDEX `seg_numero_apolice_UNIQUE` (`seg_numero_apolice` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_docente` (
  `doc_id` INT(10) UNSIGNED NOT NULL,
  `doc_siape` CHAR(12) NOT NULL,
  `doc_ingresso_em` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`doc_id`),
  UNIQUE INDEX `doc_siape_UNIQUE` (`doc_siape` ASC),
  INDEX `fk_tb_docente_tb_supervisor_idx` (`doc_id` ASC),
  CONSTRAINT `fk_tb_docente_tb_supervisor_idx`
    FOREIGN KEY (`doc_id`)
    REFERENCES `estagio`.`tb_supervisor` (`sup_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_discente` (
  `dis_id` INT(10) UNSIGNED NOT NULL,
  `dis_rga` CHAR(12) NOT NULL,
  `dis_ingresso_em` DATE NULL DEFAULT NULL,
  `cs_codigo` SMALLINT(4) UNSIGNED ZEROFILL NOT NULL,
  INDEX `fk_tb_discente_tb_curso_idx` (`cs_codigo` ASC),
  UNIQUE INDEX `dis_rga_UNIQUE` (`dis_rga` ASC),
  PRIMARY KEY (`dis_id`),
  CONSTRAINT `fk_tb_discente_tb_curso_idx`
    FOREIGN KEY (`cs_codigo`)
    REFERENCES `estagio`.`tb_curso` (`cs_codigo`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_discente_tb_usuario_idx`
    FOREIGN KEY (`dis_id`)
    REFERENCES `estagio`.`tb_usuario` (`u_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_concedente` (
  `con_id` INT(10) UNSIGNED NOT NULL,
  `con_conveniado` TINYINT(1) NULL DEFAULT NULL,
  `rep_id_representante_legal` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`con_id`),
  INDEX `fk_tb_concedente_tb_representante_legal1_idx` (`rep_id_representante_legal` ASC),
  CONSTRAINT `fk_tb_concedente_tb_pessoa_idx`
    FOREIGN KEY (`con_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_concedente_tb_representante_legal1`
    FOREIGN KEY (`rep_id_representante_legal`)
    REFERENCES `estagio`.`tb_representante_legal` (`rep_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_supervisor` (
  `sup_id` INT(10) UNSIGNED NOT NULL,
  `sup_cargo` VARCHAR(64) NOT NULL,
  `sup_lattes_url` VARCHAR(255) NULL DEFAULT NULL,
  `sup_aprovado` TINYINT(1) NULL DEFAULT NULL,
  `sup_aprovado_em` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`sup_id`),
  CONSTRAINT `fk_tb_supervisor_tb_usuario_idx`
    FOREIGN KEY (`sup_id`)
    REFERENCES `estagio`.`tb_usuario` (`u_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_usuario` (
  `u_id` INT(10) UNSIGNED NOT NULL,
  `u_tipo` ENUM('DISCENTE', 'DOCENTE', 'SUPERVISOR') NOT NULL,
  `u_senha` VARCHAR(255) NOT NULL,
  `u_ativo` TINYINT(1) NOT NULL,
  PRIMARY KEY (`u_id`),
  CONSTRAINT `fk_tb_usuario_tb_pessoa_fisica_idx`
    FOREIGN KEY (`u_id`)
    REFERENCES `estagio`.`tb_pessoa_fisica` (`pf_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_estagio` (
  `est_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `est_modalidade` ENUM('NAO_OBRIGATORIO', 'OBRIGATORIO') NOT NULL,
  `est_data_inicio` DATE NOT NULL,
  `est_data_termino` DATE NOT NULL,
  `est_modalidade_orientacao` ENUM('INDIRETA', 'SEMI_INDIRETA', 'DIRETA') NOT NULL,
  `ar_id_area` INT(10) UNSIGNED NOT NULL,
  `dis_id_estagiario` INT(10) UNSIGNED NOT NULL,
  `sup_id_supervisor` INT(10) UNSIGNED NOT NULL,
  `doc_id_orientador` INT(10) UNSIGNED NOT NULL,
  `seg_id_seguro` INT(10) UNSIGNED NOT NULL,
  `est_valor_bolsa` DOUBLE NULL DEFAULT NULL,
  `est_valor_auxilio_transporte` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`est_id`),
  UNIQUE INDEX `est_id_UNIQUE` (`est_id` ASC),
  INDEX `fk_tb_estagio_area_estagio_idx` (`ar_id_area` ASC),
  INDEX `fk_tb_estagio_tb_seguro_idx` (`seg_id_seguro` ASC),
  INDEX `fk_tb_estagio_tb_docente_idx` (`doc_id_orientador` ASC),
  INDEX `fk_tb_estagio_tb_discente_idx` (`dis_id_estagiario` ASC),
  INDEX `fk_tb_estagio_tb_supervisor_idx` (`sup_id_supervisor` ASC),
  CONSTRAINT `fk_tb_estagio_area_estagio_idx`
    FOREIGN KEY (`ar_id_area`)
    REFERENCES `estagio`.`tb_area_estagio` (`ar_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_tb_seguro_idx`
    FOREIGN KEY (`seg_id_seguro`)
    REFERENCES `estagio`.`tb_seguro` (`seg_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_tb_docente_idx`
    FOREIGN KEY (`doc_id_orientador`)
    REFERENCES `estagio`.`tb_docente` (`doc_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_tb_discente_idx`
    FOREIGN KEY (`dis_id_estagiario`)
    REFERENCES `estagio`.`tb_discente` (`dis_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_tb_supervisor_idx`
    FOREIGN KEY (`sup_id_supervisor`)
    REFERENCES `estagio`.`tb_supervisor` (`sup_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_endereco_eletronico` (
  `endel_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `endel_tipo` VARCHAR(32) NOT NULL,
  `endel_endereco` VARCHAR(255) NOT NULL,
  `endel_prioridade` TINYINT(2) UNSIGNED NULL DEFAULT NULL,
  `p_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`endel_id`),
  INDEX `fk_endereco_eletronico_tb_pessoa_idx` (`p_id` ASC),
  UNIQUE INDEX `endel_id_UNIQUE` (`endel_id` ASC),
  CONSTRAINT `fk_endereco_eletronico_tb_pessoa_idx`
    FOREIGN KEY (`p_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_status_estagio` (
  `sta_id` INT(10) UNSIGNED NOT NULL,
  `sta_local_aprovado` TINYINT(1) NULL DEFAULT NULL,
  `sta_local_aprovado_em` DATETIME NULL DEFAULT NULL,
  `sta_estagio_aprovado` TINYINT(1) NULL DEFAULT NULL,
  `sta_estagio_aprovado_em` DATETIME NULL DEFAULT NULL,
  `sta_relatorio_final_aprovado` TINYINT(1) NULL DEFAULT NULL,
  `sta_relatorio_final_aprovado_em` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`sta_id`),
  INDEX `fk_tb_status_estagio_tb_estagio_idx` (`sta_id` ASC),
  CONSTRAINT `fk_tb_status_estagio_tb_estagio_idx`
    FOREIGN KEY (`sta_id`)
    REFERENCES `estagio`.`tb_estagio` (`est_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_horario_estagiario` (
  `hor_id` INT(11) NOT NULL,
  `est_id_estagio` INT(10) UNSIGNED NOT NULL,
  `hor_dia_semana` ENUM('SEG', 'TER', 'QUA', 'QUI', 'SEX', 'SAB') NOT NULL,
  `hor_inicio` TIME NOT NULL,
  `hor_termino` TIME NOT NULL,
  `hor_atividade` ENUM('AULA', 'ESTAGIO') NOT NULL,
  PRIMARY KEY (`hor_id`),
  INDEX `fk_tb_horario_estagiario_tb_estagio_idx` (`est_id_estagio` ASC),
  CONSTRAINT `fk_tb_horario_estagiario_tb_estagio_idx`
    FOREIGN KEY (`est_id_estagio`)
    REFERENCES `estagio`.`tb_estagio` (`est_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_pessoa_fisica` (
  `pf_id` INT(10) UNSIGNED NOT NULL,
  `pf_rg_numero` INT(9) ZEROFILL NULL DEFAULT NULL,
  `pf_rg_orgao_expedidor` VARCHAR(128) NULL DEFAULT NULL,
  `pf_nacionalidade` VARCHAR(64) NULL DEFAULT NULL,
  UNIQUE INDEX `pf_rg_numero_UNIQUE` (`pf_rg_numero` ASC),
  PRIMARY KEY (`pf_id`),
  CONSTRAINT `fk_tb_pessoa_fisica_tb_pessoa_idx`
    FOREIGN KEY (`pf_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_pessoa_juridica` (
  `pj_id` INT(10) UNSIGNED NOT NULL,
  `pj_razao_social` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`pj_id`),
  CONSTRAINT `fk_tb_pessoa_juridica_tb_pessoa_idx`
    FOREIGN KEY (`pj_id`)
    REFERENCES `estagio`.`tb_pessoa` (`p_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_representante_legal` (
  `rep_id` INT(10) UNSIGNED NOT NULL,
  `rep_funcao` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`rep_id`),
  CONSTRAINT `fk_tb_representante_legal_tb_pessoa_fisica_idx`
    FOREIGN KEY (`rep_id`)
    REFERENCES `estagio`.`tb_pessoa_fisica` (`pf_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_curso_docente` (
  `cs_codigo` SMALLINT(4) UNSIGNED ZEROFILL NOT NULL,
  `doc_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`cs_codigo`, `doc_id`),
  INDEX `fk_tb_curso_tb_docente_docente_idx` (`doc_id` ASC),
  INDEX `fk_tb_curso_tb_docente_curso_idx` (`cs_codigo` ASC),
  CONSTRAINT `fk_tb_curso_tb_docente_curso_idx`
    FOREIGN KEY (`cs_codigo`)
    REFERENCES `estagio`.`tb_curso` (`cs_codigo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_curso_tb_docente_docente_idx`
    FOREIGN KEY (`doc_id`)
    REFERENCES `estagio`.`tb_docente` (`doc_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_texto_estagio` (
  `tex_id` INT(10) UNSIGNED NOT NULL,
  `tex_plano_atividades` TEXT(4096) NOT NULL,
  `tex_resumo` TEXT(4096) NOT NULL,
  `tex_objetivo` TEXT(4096) NOT NULL,
  `tex_metodologia` TEXT(4096) NOT NULL,
  PRIMARY KEY (`tex_id`),
  INDEX `fk_tb_texto_estagio_tb_estagio_idx` (`tex_id` ASC),
  CONSTRAINT `fk_tb_texto_estagio_tb_estagio_idx`
    FOREIGN KEY (`tex_id`)
    REFERENCES `estagio`.`tb_estagio` (`est_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_estagio_concedente` (
  `estcon_id` INT(10) UNSIGNED NOT NULL,
  `con_id_concedente` INT(10) UNSIGNED NOT NULL,
  `rep_id_representante_legal` INT(10) UNSIGNED NOT NULL,
  `estcon_contato` VARCHAR(255) NULL DEFAULT NULL,
  `estcon_conveniada` TINYINT(1) NULL DEFAULT NULL,
  `estcon_convenio_inicio` DATE NULL DEFAULT NULL,
  `estcon_convenio_termino` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`estcon_id`),
  INDEX `fk_tb_estagio_concedente_tb_estagio_idx` (`estcon_id` ASC),
  INDEX `fk_tb_estagio_concedente_tb_concedente_idx` (`con_id_concedente` ASC),
  INDEX `fk_tb_estagio_concedente_tb_representante_legal_idx` (`rep_id_representante_legal` ASC),
  CONSTRAINT `fk_tb_estagio_concedente_tb_estagio_idx`
    FOREIGN KEY (`estcon_id`)
    REFERENCES `estagio`.`tb_estagio` (`est_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_concedente_tb_concedente_idx`
    FOREIGN KEY (`con_id_concedente`)
    REFERENCES `estagio`.`tb_concedente` (`con_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tb_estagio_concedente_tb_representante_legal_idx`
    FOREIGN KEY (`rep_id_representante_legal`)
    REFERENCES `estagio`.`tb_representante_legal` (`rep_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `estagio`.`tb_convenio` (
  `conv_id` INT(11) NOT NULL,
  `conv_numero` VARCHAR(32) NOT NULL,
  `conv_data_inicio` DATE NOT NULL,
  `conv_data_termino` DATE NOT NULL,
  `con_id_concedente` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`conv_id`),
  INDEX `fk_tb_convenio_tb_concedente_idx` (`con_id_concedente` ASC),
  CONSTRAINT `fk_tb_convenio_tb_concedente_idx`
    FOREIGN KEY (`con_id_concedente`)
    REFERENCES `estagio`.`tb_concedente` (`con_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
