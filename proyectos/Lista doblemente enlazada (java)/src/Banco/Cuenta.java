package Banco;

/**
 *
 * @author Suarez Minahk Alejandro.
 */
public class Cuenta {
    private int nroC;
    private int tipo;
    private float saldoC;

    public Cuenta() {
        this.nroC=-1;
        this.tipo=0;
        this.saldoC=0;
    }

    public Cuenta(int nro, int tip, float saldo) {
        this.nroC = nro;
        this.tipo = tip;
        this.saldoC = saldo;
    }

    public int getNroC() {
        return nroC;
    }

    public void setNroC(int nro) {
        this.nroC = nro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tip) {
        this.tipo = tip;
    }

    public float getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(float saldo) {
        this.saldoC = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Nro= " + nroC + ", Tipo= " + tipo + ", Saldo= " + saldoC + '}';
    }
    
    
}