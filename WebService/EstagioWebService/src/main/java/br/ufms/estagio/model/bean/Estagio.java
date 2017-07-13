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

import br.ufms.estagio.model.bean.enumerate.ModalidadeEstagio;
import br.ufms.estagio.model.bean.enumerate.StatusEstagio;
import java.time.LocalDate;

/**
 *
 * @author Kleber Kruger
 */
public class Estagio extends Bean<Long> {

    private ModalidadeEstagio modalidade;
    private Discente estagiario;
    private Concedente concedente;
    private Docente orientador;
    private Supervisor supervisor;
    private AreaEstagio area;
    private String planoAtividades;
    private LocalDate inicio;
    private LocalDate termino;
    private Double valorBolsa;
    private Double valorAuxilioTransporte;
    private Seguro seguro;
    private StatusEstagio status;

    /**
     * @return the modalidade
     */
    public ModalidadeEstagio getModalidade() {
        return modalidade;
    }

    /**
     * @param modalidade the modalidade to set
     */
    public void setModalidade(ModalidadeEstagio modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * @return the estagiario
     */
    public Discente getEstagiario() {
        return estagiario;
    }

    /**
     * @param estagiario the estagiario to set
     */
    public void setEstagiario(Discente estagiario) {
        this.estagiario = estagiario;
    }

    /**
     * @return the concedente
     */
    public Concedente getConcedente() {
        return concedente;
    }

    /**
     * @param concedente the concedente to set
     */
    public void setConcedente(Concedente concedente) {
        this.concedente = concedente;
    }

    /**
     * @return the orientador
     */
    public Docente getOrientador() {
        return orientador;
    }

    /**
     * @param orientador the orientador to set
     */
    public void setOrientador(Docente orientador) {
        this.orientador = orientador;
    }

    /**
     * @return the supervisor
     */
    public Supervisor getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the area
     */
    public AreaEstagio getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(AreaEstagio area) {
        this.area = area;
    }

    /**
     * @return the planoAtividades
     */
    public String getPlanoAtividades() {
        return planoAtividades;
    }

    /**
     * @param planoAtividades the planoAtividades to set
     */
    public void setPlanoAtividades(String planoAtividades) {
        this.planoAtividades = planoAtividades;
    }

    /**
     * @return the inicio
     */
    public LocalDate getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the termino
     */
    public LocalDate getTermino() {
        return termino;
    }

    /**
     * @param termino the termino to set
     */
    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    /**
     * @return the valorBolsa
     */
    public Double getValorBolsa() {
        return valorBolsa;
    }

    /**
     * @param valorBolsa the valorBolsa to set
     */
    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    /**
     * @return the valorAuxilioTransporte
     */
    public Double getValorAuxilioTransporte() {
        return valorAuxilioTransporte;
    }

    /**
     * @param valorAuxilioTransporte the valorAuxilioTransporte to set
     */
    public void setValorAuxilioTransporte(Double valorAuxilioTransporte) {
        this.valorAuxilioTransporte = valorAuxilioTransporte;
    }

    /**
     * @return the seguro
     */
    public Seguro getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the status
     */
    public StatusEstagio getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusEstagio status) {
        this.status = status;
    }

}
