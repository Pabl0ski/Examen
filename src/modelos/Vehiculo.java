package modelos;

public class Vehiculo {
    //Atributos
    private String marca;
    private String color;
    private String modelo;
    private String matricula;
    private int numPuertas;
    private boolean alquilado;
    private double precioSinIVA;


    public Vehiculo(String marca, String modelo, String color, double precioSinIVA, String matricula, boolean alquilado) {
        this.precioSinIVA= precioSinIVA;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.alquilado = alquilado;
        this.color=color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return matricula.equals(vehiculo.matricula);
    }



    //Metodos
    public static void alquilar(){

    }

    public static void desalquilar(){

    }
}