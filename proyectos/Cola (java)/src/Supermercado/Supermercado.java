package supermercado;

import colaDinamica.*;
import EntradaSalida.EntradaSalida;

/**
 * @author Suarez Minahk Alejandro.
 */
public class Supermercado {

    ColaDinamica C, Aux, I, Aux2;

    public Supermercado() {
        C = new ColaDinamica();

    }

    public void menu() {
        int opcion = 1;
        do {
            System.out.println("1) Cargar carros.");
            System.out.println("2) Mostrar la recaudación total.");
            System.out.println("3) Mostrar todas las compras con tarjeta.");
            System.out.println("4) Generar impuestos.");
            System.out.println("5) Fin del programa.");
            System.out.println("Opcion: ");
            opcion = EntradaSalida.leerInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cargando carros de ventas:");
                    GenerarCarro();
                    break;
                case 2:
                    System.out.println("Recaudación total:");
                    Recaudación();
                    break;
                case 3:
                    System.out.println("Compras con tarjetas:");
                    ComprasTarjeta();
                    break;
                case 4:
                    GenerarI();
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }

    private void GenerarCarro() {
        String op = "s";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("Ingrese el codigo del ticket.");
            int cod = EntradaSalida.leerInt();
            System.out.println("Ingrese la cantidad de productos.");
            int cant = EntradaSalida.leerInt();
            System.out.println("Ingrese el monto recaudado.");
            float mont = EntradaSalida.leerFloat();
            System.out.println("¿Pagó contado o con tarjeta?");
            System.out.println("C para contado/T para tarjeta");
            String pago = EntradaSalida.leerString();
            Carro carrito = new Carro(cod, cant, mont, pago);
            C.insertarCarro(carrito);
            System.out.println("Continar s/n");
            op = EntradaSalida.leerString();
        }
    }

    public void Recaudación() {
        Nodo temp;
        float total = 0;
        Aux = new ColaDinamica();
        if (!C.colaVacia()) {
            while (!C.colaVacia()) {
                temp = C.quitar();
                total = total + temp.getDato().getMonto();
                Aux.insertar(temp);
            }
            System.out.println("El total es " + total);
        } else {
            System.out.println("No hubo ninguna venta.");
        }
        retornar(Aux, C);
    }

    public void ComprasTarjeta() {
        Nodo temp;
        Aux = new ColaDinamica();
        if (!C.colaVacia()) {
            while (!C.colaVacia()) {
                temp = C.quitar();
                if ("T".equals(temp.getDato().getTipoPago())) {
                    System.out.println(temp.getDato() + " ");
                }
                Aux.insertar(temp);
            }
        } else {
            System.out.println("No hubo compras con tarjeta.");
        }
        retornar(Aux, C);
    }

    public void retornar(ColaDinamica A, ColaDinamica B) {
        Nodo x;
        while (!A.colaVacia()) {
            x = A.quitar();
            B.insertar(x);
        }
    }

    public void GenerarI() {
        Nodo temp;
        Aux = new ColaDinamica();
        I = new ColaDinamica();
        if (!C.colaVacia()) {
            while (!C.colaVacia()) {
                temp = C.quitar();
                if (temp.getDato().getMonto() > 5000) {
                    I.insertarCarro(temp.getDato());
                } else {
                    Aux.insertarCarro(temp.getDato());
                }
            }
        }
        System.out.println("A continuación, la lista de ventas superiores a 5.000");
        mostrarI();
        retornar(Aux, C);
    }

    public void mostrarI() {
        Nodo temp;
        Aux = new ColaDinamica();
        if (!I.colaVacia()) {
            while (!I.colaVacia()) {
                temp = I.quitar();
                System.out.println(temp.getDato() + " ");
                Aux.insertar(temp);
            }
        } else {
            System.out.println("No hubo ventas superiores a 5.000.");
        }
        retornar(Aux, I);
    }

}
