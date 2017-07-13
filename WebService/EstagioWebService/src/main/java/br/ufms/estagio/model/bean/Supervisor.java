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
import br.ufms.estagio.model.bean.enumerate.TipoUsuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kleber Kruger
 */
public class Supervisor extends Usuario {

    private String cargo;
    private String urlLattes;
    private Map<GrauAcademico, List<FormacaoAcademica>> formacao;
//    private List<Estagio> estagiosSupervisionados;

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the urlLattes
     */
    public String getUrlLattes() {
        return urlLattes;
    }

    /**
     * @param urlLattes the urlLattes to set
     */
    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    /**
     * @return the formacao
     */
    public Map<GrauAcademico, List<FormacaoAcademica>> getFormacao() {
        return formacao;
    }

    /**
     * @param formacao the formacao to set
     */
    public void setFormacao(Map<GrauAcademico, List<FormacaoAcademica>> formacao) {
        this.formacao = formacao;
    }
    
    /**
     * @return the tipo
     */
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.SUPERVISOR;
    }

}
