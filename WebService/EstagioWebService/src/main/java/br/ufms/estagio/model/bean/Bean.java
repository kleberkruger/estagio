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

import java.io.Serializable;

/**
 * Classe base para qualquer entidade (bean) do banco de dados.
 *
 * @author Kleber Kruger
 * @param <T> tipo da chave primária
 */
public class Bean<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    private T id;

    /**
     * Cria um novo objeto Bean. O construtor desta classe é protegido porque um
     * objeto Bean só existirá por meio de classes derivadas. Estes "beans" têm
     * a função de representar as entidades do banco de dados.
     */
    protected Bean() {
        id = null;
    }

    /**
     * @return the id
     */
    public T getID() {
        return id;
    }

    /**
     * Altera o ID deste bean. Este método setID é protegido, pois só deve ser
     * visível às classes do mesmo pacote.
     *
     * @param id the id to set
     */
    protected void setID(T id) {
        this.id = id;
    }

}
