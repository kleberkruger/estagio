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

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Kleber Kruger
 */
public abstract class Contato extends Bean<Long> {

    private static final long serialVersionUID = 1L;

    private List<Telefone> telefones;
    private String email;
    private Endereco endereco;
    private LocalDate dthrCriacao;
    private LocalDate dthrAtualizacao;

    protected Contato() {
        super();
    }

    /**
     * @return the telefones
     */
    public List<Telefone> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    protected Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    protected void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dthrCriacao
     */
    public LocalDate getDataHoraCriacao() {
        return dthrCriacao;
    }

    /**
     * @param dthrCriacao the dthrCriacao to set
     */
    public void setDataHoraCriacao(LocalDate dthrCriacao) {
        this.dthrCriacao = dthrCriacao;
    }

    /**
     * @return the dthrAtualizacao
     */
    public LocalDate getDataHoraAtualizacao() {
        return dthrAtualizacao;
    }

    /**
     * @param dthrAtualizacao the dthrAtualizacao to set
     */
    public void setDataHoraAtualizacao(LocalDate dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

}
