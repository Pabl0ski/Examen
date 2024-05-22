package modelos;

public class Empleado extends Persona {
//Atributos de empleado
    private String usuario;
    private int contraseña;

    public Empleado(String DNI, String nombre, String usuario, int contraseña) {
        super(DNI, nombre);
        this.usuario=usuario;
        this.contraseña=1234;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

@Override
    public void mostrarPersona(){
        System.out.println("Empleado con DNI y nombre: ");
        super.mostrarPersona();
        System.out.println("Tiene como usuario "+usuario);
  }
}
