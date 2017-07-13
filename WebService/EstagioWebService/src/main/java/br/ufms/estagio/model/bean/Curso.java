/*
 * Copyright (C) 2017 Kleber Kruger
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.ufms.estagio.model.bean;

import br.ufms.estagio.model.bean.enumerate.ModalidadeCurso;
import br.ufms.estagio.model.bean.enumerate.Periodo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kleber Kruger
 */
public class Curso extends Bean<Long> {

    private static final long serialVersionUID = 1L;

    /* @FIXME: Outros possíveis atributos:
    private List<Docente> docentes;
    private List<Discente> discentes;
    private List<Discente> estagiarios;
     */
    private String nome;
    private Periodo periodo;
    private ModalidadeCurso modalidade;
    private Unidade unidade;
    private Docente coordenador;
    private final List<AreaEstagio> areasEstagio;

    /**
     * Cria um novo objeto Curso.
     */
    public Curso() {
        this.areasEstagio = new ArrayList<>();
    }

    /**
     * Retorna os quatro dígitos do código do curso. Por exemplo, curso: Sistemas de Informação;
     * código: 0803.
     *
     * @TODO: Implementar a impressão corretamente. Por exemplo: Sistemas de Informação: código
     * 0803.
     *
     * @return the codigo
     */
    public String getCodigo() {
        return String.valueOf(super.getID());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the periodo
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the modalidade
     */
    public ModalidadeCurso getModalidade() {
        return modalidade;
    }

    /**
     * @param modalidade the modalidade to set
     */
    public void setModalidade(ModalidadeCurso modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * @return the unidade
     */
    public Unidade getUnidade() {
        return unidade;
    }

    /**
     * @param unidade the unidade to set
     */
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    /**
     * @return the coordenador
     */
    public Docente getCoordenador() {
        return coordenador;
    }

    /**
     * @param coordenador the coordenador to set
     */
    public void setCoordenador(Docente coordenador) {
        this.coordenador = coordenador;
    }

    /**
     * @return the areasEstagio
     */
    public List<AreaEstagio> getAreasEstagio() {
        return areasEstagio;
    }

}
