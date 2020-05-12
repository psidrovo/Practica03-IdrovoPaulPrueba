/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import static ec.edu.ups.modelo.ValidarDatos.*;

/**
 *
 * @author Paul Idrovo
 */
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean inicio = true;
        
        ControladorUsuario ctrl = new ControladorUsuario();
        
        while(inicio){
            System.out.println("---MENU MusikUPS---");
            System.out.println("1. Resgistrarse");
            System.out.println("2. Iniciar Sesion");
            System.out.println("3. Buscar en el directorio");
            System.out.println("4. SALIR");
            
            int opcion = validarInt();
            
            switch (opcion) {
                // REGISTRO USUARIO
                case 1: ctrl.create(crearUsuario());                        
                        break;
                        
                //INICIO DE SESION
                case 2: Usuario usInicio = new Usuario();
                        System.out.println("Ingrese su correo");
                        usInicio.setCorreo(validarString());
                        System.out.println("Ingrese su contraseña");
                        usInicio.setContraseña(validarString());
                        if(ctrl.read(usInicio)!=null){
                            menuUsuarioInicioSesion(ctrl);
                        }
                        break;
            }
        }
    }
    public static Usuario crearUsuario(){
        Usuario us = new Usuario();
        System.out.println("***REGISTRO DE USUARIO***");
        
        System.out.println("Ingrese la cedula");
        us.setCedula(validarString());
        
        System.out.println("Ingrese el nombre");
        us.setNombre(validarString());
        
        System.out.println("Ingrese el apellido");
        us.setApellido(validarString());
        
        System.out.println("Ingrese el correo");
        us.setCorreo(validarString());
        
        System.out.println("Ingrese la contraseña");
        us.setContraseña(validarString()); 
        return us;
    }
    
    public static void menuUsuarioInicioSesion(ControladorUsuario ctrl){
        
    }
}

