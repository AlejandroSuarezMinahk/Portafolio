package Banco;

/**
 *
 * @author Kelly Zarco
 */
public class NodoDE {
    private Cliente dato;
    private NodoDE ps;
    private NodoDE pa;

    public NodoDE(Cliente elem) {
        this.dato = elem;
        this.ps = null;
    }

    public Cliente getDato() {
        return dato;
    }

    public NodoDE getPs() {
        return ps;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public void setPs(NodoDE ps) {
        this.ps = ps;
    }

    public NodoDE getPa() {
        return pa;
    }

    public void setPa(NodoDE pa) {
        this.pa = pa;
    }
    
}
