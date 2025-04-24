import java.util.Scanner;

public class Empleado {
    // Atributos
    String nombre;
    String cargo;
    double salario;
    String fechaIngreso;

    // Método para mostrar información del empleado
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear 3 empleados con ingreso por teclado
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        System.out.println("Ingrese los datos del primer empleado:");
        System.out.print("Nombre: ");
        empleado1.nombre = sc.nextLine();
        System.out.print("Cargo: ");
        empleado1.cargo = sc.nextLine();
        System.out.print("Salario: ");
        empleado1.salario = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        System.out.print("Fecha de ingreso: ");
        empleado1.fechaIngreso = sc.nextLine();

        System.out.println("\nIngrese los datos del segundo empleado:");
        System.out.print("Nombre: ");
        empleado2.nombre = sc.nextLine();
        System.out.print("Cargo: ");
        empleado2.cargo = sc.nextLine();
        System.out.print("Salario: ");
        empleado2.salario = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        System.out.print("Fecha de ingreso: ");
        empleado2.fechaIngreso = sc.nextLine();

        System.out.println("\nIngrese los datos del tercer empleado:");
        System.out.print("Nombre: ");
        empleado3.nombre = sc.nextLine();
        System.out.print("Cargo: ");
        empleado3.cargo = sc.nextLine();
        System.out.print("Salario: ");
        empleado3.salario = sc.nextDouble();
        sc.nextLine(); // limpiar buffer
        System.out.print("Fecha de ingreso: ");
        empleado3.fechaIngreso = sc.nextLine();

        // Mostrar información de los empleados
        System.out.println("\n=== Información de los empleados ===");
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();

        sc.close();
    }
}
