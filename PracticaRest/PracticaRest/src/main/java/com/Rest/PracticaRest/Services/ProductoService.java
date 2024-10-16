package com.Rest.PracticaRest.Services;


import com.Rest.PracticaRest.Entity.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductoService {

    private List<Producto> productos;

    public ProductoService() {
        productos = new ArrayList<>();
        productos.add(new Producto(UUID.randomUUID(),"Laptop","Electrico",10000,50));
        productos.add(new Producto(UUID.randomUUID(), "Laptop", "Electrónico", 10000, 50));
        productos.add(new Producto(UUID.randomUUID(), "Teléfono", "Electrónico", 8000, 30));
        productos.add(new Producto(UUID.randomUUID(), "Televisor", "Electrónico", 12000, 20));
        productos.add(new Producto(UUID.randomUUID(), "Refrigerador", "Electrodoméstico", 15000, 10));
        productos.add(new Producto(UUID.randomUUID(), "Microondas", "Electrodoméstico", 3000, 25));
        productos.add(new Producto(UUID.randomUUID(), "Cámara", "Fotografía", 6000, 15));
        productos.add(new Producto(UUID.randomUUID(), "Impresora", "Oficina", 5000, 40));
        productos.add(new Producto(UUID.randomUUID(), "Tablet", "Electrónico", 7000, 60));
        productos.add(new Producto(UUID.randomUUID(), "Consola de Videojuegos", "Entretenimiento", 15000, 5));
        productos.add(new Producto(UUID.randomUUID(), "Auriculares", "Accesorios", 1500, 100));
        productos.add(new Producto(UUID.randomUUID(), "Smartwatch", "Accesorios", 5000, 35));
        productos.add(new Producto(UUID.randomUUID(), "Monitor", "Electrónico", 8000, 25));
        productos.add(new Producto(UUID.randomUUID(), "Teclado Mecánico", "Accesorios", 3000, 60));
        productos.add(new Producto(UUID.randomUUID(), "Mouse Gamer", "Accesorios", 2000, 70));
        productos.add(new Producto(UUID.randomUUID(), "Altavoces Bluetooth", "Sonido", 4000, 45));
        productos.add(new Producto(UUID.randomUUID(), "Smart TV", "Electrónico", 20000, 15));
        productos.add(new Producto(UUID.randomUUID(), "Cafetera", "Cocina", 3500, 30));
        productos.add(new Producto(UUID.randomUUID(), "Plancha", "Cocina", 2000, 50));
        productos.add(new Producto(UUID.randomUUID(), "Lavadora", "Electrodoméstico", 18000, 8));
        productos.add(new Producto(UUID.randomUUID(), "Horno", "Cocina", 12000, 12));
    }
    public List<Producto> getAllProducto() {
        return  productos;
    }
    public Optional<Producto> getProductoById(UUID idProducto){
        return  productos.stream().filter(country -> country.getIdProducto().equals(idProducto)).findFirst();
    }
    public  List<Producto> createMascotas(){
        return productos;
    }
    public  List<Producto> updateMascotas(){
        return productos;
    }
    public  List<Producto>deleteMascotas(){
        return  productos;
    }
}
