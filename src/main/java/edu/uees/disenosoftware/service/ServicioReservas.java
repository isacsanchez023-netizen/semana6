package edu.uees.disenosoftware.service;

import edu.uees.disenosoftware.domain.Reserva;

public class ServicioReservas {
    public double procesar(Reserva r, int horasAnticipacion) {
        if (r == null) return 0;
        if (!r.getCorreoCliente().contains("@")) return 0;
        if (r.getFin().isBefore(r.getInicio())) return 0;
        if (horasAnticipacion < 2) return 0;

        double total = 40;
        if ("VIP".equals(r.getTipo())) {
            total = total * 0.85;
        }

        r.confirmar();
        return total;
    }
}