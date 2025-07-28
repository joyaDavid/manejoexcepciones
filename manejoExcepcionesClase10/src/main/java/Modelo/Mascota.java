package Modelo;

import excepcionespersonalizadas.EdadInvalidaException;
import excepcionespersonalizadas.IdDenegadoException;
import excepcionespersonalizadas.NombreVacioException;



public class Mascota {
    private String nombre;
    private int edad;
    private long id;

    public Mascota(String nombre, int edad, long id) {
        // Validar nombre no vacío
        if (nombre == null || nombre.isBlank()) {
            throw new NombreVacioException("El nombre no puede estar vacío.");
        }

        // Validar edad no negativa
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        }
        
        // Validar id no sea menor de 7 dijitos
        if (id <= 7) {
            throw new IdDenegadoException("el id debe ser mayor o igual a 7.");
            
        }

        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public void mostrar() {
        System.out.println("Mascota: " + nombre + ", Edad: " + edad + ",id:" + id);
    }
}
