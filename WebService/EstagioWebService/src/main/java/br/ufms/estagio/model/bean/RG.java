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
import br.ufms.estagio.model.bean.enumerate.UF;

/**
 *
 * @author Kleber Kruger
 */
public class RG extends Documento<String> {

    private static final long serialVersionUID = 1L;

    private String orgaoEmissor;
    private UF ufEmissor;

    public RG(String numero) {
        super(numero);
    }

    /**
     * @return the orgaoEmissor
     */
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * @param orgaoEmissor the orgaoEmissor to set
     */
    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    /**
     * @return the ufEmissor
     */
    public UF getUFEmissor() {
        return ufEmissor;
    }

    /**
     * @param ufEmissor the ufEmissor to set
     */
    public void setUFEmissor(UF ufEmissor) {
        this.ufEmissor = ufEmissor;
    }

    /**
     * @return the tipo
     */
    @Override
    public TipoDocumento getTipo() {
        return TipoDocumento.RG;
    }

    @Override
    protected String getNumeroFormatado(String cpf) {
        return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9));
    }

    @Override
    protected boolean validar(String numero) {
        return true;
    }

}

