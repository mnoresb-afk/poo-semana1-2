import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Reto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        // ENTRADA
        // Declarar variables a usar
        String nombre;
        int edad, aniosJubilacion, numeroMatricula;
        double nota;
        // Datos del usuario
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.print("Ingrese su nota: ");
        nota = sc.nextDouble();
        // PROCESO
        if(Math.round(nota) >= 12){
            System.out.println("Aprobó");
        }else if(nota >= 5 || nota <= 10){
            System.out.println("En recuperación");
        }else{
            System.out.println("Desaprobado");
        }
        numeroMatricula = rnd.nextInt(10000, 100000);
        aniosJubilacion = Math.abs(65 - edad);
        // SALIDA
        System.out.println("Nombre: " + nombre + " edad: " + edad + " nota: " + nota);
        System.out.println("Numero de Matricula: " + numeroMatricula);
        System.out.println("Anios para Jubilacion: " + aniosJubilacion);
        sc.close();
    }
}
