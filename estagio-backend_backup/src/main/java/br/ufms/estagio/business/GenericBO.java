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
package br.ufms.estagio.business;

import br.ufms.estagio.entity.Entidade;
import br.ufms.estagio.repository.GenericRepository;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kleberkruger
 * @param <E>
 * @param <T>
 * @param <R>
 */
public class GenericBO<E extends Entidade<T>, T extends Serializable, R extends GenericRepository<E, T>> {

    @Autowired
    private R repository;

    @Transactional(rollbackFor = Exception.class)
    public void save(E entity) {
        repository.save(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(E entity) {
        repository.delete(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(T id) {
        repository.delete(id);
    }

    public E findOne(T id) {
        return repository.findOne(id);
    }

    public List<E> findAll() {
        return repository.findAll();
    }

}
