package edu.uees.refactor.app;

import edu.uees.refactor.domain.Reserva;
import edu.uees.refactor.service.ServicioReservas;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva("R-001", "Ana Torres");
        ServicioReservas servicio = new ServicioReservas();

        servicio.procesarReserva(reserva, 4);

        System.out.println("¿Reserva confirmada?: " + reserva.isConfirmada());
    }
}