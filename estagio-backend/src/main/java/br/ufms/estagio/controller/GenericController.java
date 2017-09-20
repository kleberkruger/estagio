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
package br.ufms.estagio.controller;

import br.ufms.estagio.entity.Entidade;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.MappedSuperclass;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Kleber Kruger
 *
 * @param <E>
 * @param <T>
 */
@MappedSuperclass
public class GenericController<E extends Entidade<T>, T extends Serializable> {

    @RequestMapping(method = RequestMethod.POST)
    public void insert(@RequestBody E Entity) {
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody E Entity) {
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") T id) {
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public E findOne(@PathVariable("id") T id) {
        return null;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Collection<E> findAll() {
        return null;
    }

}
