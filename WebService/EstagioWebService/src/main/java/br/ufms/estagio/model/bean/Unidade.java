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

/**
 *
 * @author Kleber Kruger
 */
public class Unidade extends Contato {

    private String sigla;
    private String nome;
    private Docente responsavel;
//    private List<Curso> cursos;

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the responsavel
     */
    public Docente getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Docente responsavel) {
        this.responsavel = responsavel;
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

}
