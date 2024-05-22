package servicios;

import modelos.Vehiculo;

import java.util.List;

public interface IVehiculoServicios {
    Vehiculo buscarCochePorMatricula(String matricula);
    boolean añadirCoche(Vehiculo vehiculo);
    boolean eliminarCoche(String matricula);
    List<Vehiculo> obtenerCochesMarca(String marca);
    List<Vehiculo> obtenerTodos(int tipo);
}
