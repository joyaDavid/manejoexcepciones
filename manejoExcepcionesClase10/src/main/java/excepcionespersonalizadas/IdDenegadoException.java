
package excepcionespersonalizadas;

public class IdDenegadoException extends RuntimeException{
    public IdDenegadoException(String mensaje) {
        super(mensaje);
    }
}
