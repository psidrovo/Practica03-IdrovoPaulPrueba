
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 * Clase Persona Abstracta. 
 * 
 * Esta clase tendra los atributos de una Persona, a su vez es un clase abstracta
 * esto nos permitira usar el metodo calcularSalario y utilizar el metodo de sus clases
 * hijas, en este caso son Cantate y Compositor.
 * 
 * @see Cantante
 * @see Compositor
 * @author Paul Idrovo
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    
    /**
     * Metodo constructor de Usuairo.
     * 
     * Este metodo nos permite que, al instancia la clase Usuairo este se crea
     * con valores vacios o predeterminados por java (null,0)
     * 
     */
    public Usuario() {
    }

    /**
     * Metodo constructor de Usuairo.
     * 
     * Este metodo nos permite que, al instancia la clase Usuairo este se crea
     * con valores pasados al constructor que son Stirng cedula, String nombre,
     * String apellido, String correo, String contraseña.
     * 
     * @param cedula - Parametro tipo String
     * @param nombre - Parametro tipo String
     * @param apellido - Parametro tipo String
     * @param correo - Parametro tipo String
     * @param contraseña - Parametro tipo String 
     */
    public Usuario(String cedula, String nombre, String apellido, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.correo);
        hash = 13 * hash + Objects.hashCode(this.contraseña);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    
    
    

}
