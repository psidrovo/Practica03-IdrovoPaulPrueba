
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;

/**
 * Clase Controlador Persona. 
 * 
 * Esta clase tendra al vector personas de tipo Persona[], que sera definido
 * por el MAX_OBJECTS que pertenece a IControlador, el mismo que es implementado
 * (implements) y tendra todos sus metodos que es el CRUD que seran sobre escritos,
 * ademas de los metodos imprimir, buscarPorNombreDeDisco y buscarPorNombreDeTitulo.
 * 
 * @see Usuario 
 * @author Paul Idrovo
 */
public class ControladorUsuario implements IControlador{
    private ArrayList<Usuario> personas = new ArrayList<Usuario>();
    /**
     * Metodo constructor de ControladorPersona.
     * 
     * Este metodo nos permite que, al instancia la clase ControladorPersona este 
     * se crea dando la dimesion del vector personas de tipo Persona, esta dimension
     * es dada por MAX_OBJECTS.
     * 
     * @see ControladorPersona
     */
    public ControladorUsuario() {
    }
    /**
     * Metodo create.
     * 
     * Este metodo nos permite ir llenando el vector personas de tipo Persona[] con
     * los objetos de tipo Cantante y Compositor, para luego poderlos leer, editar, imprimir
     * y buscar.
     * 
     * @param persona - Objeto tipo Usuario
     * @see Usuario
     */
    @Override
    public void create(Usuario persona) { 
        boolean repetido=false;
        for(Usuario personaRead : personas){
            if(personaRead!=null &&  personaRead.equals(persona)){
                repetido=true;
            }         
        } 
        if(!repetido){
            personas.add(persona);
            System.out.println("USUARIO REGISTRADO");
        }else{
            System.out.println("CEDULA Y CORREO YA REGISTRADOS");
        }
    }
    /**
     * Metodo read.
     * 
     * Este metodo nos permite leer el vector personas de tipo Persona[] con
     * los objetos de tipo Cantante y Compositor, y poder retornar el objeto que
     * se necesite leer.
     * 
     * @param persona - Parametro tipo Usuario
     * @return personaRead - Objeto tipo Usuario
     * @see Usuario
     * @see Cantante
     * @see Compositor
     */
    @Override
    public Usuario read(Usuario persona) {   
        for(Usuario personaRead : personas){
            if(personaRead!=null &&  personaRead.equals(persona)){
                return personaRead;
            }         
        }        
        return null;
    }

    /**
     * Metodo imprimir.
     * 
     * Este metodo nos permite imprimir todas las Personas del vector personas de 
     * tipo Persona[] que contine objetos de tipo Cantante y Compositor. Ademas de
     * calcular el salario de cada Persona.
     * 
     * @see Usuario
     */
    /*
    public void imprimir(){    
        for(Usuario persona : personas){
            if(persona!=null){
                System.out.println("*********************************************");
                System.out.println("----> Datos de la Persona");
                System.out.println(persona.toString());
                System.out.println("\tSalario: $" + persona.calcularSalario());                
            }
        }
    }
    */
    /**
     * Metodo buscarPorNombreDeDisco.
     * 
     * Este metodo nos permite buscar al Cantante del vector personas de 
     * tipo Persona[] que contine contiene el disco que solicita el usuario.
     * Al final retornara a la persona o null en caso de no encontrarlo.
     * 
     * @param nomb - Parametro tipo String
     * @return persona - Objeto tipo Usuario
     * @see Usuario
     * @see Cantante
     * @see Compositor
     */
    public Usuario buscarPorCedulaCoreo(String valorBuscar){
        for(Usuario personaRead : personas){
            if(personaRead!=null &&  personaRead.getCedula().equals(valorBuscar)){
                return personaRead;
            }else if(personaRead!=null &&  personaRead.getCorreo().equals(valorBuscar)){
                return personaRead;
            }       
        }        
        return null;
    } 

}
