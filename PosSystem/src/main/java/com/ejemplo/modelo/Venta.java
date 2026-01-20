package com.ejemplo.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private Integer numeroRemision;
    private Cliente cliente;
    private ArrayList<Articulo> articulos;
    private LocalDate fechaVenta;
    private Asesor asesor;
    private float precioTotal;
    private float utilidad;

    public Venta(Integer numeroRemision, Cliente cliente, Asesor asesor, ArrayList<Articulo> articulos, LocalDate fechaVenta) {
        this.numeroRemision = numeroRemision;
        this.cliente = cliente;
        this.asesor = asesor;
        this.articulos = articulos;
        this.fechaVenta = fechaVenta;
        calcularPrecioTotal();
        calcularUtilidad();
    }
    
    // Esto es suponiendo que no existan impuestos, pero hay que buscar una fcrma de añadir impuestos
    // Ademas seria publico o privado? Creeria que es privado pero no estoy seguro de si lo necesitare
    // Por fuera
    public float calcularPrecioTotal(){
        for(Articulo articulo : articulos){
           precioTotal += articulo.getPrecioVenta();
        }
        return precioTotal;
    }
    
    public float calcularUtilidad(){
        for(Articulo articulo : articulos){
           utilidad += articulo.utilidadArticulo();
        }
        return utilidad;
    }
    
    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }
    
    public void eliminarArticulo(Articulo articulo){
        articulos.remove(articulo);
    }

    public Integer getNumeroRemision() {
        return numeroRemision;
    }

    public void setNumeroRemision(Integer numeroRemision) {
        this.numeroRemision = numeroRemision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

    @Override
    public String toString() {
        return "Venta{" + "numeroRemision=" + numeroRemision + ", cliente=" + cliente + ", articulos=" + articulos + ", fechaVenta=" + fechaVenta + ", asesor=" + asesor + ", precioTotal=" + precioTotal + ", utilidad=" + utilidad + '}';
    }
    
    
}
