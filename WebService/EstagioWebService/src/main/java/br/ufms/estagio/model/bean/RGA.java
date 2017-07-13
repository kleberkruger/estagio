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

import br.ufms.estagio.model.bean.enumerate.TipoDocumento;

/**
 *
 * @author Kleber Kruger
 */
public class RGA extends Documento<String> {

    public RGA(String numero) {
        super(numero);
    }

    @Override
    public TipoDocumento getTipo() {
        return TipoDocumento.RGA;
    }

    @Override
    protected String getNumeroFormatado(String rga) {
        return (rga.substring(0, 4) + "." + rga.substring(4, 8) + "." + rga.substring(8, 11) + "-"
                + rga.charAt(11));
    }

    @Override
    protected boolean validar(String numero) {
        return true;
    }

}
