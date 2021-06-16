package Banco;

public class ListaDEO extends LDE {

    public ListaDEO() {

    }

    @Override
    public void insertar(NodoDE x) {
        NodoDE p = Inicio();
        NodoDE ant = null;
        int b = 0;

        while (p != null && b == 0) {
            if (p.getDato().getCodC() > x.getDato().getCodC()) {
                b = 1;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        if (b == 1) {
            if (p == list) {
                insertarPrin(x);
            } else {
                insertarMedio(p, x);
            }
        } else {
            if (ant == null) {
                list = x;
            } else {
                insertarFin(ant, x);
            }
        }
    }

    @Override
    public void insertarMedio(NodoDE p, NodoDE x) {
        x.setPs(p);
        x.setPa(p.getPa());
        (p.getPa()).setPs(x);
        p.setPa(x);
    }

    @Override
    public void insertarFin(NodoDE p, NodoDE x) {
        p.setPs(x);
        x.setPa(p);
        x.setPs(null);
    }

    public boolean listaVacia() {
        return (list == null);
    }

    @Override
    public NodoDE eliminar(int codi) {
        NodoDE x = null;
        NodoDE p = Inicio();
        if (listaVacia()) {
            EntradaSalida.mostrarMensaje("Lista Vacía!!!");
            return x;
        }
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato().getCodC() == codi) {
                band = true;
                x = p;
            } else {
                p = p.getPs();
            }
        }
        if (band == true) {
            if (p == list) {
                eliminarPrin(p);
            } else {
                if (p.getPs() == null) {
                    eliminarFin(p);
                } else {
                    eliminarMedio(p);
                }
            }
        }
        return x;
    }

    private void eliminarPrin(NodoDE p) {
        (p.getPs()).setPa(null);
        list = p.getPs();
    }

    private void eliminarMedio(NodoDE p) {
        (p.getPa()).setPs(p.getPs());
        (p.getPs()).setPa(p.getPa());
    }

    private void eliminarFin(NodoDE p) {
        (p.getPa()).setPs(null);
    }

    public NodoDE Final() {
        NodoDE p = list;
        NodoDE ant = null;
        while (p != null) {
            ant = p;
            p = p.getPs();
        }
        return ant;
    }
}
