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
import java.io.Serializable;

/**
 *
 * @author Kleber Kruger
 * @param <T>
 */
public abstract class Documento<T extends Serializable> extends Bean<Long> {

    private static final long serialVersionUID = 1L;

    private T numero;
    private String numeroFormatado;

    /**
     * Classe abstrata que define um documento.
     *
     * @param numero
     */
    public Documento(T numero) {
        setNumero(numero);
    }

    /**
     * Retorna o tipo do documento.
     *
     * @return the tipo
     */
    public abstract TipoDocumento getTipo();

    /**
     * Retorna o número do documento com a máscara.
     *
     * @param numero
     * @return
     */
    protected abstract String getNumeroFormatado(T numero);

    /**
     * Valida o número do documento.
     *
     * @param numero
     * @return
     */
    protected abstract boolean validar(T numero);

    /**
     * Retorna uma String do número do documento com a máscara aplicada.
     *
     * @return
     */
    public final String getNumeroFormatado() {
        return numeroFormatado;
    }

    /**
     * @return the numero
     */
    public final T getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public final void setNumero(T numero) {
        if (numero == null || validar(numero) == false) {
            throw new IllegalArgumentException(getMensagemNumeroInvalido(numero));
        }
        this.numero = numero;
        this.numeroFormatado = getNumeroFormatado(numero);
    }

    /**
     * Retorna a mensagem enviada na exceção quando um número inválido é informado.
     *
     * @param numero
     * @return
     */
    protected String getMensagemNumeroInvalido(T numero) {
        return "Número de documento inválido: " + numero;
    }

    protected boolean isSomenteNumeros(String numero) {
        for (char c : numero.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return numeroFormatado;
    }

}
