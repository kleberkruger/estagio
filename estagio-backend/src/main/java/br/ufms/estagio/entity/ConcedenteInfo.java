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

import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que mapeia a entidade ConcedenteInfo.
 *
 * @author Kleber Kruger
 */
@Entity
@Table(name = "tb_estagio_concedente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConcedenteInfo.findAll", query = "SELECT t FROM ConcedenteInfo t")
    , @NamedQuery(name = "ConcedenteInfo.findById", query = "SELECT t FROM ConcedenteInfo t WHERE t.id = :id")
    , @NamedQuery(name = "ConcedenteInfo.findByContato", query = "SELECT t FROM ConcedenteInfo t WHERE t.contato = :contato")
    , @NamedQuery(name = "ConcedenteInfo.findByConveniada", query = "SELECT t FROM ConcedenteInfo t WHERE t.conveniada = :conveniada")
    , @NamedQuery(name = "ConcedenteInfo.findByConvenioInicio", query = "SELECT t FROM ConcedenteInfo t WHERE t.convenioInicio = :convenioInicio")
    , @NamedQuery(name = "ConcedenteInfo.findByConvenioTermino", query = "SELECT t FROM ConcedenteInfo t WHERE t.convenioTermino = :convenioTermino")})
public class ConcedenteInfo extends Entidade<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estcon_id")
    private Long id;

    @JoinColumn(name = "con_id_concedente", referencedColumnName = "con_id")
    @ManyToOne(optional = false)
    private Concedente concedente;
    
    @JoinColumn(name = "rep_id_representante_legal", referencedColumnName = "rep_id")
    @ManyToOne(optional = false)
    private RepresentanteLegal representanteLegal;

    @Size(max = 255)
    @Column(name = "estcon_contato")
    private String contato;

    @Column(name = "estcon_conveniada")
    private Boolean conveniada;

    @Column(name = "estcon_convenio_inicio")
    @Temporal(TemporalType.DATE)
    private LocalDate convenioInicio;

    @Column(name = "estcon_convenio_termino")
    @Temporal(TemporalType.DATE)
    private LocalDate convenioTermino;

    /**
     * @return the id
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the representanteLegal
     */
    public RepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * @param representanteLegal the representanteLegal to set
     */
    public void setRepresentanteLegal(RepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    /**
     * @return the conveniada
     */
    public Boolean getConveniada() {
        return conveniada;
    }

    /**
     * @param conveniada the conveniada to set
     */
    public void setConveniada(Boolean conveniada) {
        this.conveniada = conveniada;
    }

    /**
     * @return the convenioInicio
     */
    public LocalDate getConvenioInicio() {
        return convenioInicio;
    }

    /**
     * @param convenioInicio the convenioInicio to set
     */
    public void setConvenioInicio(LocalDate convenioInicio) {
        this.convenioInicio = convenioInicio;
    }

    /**
     * @return the convenioTermino
     */
    public LocalDate getConvenioTermino() {
        return convenioTermino;
    }

    /**
     * @param convenioTermino the convenioTermino to set
     */
    public void setConvenioTermino(LocalDate convenioTermino) {
        this.convenioTermino = convenioTermino;
    }

}
