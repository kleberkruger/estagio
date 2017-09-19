/*
 * Copyright (C) 2017 Universidade Federal de Mato Grosso do Sul
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
package br.ufms.estagio.entity;

import br.ufms.estagio.enumerate.ModalidadeCurso;
import br.ufms.estagio.enumerate.Periodo;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que mapeia a entidade Curso.
 *
 * @author Kleber Kruger
 */
@Entity
@Table(name = "tb_curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT t FROM Curso t")
    , @NamedQuery(name = "Curso.findByCodigo", query = "SELECT t FROM Curso t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Curso.findByNome", query = "SELECT t FROM Curso t WHERE t.nome = :nome")
    , @NamedQuery(name = "Curso.findBySigla", query = "SELECT t FROM Curso t WHERE t.sigla = :sigla")
    , @NamedQuery(name = "Curso.findByPeriodo", query = "SELECT t FROM Curso t WHERE t.periodo = :periodo")
    , @NamedQuery(name = "Curso.findByModalidade", query = "SELECT t FROM Curso t WHERE t.modalidade = :modalidade")
    , @NamedQuery(name = "Curso.findByAtivo", query = "SELECT t FROM Curso t WHERE t.ativo = :ativo")})
public class Curso extends Entidade<Short> {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cs_codigo")
    private Short codigo;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cs_nome")
    private String nome;

    @Size(max = 32)
    @Column(name = "cs_sigla")
    private String sigla;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cs_periodo")
    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "cs_modalidade")
    @Enumerated(EnumType.STRING)
    private ModalidadeCurso modalidade;

    @Basic(optional = false)
    @NotNull
    @Column(name = "cs_ativo")
    private Boolean ativo;

    @ManyToMany
    private Collection<AreaEstagio> areasEstagio;

    @JoinColumn(name = "doc_id_presidente_coe", referencedColumnName = "doc_id")
    @ManyToOne
    private Docente presidenteCoe;

    @JoinColumn(name = "doc_id_coordenador", referencedColumnName = "doc_id")
    @ManyToOne(optional = false)
    private Docente coordenador;

    @JoinColumn(name = "uni_id_unidade", referencedColumnName = "uni_id")
    @ManyToOne(optional = false)
    private Unidade unidade;

    @Override
    public Short getId() {
        return getCodigo();
    }

    /**
     * @return the codigo
     */
    public Short getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Short codigo) {
        this.codigo = codigo;
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
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
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
     * @return the ativo
     */
    public Boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the areasEstagio
     */
    public Collection<AreaEstagio> getAreasEstagio() {
        return areasEstagio;
    }

    /**
     * @param areasEstagio the areasEstagio to set
     */
    public void setAreasEstagio(Collection<AreaEstagio> areasEstagio) {
        this.areasEstagio = areasEstagio;
    }

    /**
     * @return the presidenteCoe
     */
    public Docente getPresidenteCoe() {
        return presidenteCoe;
    }

    /**
     * @param presidenteCoe the presidenteCoe to set
     */
    public void setPresidenteCoe(Docente presidenteCoe) {
        this.presidenteCoe = presidenteCoe;
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

    @Override
    public String toString() {
        return getClass().getName() + "[codigo=" + getCodigo() + "]";
    }

}
