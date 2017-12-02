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
package br.ufms.springbootlib.web;

import br.ufms.springbootlib.domain.GenericEntity;
import br.ufms.springbootlib.service.ReadWriteService;
import java.io.Serializable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.ufms.springbootlib.domain.ReadWriteRepository;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Kleber Kruger
 *
 * @param <E>
 * @param <ID>
 * @param <S>
 */
@MappedSuperclass
public class ReadWriteController<E extends GenericEntity<ID>, ID extends Serializable, S extends ReadWriteService<E, ID, ? extends ReadWriteRepository<E, ID>>>
        extends ReadOnlyController<E, ID, S> {

    /**
     *
     * @param <S>
     * @param entity
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public <S extends E> S insert(@RequestBody S entity) {
        return service.save(entity);
    }

    /**
     *
     * @param <S>
     * @param entity
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public <S extends E> S update(@RequestBody S entity) {
        return service.save(entity);
    }

    /**
     *
     * @param entity
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody E entity) {
        service.delete(entity);
    }

    /**
     *
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable("id") ID id) {
        service.delete(id);
    }

}
