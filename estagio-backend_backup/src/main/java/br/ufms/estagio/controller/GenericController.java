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

import br.ufms.estagio.business.GenericBO;
import br.ufms.estagio.entity.Entidade;
import br.ufms.estagio.repository.GenericRepository;
import br.ufms.estagio.util.Response;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @param <B>
 */
public class GenericController<E extends Entidade<T>, T extends Serializable, B extends GenericBO<E, T, ? extends GenericRepository<E, T>>> {

    @Autowired
    private B business;

    @RequestMapping(method = RequestMethod.POST)
    public Response insert(@RequestBody E entidade) {
        business.save(entidade);
        return Response.ok("Entidade inserida com sucesso.");
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Response update(@RequestBody E entidade) {
        business.save(entidade);
        return Response.ok("Entidade atualizada com sucesso.");
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public Response delete(@PathVariable("id") T id) {
        business.delete(id);
        return Response.ok("Entidade deletada com sucesso.");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public E findOne(@PathVariable("id") T id) {
        return business.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<E> findAll() {
        return business.findAll();
    }

}
