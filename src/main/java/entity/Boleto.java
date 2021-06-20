package entity;

import java.sql.Date;
import java.util.Calendar;

public class Boleto {

    private int codigo;
    private Calendar data;
    private double valorPago;

    public Boleto() {
    }

    public Boleto(int codigo, Calendar data, double valorPago) {
        this.codigo = codigo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
