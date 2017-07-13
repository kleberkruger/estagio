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

import br.ufms.estagio.model.bean.enumerate.GrauAcademico;

/**
 *
 * @author Kleber Kruger
 */
public class FormacaoAcademica extends Bean<Long> {

    private GrauAcademico grauAcademico;
    private String area;
    private String instituicao;
    private Integer anoConclusao;

    /**
     * @return the grauAcademico
     */
    public GrauAcademico getGrauAcademico() {
        return grauAcademico;
    }

    /**
     * @param grauAcademico the grauAcademico to set
     */
    public void setGrauAcademico(GrauAcademico grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * @return the anoConclusao
     */
    public Integer getAnoConclusao() {
        return anoConclusao;
    }

    /**
     * @param anoConclusao the anoConclusao to set
     */
    public void setAnoConclusao(Integer anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

}
