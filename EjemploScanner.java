// Importar la fucionalidad de Scanner
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args){
        // Inicializar la clase Scanner
        Scanner sc = new Scanner(System.in);
        // Preguntarle al usuario por sus datos
        //primero su nombre
        System.out.print("Ingresa tu nombre: ");
        // captura la informacion ingresada por el teclado
        String nombre = sc.nextLine(); // retorna un String
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt(); // retorna un Int
        // segundo su nota
        System.out.print("Ingresa tu nota: ");
        // Capturar la informacion ingresada por tecla (ojo: la nota es un double)
        double nota = sc.nextDouble();
        // Finalmente reportamos al usuario
        System.out.println("Nombre: " + nombre + " de " + edad + " años y tu nota es: " + nota);
        sc.close(); // cierra la funcionalidad de Scanner
    }
}
