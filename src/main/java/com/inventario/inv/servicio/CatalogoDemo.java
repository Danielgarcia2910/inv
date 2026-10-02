package com.inventario.inv.servicio;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CatalogoDemo implements Catalogo {

    @Override 
    public List<String> productos() {
        return List.of("Laptop", "Mouse", "Teclado", "Monitor", "audifonos", "telefono");
    }
}
