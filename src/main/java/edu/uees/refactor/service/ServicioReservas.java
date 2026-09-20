package edu.uees.refactor.service;

import edu.uees.refactor.domain.Reserva;

public class ServicioReservas {
    private final NotificadorReserva notificador;

    public ServicioReservas() {
        this.notificador = new NotificadorReserva();
    }

    public void procesarReserva(Reserva reserva, int horasAnticipacion) {
        if (reserva == null || reserva.getCliente() == null || reserva.isCancelada() || horasAnticipacion < 2) {
            return;
        }

        notificador.notificarProcesamiento(reserva);
        reserva.confirmar();
        notificador.notificarConfirmacion();
    }
}