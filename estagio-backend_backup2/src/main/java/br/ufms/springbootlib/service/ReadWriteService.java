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
package br.ufms.springbootlib.service;

import br.ufms.springbootlib.domain.GenericEntity;
import java.io.Serializable;
import org.springframework.transaction.annotation.Transactional;
import br.ufms.springbootlib.domain.ReadWriteRepository;

/**
 *
 * @author Kleber Kruger
 *
 * @param <E>
 * @param <ID>
 * @param <R>
 */
public class ReadWriteService<E extends GenericEntity<ID>, ID extends Serializable, R extends ReadWriteRepository<E, ID>>
        extends ReadOnlyService<E, ID, R> {

    @Transactional(rollbackFor = Exception.class)
    public <S extends E> S save(S entity) {
        return repository.save(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(E entity) {
        repository.delete(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(ID id) {
        repository.delete(id);
    }

}
