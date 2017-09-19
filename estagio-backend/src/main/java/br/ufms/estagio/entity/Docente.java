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
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que mapeia a entidade Docente.
 *
 * @author Kleber Kruger
 */
@Entity
@Table(name = "tb_docente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT t FROM Docente t")
    , @NamedQuery(name = "Docente.findById", query = "SELECT t FROM Docente t WHERE t.id = :id")
    , @NamedQuery(name = "Docente.findBySiape", query = "SELECT t FROM Docente t WHERE t.siape = :siape")
    , @NamedQuery(name = "Docente.findByDataIngresso", query = "SELECT t FROM Docente t WHERE t.dataIngresso = :dataIngresso")})
public class Docente extends Supervisor {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "doc_siape")
    private String siape;

    @Column(name = "doc_ingresso_em")
    @Temporal(TemporalType.DATE)
    private LocalDate dataIngresso;

    @ManyToMany
    private Collection<Curso> cursos;

    /**
     * @return the siape
     */
    public String getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(String siape) {
        this.siape = siape;
    }

    /**
     * @return the dataIngresso
     */
    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    /**
     * @param dataIngresso the dataIngresso to set
     */
    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    /**
     * @return the cursos
     */
    public Collection<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(Collection<Curso> cursos) {
        this.cursos = cursos;
    }

}
