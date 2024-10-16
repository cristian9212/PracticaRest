package com.Rest.PracticaRest.Entity;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {

    private UUID idProducto;
    private String nombreProducto;
    private String categoria;
    private int precio ;
    private int stock;

    public Producto setId(UUID idProducto, String nombreProducto, String categoria, int precio, int stock) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        return this;
    }

    public UUID idProducto() {
        return idProducto;
    }

    public Producto setIdProducto(UUID idProducto) {
        this.idProducto = idProducto;
        return this;
    }

    public String nombreProducto() {
        return nombreProducto;
    }

    public Producto setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
        return this;
    }

    public String categoria() {
        return categoria;
    }

    public Producto setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public int precio() {
        return precio;
    }

    public Producto setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public int stock() {
        return stock;
    }

    public Producto setStock(int stock) {
        this.stock = stock;
        return this;
    }
}
