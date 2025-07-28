
package view;

import Modelo.Mascota;
import excepcionespersonalizadas.EdadInvalidaException;
import excepcionespersonalizadas.IdDenegadoException;
import excepcionespersonalizadas.NombreVacioException;

public class MainTallerExcepciones {
    public static void main(String[] args) {
        System.out.println("Inicio del programa...");

        try {
            Mascota m1 = null;
            m1.mostrar(); 
        } catch (NullPointerException e) {
            System.out.println("⚠️ Error: objeto no inicializo.");
        }

        try {
            int edad = 10;
            int divisor = 0;
            int resultado = edad / divisor; 
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Error aritmético: división por cero.");
        }

        try {
            Mascota m2 = new Mascota("", 5, 12345678); 
        } catch (NombreVacioException e) {
            System.out.println("⚠️ ERROR ubo un fallo en tus datos: " + e.getMessage());
        }

        try {
            Mascota m3 = new Mascota("Toby", -3, 12345678); 
        } catch (EdadInvalidaException e) {
            System.out.println("⚠️ ERROR fallo en el manejo de los datos: " + e.getMessage());
        
        }
        try {
            Mascota m4 = new Mascota("pepita", 4, 12345); 
        } catch (IdDenegadoException e) {
            System.out.println("⚠ ERROR tu manejo de numeros esta mal hecho:" + e.getMessage()); 
        }
        
        System.out.println("Fin del programa.");
    }
}
