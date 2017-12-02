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
package br.ufms.estagio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author kleberkruger
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class EstagioRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EstagioRuntimeException(Exception exception) {
        super(exception.getMessage(), exception.getCause());
    }

}
