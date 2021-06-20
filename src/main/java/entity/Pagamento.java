package entity;

import java.util.Calendar;

public class Pagamento {

    private double valorPago;

    private Calendar data;

    private String tipo;

    public Pagamento() {
    }

    public Pagamento(double valorPago, Calendar data, String boleto) {
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
