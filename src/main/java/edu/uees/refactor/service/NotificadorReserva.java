package edu.uees.refactor.service;

import edu.uees.refactor.domain.Reserva;

public class NotificadorReserva {
    public void notificarProcesamiento(Reserva reserva) {
        System.out.println("Procesando reserva: " + reserva.getId());
    }

    public void notificarConfirmacion() {
        System.out.println("Reserva confirmada");
    }
}
