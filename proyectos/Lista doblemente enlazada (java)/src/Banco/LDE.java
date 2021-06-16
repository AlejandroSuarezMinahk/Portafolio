package Banco;

public class LDE {

    NodoDE list;

    public LDE() {
        list = null;
    }// fin constructor 

    public NodoDE Inicio() {
        return list;
    }

    public void insertar(NodoDE x) {

    }//fin insertar

    public NodoDE eliminar(int codi) {
        NodoDE x = null;
        return x;
    }

    public void insertarPrin(NodoDE x) {
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list.setPa(x);
            x.setPa(null);
            list = x;
        }
    }

    public void insertarMedio(NodoDE p, NodoDE x) {

    }

    public void insertarFin(NodoDE p, NodoDE x) {

    }

}
