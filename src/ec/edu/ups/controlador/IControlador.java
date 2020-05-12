
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;

/**
 * Clase IControlador Interface. 
 * 
 * Esta clase tendra lo metodos del Icontrolador, estos metodos
 * se utilizaran en ControladorPersona al hacer implements o implementacion
 * para eso es de tipo interface. A esto se le llama CRUD,Create (Crear)
 * Read (Leer),Update (Actualizar) y Delete (Eliminar). 
 * 
 * @see ControladorUsuario
 * @author Paul Idrovo
 */
public interface IControlador {    
    public static final int MAX_OBJECTS=10;
    public void create(Usuario obj);
    public Usuario read(Usuario obj);
}
