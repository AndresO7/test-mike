package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class HolaMundoControlador {

    /**
     * Endpoint que devuelve un saludo simple como texto plano
     * @return String con el mensaje "Hola Mundo"
     */
    @GetMapping("/hola-simple")
    public String obtenerHolaMundoSimple() {
        return "Hola Mundo";
    }

    /**
     * Endpoint que devuelve un saludo en formato JSON
     * @return ResponseEntity con un JSON que contiene el mensaje
     */
    @GetMapping("/hola-json")
    public ResponseEntity<Map<String, String>> obtenerHolaMundoJson() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Hola Mundo");
        respuesta.put("estado", "exitoso");
        respuesta.put("codigo", "200");
        
        return ResponseEntity.ok(respuesta);
    }

    /**
     * Endpoint adicional para verificar el estado de la API
     * @return ResponseEntity con información del estado
     */
    @GetMapping("/estado")
    public ResponseEntity<Map<String, Object>> obtenerEstado() {
        Map<String, Object> estado = new HashMap<>();
        estado.put("servicio", "API Hola Mundo");
        estado.put("version", "1.0.0");
        estado.put("estado", "activo");
        estado.put("puerto", 80);
        
        return ResponseEntity.ok(estado);
    }
} 