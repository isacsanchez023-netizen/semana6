package edu.uees.refactor.service;

import edu.uees.refactor.domain.Cliente;
import edu.uees.refactor.domain.Reserva;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioReservasTest {

    @Test
    void debeConfirmarReservaCuandoCumpleTodasLasCondiciones() {
        Reserva reserva = new Reserva("R-100", new Cliente("Carlos Perez"));
        ServicioReservas servicio = new ServicioReservas();

        servicio.procesarReserva(reserva, 3);

        assertTrue(reserva.isConfirmada());
    }

    @Test
    void noDebeConfirmarReservaSiAnticipacionEsMenorADosHoras() {
        Reserva reserva = new Reserva("R-101", new Cliente("Maria Lopez"));
        ServicioReservas servicio = new ServicioReservas();

        servicio.procesarReserva(reserva, 1);

        assertFalse(reserva.isConfirmada());
    }
}