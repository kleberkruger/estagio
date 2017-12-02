/*
 * Copyright (C) 2016 kleberkruger
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
package br.ufms.estagio.util;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kleberkruger
 */
@XmlRootElement
public class Response {

    private String status;
    private String message;

    /**
     * Cria um objeto Response com os atributos status e mensagem nulos.
     */
    public Response() {
    }

    /**
     * Cria um objeto Response.
     *
     * @param status
     * @param msg
     */
    private Response(String status, String msg) {
        this.status = status;
        this.message = msg;
    }

    /**
     * Cria um objeto Response com o status "OK".
     *
     * @param msg
     * @return
     */
    public static Response ok(String msg) {
        return new Response("OK", msg);
    }

    /**
     * Cria um objeto Response com o status "ERROR".
     *
     * @param msg
     * @return
     */
    public static Response error(String msg) {
        return new Response("ERROR", msg);
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the msg to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
