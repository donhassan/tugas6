/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.donnymvcjdbc.error;

/**
 *
 * @author Donny Hassan
 * 10116507
 * PBO-11
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
