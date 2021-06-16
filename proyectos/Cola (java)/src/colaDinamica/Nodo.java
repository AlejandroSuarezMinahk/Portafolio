package colaDinamica;

/**
 *
 * @author Suarez Minahk Alejandro.
 */

public class Nodo {

    private Carro dato;
    private Nodo ps;

    public Nodo(Carro dato) {
        this.dato = dato;
    }

    public Nodo(Carro dato, Nodo ps) {
        this.dato = dato;
        this.ps = ps;
    }
    
    public Carro getDato() {
        return dato;
    }

    public void setDato(Carro dato) {
        this.dato = dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}
