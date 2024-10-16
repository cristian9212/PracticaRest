package com.Rest.PracticaRest.Controller;


import com.Rest.PracticaRest.Entity.Producto;
import com.Rest.PracticaRest.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
@Controller
@RestController
@RequestMapping("/api/Producto")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController( ProductoService productoService) {
        this.productoService = productoService;

    }


    @GetMapping("/{id}")
    public Optional<Producto> getProducto(@PathVariable UUID idProducto) {
        return productoService.getProductoById(idProducto);
    }

    @PostMapping
    public String createProducto() {
        return "POST PRODUCTO";
    }

    @PutMapping("/{id}")
    public String updateProducto() {
        return "PUT PRODUCTO";
    }

    @DeleteMapping("/{id}")
    public String deleteProducto() {
        return "DELETE PRODUCTO";
    }
}
