package com.inventario.inv.controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
public class InventarioDmoController {

    private static final List<String> PRODUCTOS = List.of("Laptop", "Mouse", "Teclado", "Monitor", "audifonos", "telefono");

    @GetMapping("/api/demo/productos")
    public List<String> productos() {
        return PRODUCTOS;
    }

    @GetMapping("/api/demo/productos/{id}")
    public String productoPorId(@PathVariable int id) {
        return PRODUCTOS.get(id);
        
    }

}
