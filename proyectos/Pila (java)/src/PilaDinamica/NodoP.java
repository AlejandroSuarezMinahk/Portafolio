/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PilaDinamica;

/**
 *
 * @author Invitado
 */
public class NodoP {
   private int dato;
   private NodoP ps;

    public NodoP(int dato) {
        this.dato = dato;
        this.ps = null;
    }

    public int getDato() {
        return dato;
    }

    public NodoP getPs() {
        return ps;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setPs(NodoP ps) {
        this.ps = ps;
    }
   
           
}
