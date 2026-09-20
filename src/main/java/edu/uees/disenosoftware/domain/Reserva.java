package edu.uees.disenosoftware.domain;

import java.time.LocalDateTime;

public class Reserva {
    private String codigo;
    private String correoCliente;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String tipo;
    private EstadoReserva estado;

    public Reserva(String codigo, String correoCliente, LocalDateTime inicio, LocalDateTime fin, String tipo) {
        this.codigo = codigo;
        this.correoCliente = correoCliente;
        this.inicio = inicio;
        this.fin = fin;
        this.tipo = tipo;
        this.estado = EstadoReserva.PENDIENTE;
    }

    public String getCorreoCliente() { return correoCliente; }
    public String getTipo() { return tipo; }
    public LocalDateTime getInicio() { return inicio; }
    public LocalDateTime getFin() { return fin; }
    public EstadoReserva getEstado() { return estado; }
    public void confirmar() { this.estado = EstadoReserva.CONFIRMADA; }
}