package entity;

import java.util.Calendar;

public class Fatura {

    private Calendar data;
    private String cliente;
    private double valorTotal;
    private boolean paga;

    public Fatura() {
    }

    public Fatura(Calendar data, String cliente, double valorTotal, boolean paga) {
        this.data = data;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.paga = paga;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
