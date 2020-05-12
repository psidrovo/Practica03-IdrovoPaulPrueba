/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorDAO;


import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorTelefonoDao implements ITelefonoDao{
    
    private ArrayList<Telefono> listaTelefonos=new ArrayList<Telefono>();
    private Map<Usuario, ArrayList<Telefono>> directorio; 
    
    
    public ControladorTelefonoDao(){
        directorio=new HashMap<Usuario,ArrayList<Telefono>>();
    }
    
    @Override
    public void crearTelefono(Usuario key, Telefono telefono) {
        if(!directorio.containsKey(key)){
            directorio.put(key,null);
        }
        listaTelefonos = directorio.get(key);
        listaTelefonos.add(telefono);
        directorio.put(key,listaTelefonos);
    }
    
    @Override
    public List<Telefono> obtenerTelefonosUsuario(Usuario key) {
        listaTelefonos = directorio.get(key);
        return listaTelefonos;
    }

    @Override
    public void editarTelefono(Usuario key, Telefono telefonoEditado) {
        listaTelefonos=directorio.get(key);
        for(int i=0;i>=listaTelefonos.size();i++){
            if(listaTelefonos.get(i).getCodigo()==telefonoEditado.getCodigo()){
                listaTelefonos.set(i, telefonoEditado);
                break;
            }
        }
        directorio.put(key,listaTelefonos);
    }

    @Override
    public void eliminarTelefono(Usuario key, Telefono telefonoElimnar) {
        listaTelefonos=directorio.get(key);
        for(int i=0;i>=listaTelefonos.size();i++){
            if(listaTelefonos.get(i).getCodigo()==telefonoElimnar.getCodigo()){
                listaTelefonos.remove(i);
                break;
            }
        }
        directorio.put(key,listaTelefonos);
    }
    
}
