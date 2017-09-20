-- BEGIN TRANSACTION; 

-- Municipio
INSERT INTO estagio.`tb_municipio` (mun_codigo_ibge, mun_nome, mun_uf) VALUES (5003306, 'Coxim', 'MS');

-- Area de Estagio
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Arquitetura de Computadores', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Desenvolvimento de Sistemas', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Inteligência Artificial', '');
INSERT INTO estagio.`tb_area_estagio` (ar_nome, ar_descricao) VALUES ('Redes de Computadores', '');

-- Docente
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Kleber Kruger', '02135730165', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (1, '001600697', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (1, 'DOCENTE', '123', true);
INSERT INTO estagio.`tb_supervisor` (sup_id, sup_cargo, sup_aprovado, sup_aprovado_em) VALUES (1, 'Professor', true, now());
INSERT INTO estagio.`tb_docente` (doc_id, doc_siape, doc_ingresso_em) VALUES (1, '20140805020', '2014-08-04');
INSERT INTO estagio.`tb_endereco` (end_id, end_logradouro, end_numero, end_bairro, end_cep, mun_codigo_ibge) VALUES (1, 'Rua Vale da Esperança', 95, 'Jardim das Acácias', '79400000', 5003306);
INSERT INTO estagio.`tb_telefone` (tel_numero, tel_uso, tel_operadora, tel_mensageiro, tel_prioridade, p_id) VALUES ('67998836289', 'PESSOAL', 'Vivo', true, 0, 1);

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

-- Unidade
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_JURIDICA', 'Campus de Coxim', '15461510000567', now(), now());
INSERT INTO estagio.`tb_pessoa_juridica` (pj_id, pj_razao_social) VALUES (4, 'Fundação Universidade Federal do Mato Grosso do Sul');
INSERT INTO estagio.`tb_unidade` (uni_id, uni_sigla, doc_id_responsavel) VALUES (4, 'UFMS', 2);
INSERT INTO estagio.`tb_endereco` (end_id, end_logradouro, end_numero, end_bairro, end_cep, mun_codigo_ibge) VALUES (4, 'Avenida Marcio Lima Nantes', -1, 'Vila da Barra', '79400000', 5003306);

-- Curso
INSERT INTO `estagio`.`tb_curso` (cs_codigo, cs_nome, cs_sigla, cs_periodo, cs_modalidade, cs_ativo, doc_id_coordenador, doc_id_presidente_coe, uni_id_unidade) VALUES (0803, 'Sistemas de Informação', 'SI', 'NOTURNO', 'BACHARELADO', true, 3, 1, 4);

-- Areas de Estagio no Curso
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 1);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 2);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 3);
INSERT INTO `estagio`.`tb_curso_area_estagio` (`cs_codigo`, `ar_id`) VALUES (0803, 4);

-- Professores no curso
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 1);
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 2);
INSERT INTO `estagio`.`tb_curso_docente` (`cs_codigo`, `doc_id`) VALUES (0803, 3);

-- Discente
INSERT INTO estagio.`tb_pessoa` (p_tipo, p_nome, p_cpf_cnpj, p_criado_em, p_atualizado_em) VALUES ('PESSOA_FISICA', 'Alex Vieira', '04788832186', now(), now());
INSERT INTO estagio.`tb_pessoa_fisica` (pf_id, pf_rg_numero, pf_rg_orgao_expedidor, pf_nacionalidade) VALUES (5, '001813599', 'SSP-MS', 'Brasileiro');
INSERT INTO estagio.`tb_usuario` (u_id, u_tipo, u_senha, u_ativo) VALUES (5, 'DISCENTE', '123', true);
INSERT INTO estagio.`tb_discente` (dis_id, dis_rga, dis_ingresso_em, cs_codigo) VALUES (5, '201108030076', '2011-06-01', 0803);

-- Representante Legal
INSERT INTO estagio.`tb_representante_legal` (rep_id, rep_funcao) VALUES (2, 'Diretor');

-- Concedente (UFMS)
INSERT INTO estagio.`tb_concedente` (con_id, con_conveniado, rep_id_representante_legal) VALUES (4, false, 2);

-- COMMIT;
