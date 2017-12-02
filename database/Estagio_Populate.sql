-- BEGIN TRANSACTION; 

-- Municipio
INSERT INTO estagio.`tb_municipio` (mun_codigo_ibge, mun_nome, mun_uf) VALUES (5003306, 'Coxim', 'MS');

-- Area de Estagio
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Arquitetura de Computadores', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Desenvolvimento de Sistemas', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Inteligência Artificial', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Redes de Computadores', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Saude da Mulher', '');

-- Docente
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Kleber Kruger', '02135730165', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (1, '001600697', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (1, 'DOCENTE', '123', true);
INSERT INTO estagio.`tb_supervisor` (sup_id, sup_cargo, sup_aprovado, sup_aprovado_em) VALUES (1, 'Professor', true, now());
INSERT INTO estagio.`tb_docente` (doc_id, doc_siape, doc_ingresso_em) VALUES (1, '20140805020', '2014-08-04');
INSERT INTO estagio.`tb_endereco` (end_id, end_logradouro, end_numero, end_bairro, end_cep, mun_codigo_ibge) VALUES (1, 'Rua Vale da Esperança', 95, 'Jardim das Acácias', '79400000', 5003306);
INSERT INTO estagio.`tb_telefone` (tel_numero, tel_uso, tel_operadora, tel_mensageiro, tel_prioridade, p_id) VALUES ('67998836289', 'PESSOAL', 'Vivo', true, 0, 1);
INSERT INTO estagio.`tb_endereco_eletronico` (endel_tipo, endel_endereco, endel_prioridade, p_id) VALUES ('Email', 'kleberkruger@gmail.com', 0, 1);

-- Docente (Diretor da Unidade)
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Gedson Faria', '22222222222', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (2, '222222222', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (2, 'DOCENTE', '123', true);
INSERT INTO estagio.`tb_supervisor` (sup_id, sup_cargo, sup_aprovado, sup_aprovado_em) VALUES (2, 'Professor', true, now());
INSERT INTO estagio.`tb_docente` (doc_id, doc_siape, doc_ingresso_em) VALUES (2, '20080803024', '2014-08-04');

-- Docente (Coordenador de Curso)
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Juliana Wolf', '33333333333', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (3, '333333333', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (3, 'DOCENTE', '123', true);
INSERT INTO estagio.`tb_supervisor` (sup_id, sup_cargo, sup_aprovado, sup_aprovado_em) VALUES (3, 'Professor', true, now());
INSERT INTO estagio.`tb_docente` (doc_id, doc_siape, doc_ingresso_em) VALUES (3, '20140805055', '2014-08-04');

-- Docente de Enfermagem
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Catchia Hermes', '44444444444', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (4, '444444444', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (4, 'DOCENTE', '123', true);
INSERT INTO estagio.`tb_supervisor` (sup_id, sup_cargo, sup_aprovado, sup_aprovado_em) VALUES (4, 'Professor', true, now());
INSERT INTO estagio.`tb_docente` (doc_id, doc_siape, doc_ingresso_em) VALUES (4, '20140805058', '2014-08-04');

-- Unidade
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_JURIDICA', 'Campus de Coxim', '15461510000567', now(), now());
INSERT INTO estagio.`tb_pessoa_juridica` (pj_id, pj_razao_social) VALUES (5, 'Fundação Universidade Federal do Mato Grosso do Sul');
INSERT INTO estagio.`tb_unidade` (uni_id, uni_sigla, doc_id_responsavel) VALUES (5, 'UFMS', 2);
INSERT INTO estagio.`tb_endereco` (end_id, end_logradouro, end_numero, end_bairro, end_cep, mun_codigo_ibge) VALUES (5, 'Avenida Marcio Lima Nantes', -1, 'Vila da Barra', '79400000', 5003306);
INSERT INTO estagio.`tb_endereco_eletronico` (endel_id, endel_tipo, endel_endereco, endel_prioridade, p_id) VALUES ('2', 'Email', 'cpcx@ufms.br', 0, 5);

-- Curso
INSERT INTO `estagio`.`tb_curso` (cs_codigo, cs_nome, cs_sigla, cs_periodo, cs_modalidade, cs_ativo, doc_id_coordenador, doc_id_presidente_coe, uni_id_unidade) VALUES (0803, 'Sistemas de Informação', 'SI', 'NOTURNO', 'BACHARELADO', true, 3, 1, 5);
INSERT INTO `estagio`.`tb_curso` (cs_codigo, cs_nome, cs_sigla, cs_periodo, cs_modalidade, cs_ativo, doc_id_coordenador, doc_id_presidente_coe, uni_id_unidade) VALUES (0805, 'Enfermagem', 'ENF', 'INTEGRAL', 'BACHARELADO', true, 4, 4, 5);

-- Areas de Estagio no Curso
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 1);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 2);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 3);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 4);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0805, 5);

-- Formacao Academica
INSERT INTO estagio.`tb_formacao_academica` (form_grau_academico, form_titulo, form_instituicao, form_ano_conclusao, sup_id) VALUES ('MESTRADO', 'Mestrado em Ciencia da Computacao', 'UFMS', 2014, 1);

-- Professores no curso
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 1);
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 2);
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 3);
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0805, 4);

-- Discente
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Alex Vieira', '04788832186', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (6, '001813599', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (6, 'DISCENTE', '123', true);
INSERT INTO estagio.`tb_discente` (dis_id, dis_rga, dis_ingresso_em, cs_codigo) VALUES (6, '201108030076', '2011-06-01', 0803);
INSERT INTO estagio.`tb_endereco` (end_id, end_logradouro, end_numero, end_bairro, end_cep, mun_codigo_ibge) VALUES (6, 'Rua Perpétua', 75, 'Vila Bela', '79400000', 5003306);
INSERT INTO estagio.`tb_telefone` (tel_numero, tel_uso, tel_operadora, tel_mensageiro, tel_prioridade, p_id) VALUES ('67996699840', 'PESSOAL', 'Vivo', true, 0, 6);
INSERT INTO estagio.`tb_endereco_eletronico` (endel_id, endel_tipo, endel_endereco, endel_prioridade, p_id) VALUES (6, 'Email', 'alex_alvesvieira@hotmail.com', 0, 6);

-- Pessoa Juridica
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_JURIDICA', 'AZ', '15461511233567', now(), now());
INSERT INTO estagio.`tb_pessoa_juridica` (pj_id, pj_razao_social) VALUES (7, 'AZ Tecnologia em gestão');

-- Representante Legal
INSERT INTO estagio.`tb_representante_legal` (rep_id, rep_funcao) VALUES (2, 'Diretor');
INSERT INTO estagio.`tb_representante_legal` (rep_id, rep_funcao) VALUES (1, 'Gerente de Projetos');

-- Concedente (UFMS)
INSERT INTO estagio.`tb_concedente` (con_id, con_conveniado, rep_id_representante_legal) VALUES (5, false, 2);
INSERT INTO estagio.`tb_concedente` (con_id, con_conveniado, rep_id_representante_legal) VALUES (7, false, 1);

-- Seguro
INSERT INTO estagio.`tb_seguro` (seg_numero_apolice, seg_seguradora) VALUES (1018200510888, ' Capemisa Seguradora de Vida e Previdência S/A');

-- Estagio
INSERT INTO estagio.`tb_estagio` (est_modalidade, est_data_inicio, est_data_termino, est_modalidade_orientacao, ar_id_area, dis_id_estagiario, sup_id_supervisor, doc_id_orientador, seg_id_seguro) 
VALUES ('OBRIGATORIO', now(), '2017-12-23', 'INDIRETA', 2, 6, 1, 1, 1);

-- Texto do Estagio
INSERT INTO estagio.`tb_texto_estagio` (tex_id, tex_plano_atividades, tex_resumo, tex_objetivo, tex_metodologia) 
VALUES (1, 'Teste populando texto do primeiro estágio.', 'tô ferrado!', 'me formar!', 'ralando muito!');

-- Status do Estagio
INSERT INTO estagio.`tb_status_estagio` (sta_id, sta_local_aprovado, sta_local_aprovado_em, sta_estagio_aprovado, sta_estagio_aprovado_em, sta_relatorio_final_aprovado, sta_relatorio_final_aprovado_em) 
VALUES (1, true, now(), true, now(), true, now());

INSERT INTO estagio.`tb_horario_estagiario` (`est_id_estagio`, `hor_dia_semana`, `hor_inicio`, `hor_termino`, `hor_atividade`) VALUES (1, '2', '13:00:00', '17:00:00', 'ESTAGIO');
INSERT INTO estagio.`tb_horario_estagiario` (`est_id_estagio`, `hor_dia_semana`, `hor_inicio`, `hor_termino`, `hor_atividade`) VALUES (1, '3', '13:00:00', '17:00:00', 'ESTAGIO');
INSERT INTO estagio.`tb_horario_estagiario` (`est_id_estagio`, `hor_dia_semana`, `hor_inicio`, `hor_termino`, `hor_atividade`) VALUES (1, '4', '13:00:00', '17:00:00', 'ESTAGIO');
INSERT INTO estagio.`tb_horario_estagiario` (`est_id_estagio`, `hor_dia_semana`, `hor_inicio`, `hor_termino`, `hor_atividade`) VALUES (1, '5', '13:00:00', '17:00:00', 'ESTAGIO');
INSERT INTO estagio.`tb_horario_estagiario` (`est_id_estagio`, `hor_dia_semana`, `hor_inicio`, `hor_termino`, `hor_atividade`) VALUES (1, '6', '13:00:00', '17:00:00', 'ESTAGIO');

-- COMMIT;