package ui;

import modelos.Cliente;
import modelos.Empleado;
import modelos.Persona;
import modelos.Vehiculo;
import servicios.IPersona;
import servicios.IVehiculoServicios;
import servicios.PersonasServicios;
import servicios.VehiculoServicios;
import utiles.Constantes;

import java.util.Scanner;

import static utiles.Constantes.MENSAJE_DE_BIENVENIDA;

public class Renting_Main {
    public static void main(String[] args) {
        IVehiculoServicios vehiculoServicios = new VehiculoServicios();
        //IPersonaServicios = personaServicios = new PersonasServicios();
        Scanner sc = new Scanner(System.in);

        //Carga inicial de datos de personas
        Persona[] personas = {
                new Empleado("00000000A", "Pablo", "alumnaMar", 1234),
                new Cliente("11111111A", "Juan Lopez", "Villanueva de la Cañada", 0),
                new Cliente("22222222B", "Marina Pinteño", "Cadiz", 0),
                new Cliente("33333333C", "Armanda García", "Valladolid", 0),
                new Cliente("44444444D", "Rafael Caro", "Devon", 0),
                new Cliente("55555555E", "Manuel Ceballos", "Sanlúcar", 0)
        };
       // for (Persona persona : personas){
       //     personaServicios.añadirPersona(persona);
       // }


        //Carga inicial de datos de coches
        Vehiculo[] vehiculos = {
                new Vehiculo("Audi", "A5", "negro", 200.0, "1111AAA", false),
                new Vehiculo("Seat", "Ibiza", "Gris", 100.0, "2222BBB", false),
                new Vehiculo("Ford", "Focus", "Azul", 75.5, "3333CCC", false),
                new Vehiculo("Volkswagen", "Polo", "Blanco", 60.5, "4444DDD", false)
        };

        for (Vehiculo vehiculo : vehiculos){
            vehiculoServicios.añadirCoche(vehiculo);
        }
        //Menu1
        int opcion1;
        do {
            System.out.println("1. Entrar");
            System.out.println("2. Salir");
            opcion1= sc.nextInt();
            sc.nextLine();

            switch (opcion1){
                case 1:
                    System.out.println("Introduzca el usuario: ");
                    String usuarioAConectar = sc.nextLine();
                    boolean encontrado ;
                    /*if (encontrado) {
                        String contraseña = sc.nextLine();
                        boolean contraseña_correcta ;
                        if (contraseña_correcta) {*/
                            //Menu2
                            int opcion2;
                            do {
                                System.out.println(MENSAJE_DE_BIENVENIDA);
                                System.out.println("1. Añadir Vehiculo");
                                System.out.println("2. Eliminar Vehiculo");
                                System.out.println("3. Mostrar Todos");
                                System.out.println("4. Mostrar Alquilados");
                                System.out.println("5. Mostrar No Alquilados");
                                System.out.println("6. Alquilar");
                                System.out.println("7. Desalquilar");
                                System.out.println("8. Mostrar clientes");
                                System.out.println("9. Salir");
                                opcion2 = sc.nextInt();
                                sc.nextLine();

                                switch (opcion2) {
                                    case 1:
                                        añadirNuevoCoche(sc, vehiculoServicios);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese la matrícula del coche a eliminar: ");
                                        String matriculaEliminar = sc.nextLine();
                                        boolean eliminado = vehiculoServicios.eliminarCoche(matriculaEliminar);
                                        if (eliminado) {
                                            System.out.println(Constantes.COCHE_ELIMINADO_CORRECTAMENTE);
                                        } else {
                                            System.out.println(Constantes.ERROR_ELIMINAR_COCHE);
                                        }
                                        break;
                                    case 3:
                                        System.out.println(Constantes.OBTENIENDO_TODOS_LOS_COCHES);
                                        imprimirCoches(vehiculoServicios.obtenerTodos(1));
                                        break;
                                    case 4:
                                        System.out.println("Obteniendo coches alquilados");
                                        //imprimirCoches(((VehiculoServicios) vehiculoServicios).obtenerAlquilados());
                                        break;
                                    case 5:
                                        System.out.println("Obteniendo coches no alquilados");
                                        break;
                                    case 6:
                                        System.out.println("Inserta la matricual del coche que quieres alquilar");
                                        String matriculaAlquilar=sc.nextLine();
                                        System.out.println("Escribe tu DNI: ");
                                        String DNIalquilar = sc.nextLine();
                                        System.out.println("¿Cuántos dias vas a querer el coche?");
                                        int diasAlquilar = sc.nextInt();
                                        break;
                                    case 7:
                                        System.out.println("Escribe la matricual del coche a desalquilar: ");
                                        break;
                                    case 8:
                                        System.out.println("Informacion de los clientes: ");
                                        break;
                                    case 9:
                                        System.out.println(Constantes.GRACIAS_POR_UTILIZAR_LA_APLICACION);
                                        break;

                                    default:
                                        System.out.println("Opcion no valida. Intentelo de nuevo.");

                                }


                            } while (opcion2 != 9);
                        /*}else System.out.println("Constraseña incorrecta");
                    }else System.out.println("Usuario no encontrado");*/
                case 2:
                    System.out.println(Constantes.GRACIAS_POR_UTILIZAR_LA_APLICACION);
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
            }




        }while(opcion1!=2);
    }

    private static void añadirNuevoCoche(Scanner sc, IVehiculoServicios cocheServicios) {
        System.out.println("AÑADIR NUEVO COCHE");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Precio sin IVA: ");
        double precioSinIVA = sc.nextDouble();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        sc.nextLine(); // Limpiar el buffer del scanner
        boolean alquilado = false;
        Vehiculo nuevoCoche = new Vehiculo(marca, modelo, color, precioSinIVA, matricula, alquilado);
        cocheServicios.añadirCoche(nuevoCoche);
        System.out.println("¡Coche añadido correctamente!");
    }

    private static void imprimirCoches(java.util.List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
