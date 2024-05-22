package modelos;

public class Cliente extends Persona{
    //atributos cliente
    private String ciudad;
    private int cantidadCoches;

    public Cliente(String DNI, String nombre, String ciudad, int cantidadCoches) {
        super(DNI, nombre);
        this.ciudad = ciudad;
        this.cantidadCoches=cantidadCoches;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantidadCoches() {
        return cantidadCoches;
    }

    public void setCantidadCoches(int cantidadCoches) {
        this.cantidadCoches = cantidadCoches;
    }

    @Override
    public void mostrarPersona() {
        System.out.println("Cliente con DNI y nombre: ");
        super.mostrarPersona();
        System.out.println("Vive en " +ciudad+ " y");
        if (cantidadCoches==0) System.out.println(" no tiene vehiculos alquilados");
        else System.out.println(" ha alquilado "+ cantidadCoches+ " que son: ");
    }
}
