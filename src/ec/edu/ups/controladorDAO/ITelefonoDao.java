/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorDAO;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Paul Idrovo
 */
public interface ITelefonoDao {
    
    public void crearTelefono(Usuario key, Telefono telefono);
    public List<Telefono> obtenerTelefonosUsuario(Usuario key);
    public void editarTelefono(Usuario key, Telefono telefonoEditado);
    public void eliminarTelefono(Usuario key,Telefono telefono);
}
