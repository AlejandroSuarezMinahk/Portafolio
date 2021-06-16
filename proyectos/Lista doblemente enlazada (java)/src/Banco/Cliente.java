package Banco;

/**
 *
 * @author Suarez Minahk Alejandro
 */
public class Cliente {

    private int codC;
    private String apeNom;
    private Cuenta[] cta;
    private float saldo;
    private char estado;

    public Cliente() {

    }

    public Cliente(int cod, String nom) {
        this.codC = cod;
        this.apeNom = nom;
        cta = new Cuenta[6];
        Cuenta d = new Cuenta();
        for (int i = 0; i < 6; i++) {
            cta[i] = d;
        }
        this.saldo = 0;
        this.estado = 'A';
    }

    public int getCodC() {
        return codC;
    }

    public void setCodC(int cod) {
        this.codC = cod;
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String nom) {
        this.apeNom = nom;
    }

    public Cuenta[] getCta() {
        return cta;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Codigo= " + codC + ", Nombre= " + apeNom + ", Saldo= " + saldo + ", Estado= " + estado + '}';
    }

    public void mostrarCuentas() {
        boolean ban=false;
            for (int i = 0; i < 6; i++) {
                if (cta[i].getNroC() != -1) {
                    ban=true;
                    System.out.println("\t"+cta[i].toString());
                }
            }
        if(ban==false){
            System.out.println("No posee cuentas a su nombre.");
        }
    }

    public void agregarCuenta() {
        boolean ban = false;
        int i = 0;
        while (i < cta.length && !ban) {
            if (cta[i].getNroC() == -1) {
                System.out.print("Ingrese el nro de cuenta: ");
                int nro = EntradaSalida.leerInt();
                System.out.print("Ingrese el tipo de cuenta: ");
                int tipo = EntradaSalida.leerInt();
                System.out.print("Ingrese el saldo de la cuenta: ");
                float sal = EntradaSalida.leerFloat();
                Cuenta x = new Cuenta(nro, tipo, sal);
                cta[i] = x;
                saldo = saldo + sal;
                ban = true;
            } else {
                i++;
            }
        }
        if (ban == false) {
            System.out.println("El cliente supero el limite de cuentas asociadas.");
        }else{
            System.out.println("¡Cuenta creada con exito!");
        }
    }
    
    public void borrarCuenta(int nro){
        boolean ban=false;
        int i=0;
        while(i<cta.length && !ban){
            if(cta[i].getNroC()==nro){
                saldo=saldo-cta[i].getSaldoC();
                Cuenta d=new Cuenta();
                cta[i]=d;
                ban=true;
            }else{
                i++;
            }
        }
        if(ban==false){
            System.out.println("El cliente no posee cuenta con nro " + nro);
        }else{
            System.out.println("Cuenta eliminada con exito!");
        }
    }
}
