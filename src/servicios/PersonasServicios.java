package servicios;

import modelos.Persona;

import java.util.HashMap;
import java.util.Map;

public class PersonasServicios implements IPersona {
    //HashMap para almacenar las personas utilizando el usuario como clave
    private Map<Integer, Persona> empleados;

    public PersonasServicios(){empleados=new HashMap<>();
    }

    @Override
    public boolean añadirPersona(Persona persona) {
        return false;
    }

    @Override
    public boolean buscarPersonaPorUsuario(String usuario) {
        return false;
    }

    //Metodo para añadir persona
    //public boolean añadirPersona(Persona persona){
        //if (persona.containsKey(persona.getDNI())){
           // persona.put(persona.getDNI(), persona);
           // return true;
      //  }
     //   return false; //Ya existe una persona con ese DNI
   // }

    /*public Persona buscarPersonaPorUsuario(String usuario) {
        return empleados.get(usuario);
    }*/

}
