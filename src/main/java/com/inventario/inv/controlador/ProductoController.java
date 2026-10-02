package com.inventario.inv.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoController {

    private static final List<String> PRODUCTOS = List.of("Laptop", "Mouse", "Teclado", "Monitor", "audifonos", "telefono");

    @GetMapping("/productos")
    public String catalogo(@RequestParam(defaultValue = "") String buscar, Model modelo) {

        List<String> encontrados = PRODUCTOS.stream()
                .filter(p -> p.toLowerCase().contains(buscar.toLowerCase()))
                .toList();

        modelo.addAttribute("productos", encontrados);
        modelo.addAttribute("buscar", buscar);
        return "productos/lista";
    }
    
}
