package modelos;

import servicios.IPersona;

public class Persona {
    //atributos
    private String  DNI;
    private String nombre;

    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarPersona(){
        System.out.println(this.DNI+ ", "+this.nombre);
    }



}
