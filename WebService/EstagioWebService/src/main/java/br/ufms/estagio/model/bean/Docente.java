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

import br.ufms.estagio.model.bean.enumerate.TipoUsuario;
import java.util.List;

/**
 *
 * @author Kleber Kruger
 */
public class Docente extends Supervisor {

    private SIAPE siape;
    private List<Curso> cursos;

    /**
     * @return the siape
     */
    public SIAPE getSIAPE() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSIAPE(SIAPE siape) {
        this.siape = siape;
    }

    /**
     * @return the cursos
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * @return the tipo
     */
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.DOCENTE;
    }

}
