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

/**
 *
 * @author Kleber Kruger
 */
public class Discente extends Usuario {

    private RGA rga;
    private RG rg;
    private CPF cpf;
    private String nacionalidade;
    private Curso curso;

    /**
     * @return the rga
     */
    public RGA getRGA() {
        return rga;
    }

    /**
     * @param rga the rga to set
     */
    public void setRGA(RGA rga) {
        this.rga = rga;
    }

    /**
     * @return the rg
     */
    public RG getRG() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRG(RG rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public CPF getCPF() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCPF(CPF cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the endereco
     */
    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }

    /**
     * @param endereco the endereco to set
     */
    @Override
    public void setEndereco(Endereco endereco) {
        super.setEndereco(endereco);
    }

    /**
     * @return the tipo
     */
    @Override
    public TipoUsuario getTipo() {
        return TipoUsuario.DISCENTE;
    }

}
