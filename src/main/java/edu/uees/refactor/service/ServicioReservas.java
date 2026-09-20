package edu.uees.refactor.service;

import edu.uees.refactor.domain.Reserva;

public class ServicioReservas {
    public void procesarReserva(Reserva r, int h) {
        if (r != null) {
            if (r.getCliente() != null) {
                if (!r.isCancelada()) {
                    if (h >= 2) {
                        System.out.println("Procesando reserva: " + r.getId());
                        r.confirmar();
                        System.out.println("Reserva confirmada");
                    }
                }
            }
        }
    }
}