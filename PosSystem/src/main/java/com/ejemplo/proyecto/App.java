package com.ejemplo.proyecto;

import com.ejemplo.modelo.Cliente;
import com.ejemplo.modelo.Articulo;
import com.ejemplo.modelo.Asesor;
import com.ejemplo.modelo.Venta;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "jan", "3108859703", "calle 45b");
        Articulo articulo1 = new Articulo(1, "PC", 10, 20, 1, "pc gamer");
        ArrayList<Articulo> articulos = new ArrayList<>();
        articulos.add(articulo1);
        Articulo articulo2 = new Articulo(2, "PC gei", 5, 10, 1, "pc gei");
        articulos.add(articulo2);
        Asesor asesor = new Asesor(1, "Sebastian");
        Venta venta = new Venta(1, cliente, asesor, articulos, LocalDate.now());
        System.out.println(venta);
    }
}
