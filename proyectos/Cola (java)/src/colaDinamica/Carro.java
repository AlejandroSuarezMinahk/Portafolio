package colaDinamica;

/**
 * @author Suarez Minahk Alejandro.
 */

public class Carro {
    private int cod_ticket;
    private int cantidad;
    private float monto;
    private String tipoPago;

    public Carro(int cod_ticket, int cantidad, float monto, String tipoPago) {
        this.cod_ticket = cod_ticket;
        this.cantidad = cantidad;
        this.monto = monto;
        this.tipoPago = tipoPago;
    }
    

    public int getCod_ticket() {
        return cod_ticket;
    }

    public void setCod_ticket(int cod_ticket) {
        this.cod_ticket = cod_ticket;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Carro{" + "cod_ticket=" + cod_ticket + ", cantidad=" + cantidad + ", monto=" + monto + ", tipoPago=" + tipoPago + '}';
    }
}
