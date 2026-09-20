package edu.uees.refactor.domain;

public class Reserva {
    private final String id;
    private final Cliente cliente;
    private boolean cancelada;
    private boolean confirmada;

    public Reserva(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.cancelada = false;
        this.confirmada = false;
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public boolean isCancelada() { return cancelada; }
    public void setCancelada(boolean cancelada) { this.cancelada = cancelada; }
    public boolean isConfirmada() { return confirmada; }
    public void confirmar() { this.confirmada = true; }
}