package servicios;
import modelos.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehiculoServicios implements IVehiculoServicios {
    //HashMap para almacenar los coches utilizando la matricula como clave
    private Map<String, Vehiculo> coches;

    public VehiculoServicios(){coches = new HashMap<>();}

    //Metodo para buscar un coche por matricula
    public Vehiculo buscarCochePorMatricula(String matricula){
        return coches.get(matricula);
    }

    //Metodo para añadir coche
    public boolean añadirCoche(Vehiculo vehiculo){
        if (!coches.containsKey(vehiculo.getMatricula())){
            coches.put(vehiculo.getMatricula(), vehiculo);
            return true;
        }
        return false; //Ya existe yun coche con esa matricula
    }

    //Metodo para eliminar un coche por matricula
    public boolean eliminarCoche(String matricula){
        if (coches.containsKey(matricula)){
            coches.remove(matricula);
            return true;
        }
        return false; //No se encotro ningun coche con esa matricula
    }

    //Metodo para obtener los coches de una marca especifica
    public List<Vehiculo> obtenerCochesMarca(String marca){
        List<Vehiculo> cochesMarca=new ArrayList<>();
        for (Vehiculo vehiculo : coches.values()){
            if (vehiculo.getMarca().equalsIgnoreCase(marca)){
                cochesMarca.add(vehiculo);
            }
        }
        return cochesMarca;
    }

    //Metodo para obrener todos los coches ordenados por marca o matricula
    public List<Vehiculo> obtenerTodos(int tipo){
        if (tipo == 1){
            return ordenadosPorMarca();
        } else if (tipo == 2) {
            return ordenadosPorMatricula();
        }else return null;
    }
    /*
    public List<Vehiculo> obtenerAlquilados(){
        if () return ordenadosPorMarca();
        else return null;
    }*/


    //Metodo privado para obtener los coches ordenadro por matricula
    private List<Vehiculo> ordenadosPorMatricula() {
        List<Vehiculo> cochesOrdenados = new ArrayList<>(coches.values());
        cochesOrdenados.sort((c1, c2) -> c1.getMatricula().compareTo(c2.getMatricula()));
        return cochesOrdenados;
    }

    //Metodo privado para obtener los coches ordenados por marca
    private List<Vehiculo> ordenadosPorMarca() {
        List<Vehiculo> cochesOrdenados = new ArrayList<>(coches.values());
        cochesOrdenados.sort((c1, c2) -> c1.getMarca().compareTo(c2.getMarca()));
        return cochesOrdenados;
    }
}
