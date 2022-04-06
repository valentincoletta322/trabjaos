package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {

    private LocalDate fechaPedido;
    private LocalTime horaEntrega;
    private boolean entregado;
    private Plato platoPedido;
    private Alumno cliente;

    public Pedido(LocalDate fechaPedido, LocalTime horaEntrega, boolean entregado, Plato platoPedido, Alumno cliente) {
        this.fechaPedido = fechaPedido;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
        this.platoPedido = platoPedido;
        this.cliente = cliente;
    }
}
