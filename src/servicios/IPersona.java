package servicios;

import modelos.Empleado;
import modelos.Persona;

public interface IPersona {
    boolean añadirPersona(Persona persona);
    boolean buscarPersonaPorUsuario(String usuario);

}
