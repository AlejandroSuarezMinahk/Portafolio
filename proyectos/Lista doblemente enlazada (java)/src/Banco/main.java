package Banco;

/**
 * @author Suarez Minahk Alejandro
 */

public class main {
    ListaDEO cl;

    public main() {
        cl = new ListaDEO();
    }

    public static void main(String[] args) {
        main a=new main();
        a.menu();
    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("\nGESTION DE CUENTAS DE CLIENTES");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Alta de Cuenta");
            System.out.println("3. Baja de Cuenta");
            System.out.println("4. Baja de Cliente");
            System.out.println("5. Consulta");
            System.out.println("0. Salir");
            System.out.println("------------------------------");
            System.out.print("Ingrese su opcion: ");
            op = EntradaSalida.leerInt();
            switch (op) {
                case 1:
                    generarClientes();
                    break;
                case 2:
                    generarCuentas();
                    break;
                case 3:
                    eliminarCuentas();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    consulta();
                    break;
            }
        } while (op != 0);
    }

    public void generarClientes() {
        String con = "s";
        while (con.charAt(0) != 'n') {
            System.out.print("Ingrese el codigo del cliente: ");
            int cod = EntradaSalida.leerInt();
            System.out.print("Ingrese el apellido y nombre: ");
            String nom = EntradaSalida.leerString();
            Cliente c = new Cliente(cod, nom);
            NodoDE x = new NodoDE(c);
            cl.insertar(x);
            System.out.println("Desea seguir cargando? s/n");
            con=EntradaSalida.leerString();
        }
    }

    public void generarCuentas() {
        String con="s";
        while(con.charAt(0)!='n'){
        System.out.print("Ingrese el codigo de cliente: ");
        int cod=EntradaSalida.leerInt();
        NodoDE p=cl.Inicio();
        boolean ban=false;
        while(p!=null && !ban){
            if(p.getDato().getCodC()==cod){
                if(p.getDato().getEstado()=='A'){
                    p.getDato().agregarCuenta();
                    ban=true;
                }else{
                    //estado inactivo
                }
            }else{
                p=p.getPs();
            }
        }
        if(ban==false){
            System.out.println("No existe cliente con codigo " + cod);
        }
            System.out.println("Desea cargar otra cuenta? s/n");
            con=EntradaSalida.leerString();
        }
    }

    public void eliminarCuentas() {
        String con="s";
        while(con.charAt(0)!='n'){
        System.out.print("Ingrese el codigo de cliente: ");
        int cod=EntradaSalida.leerInt();
        NodoDE p=cl.Inicio();
        boolean ban=false;
        while(p!=null && !ban){
            if(p.getDato().getCodC()==cod){
                System.out.print("Ingrese el nro de cuenta a eliminar: ");
                int nro=EntradaSalida.leerInt();
                p.getDato().borrarCuenta(nro);
                ban=true;
            }else{
                p=p.getPs();
            }
        }
        if(ban==false){
            System.out.println("No existe cliente con codigo " + cod);
        }
            System.out.println("Desea eliminar otra cuenta? s/n");
            con=EntradaSalida.leerString();
        }
    }

    public void eliminarCliente() {
        NodoDE q=cl.Inicio();
        while(q!=null){
            if(q.getDato().getSaldo()==0){
                cl.eliminar(q.getDato().getCodC());
            }
            q=q.getPs();
        }
        System.out.println("Se ha actualizado la lista de clientes.");
    }

    public void consulta() {
        NodoDE q=cl.Inicio();
        while(q!=null){
            System.out.println(q.getDato().toString());
            q.getDato().mostrarCuentas();
            q=q.getPs();
        }
    }

}
