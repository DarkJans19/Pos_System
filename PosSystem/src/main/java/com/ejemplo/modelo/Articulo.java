package com.ejemplo.modelo;

public class Articulo {
  private Integer idArticulo;
  private String nombre;
  private float precioCompra;
  private float precioVenta;
  private int cantidad;
  private String descripcion;

  public Articulo(Integer idArticulo, String nombre, float precioCompra,float precioVenta, int cantidad, String descripcion){
    this.idArticulo = idArticulo;
    this.nombre = nombre;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.cantidad = cantidad;
    this.descripcion = descripcion;
  }

  public float utilidadArticulo(){
    return precioVenta - precioCompra;
  }
  
public Integer getIdArticulo() {
      return idArticulo;
  }

  public void setIdArticulo(Integer idArticulo) {
      this.idArticulo = idArticulo;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public float getPrecioCompra() {
      return precioCompra;
  }

  public void setPrecioCompra(float precioCompra) {
      this.precioCompra = precioCompra;
  }

  public float getPrecioVenta() {
      return precioVenta;
  }

  public void setPrecioVenta(float precioVenta) {
      this.precioVenta = precioVenta;
  }

  public int getCantidad() {
      return cantidad;
  }

  public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
  }

  public String getDescripcion() {
      return descripcion;
  }

  public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
  }
}
