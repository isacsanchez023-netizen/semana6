package edu.uees.refactor.service;

import edu.uees.refactor.domain.Reserva;

public class ServicioReservas {
    public void procesarReserva(Reserva reserva, int horasAnticipacion) {
        if (reserva == null || reserva.getCliente() == null || reserva.isCancelada() || horasAnticipacion < 2) {
            return;
        }

        System.out.println("Procesando reserva: " + reserva.getId());
        reserva.confirmar();
        System.out.println("Reserva confirmada");
    }
}