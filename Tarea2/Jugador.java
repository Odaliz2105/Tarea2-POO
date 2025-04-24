import java.util.Scanner;

//clase
public class Jugador {
    String nombre;
    String apellido;
    String posicion;
    int edad;
    int numeroCamiseta;


    //metodo accion
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
    }

    //metodo main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //OBJETOS
        //Jugador 1
        Jugador jugador1 = new Jugador();
        jugador1.nombre = "Lionel ";
        jugador1.apellido= "Messi";
        jugador1.posicion = "Delantero";
        jugador1.edad = 36;
        jugador1.numeroCamiseta = 10;

        //Jugador 2
        Jugador jugador2 = new Jugador();
        jugador2.nombre = "Sergio Ramos";
        jugador2.posicion = "Defensa";
        jugador2.edad = 37;
        jugador2.numeroCamiseta = 4;

        //Jugador 3
        Jugador jugador3 = new Jugador();
        System.out.println("Ingrese los datos del tercer jugador:");
        System.out.print("Nombre: ");
        jugador3.nombre = sc.nextLine();
        System.out.print("Apellido: ");
        jugador3.apellido = sc.nextLine();
        System.out.print("Posición: ");
        jugador3.posicion = sc.nextLine();
        System.out.print("Edad: ");
        jugador3.edad = sc.nextInt();
        System.out.print("Número de camiseta: ");
        jugador3.numeroCamiseta = sc.nextInt();

        // Mostrar información
        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();
        jugador3.mostrarInformacion();

        sc.close();
    }
}
