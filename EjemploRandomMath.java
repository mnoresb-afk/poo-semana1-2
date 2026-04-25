import java.util.Random;
import java.lang.Math;

public class EjemploRandomMath {
    public static void main(String[] args){
        // Clase Random - Clase para generar números aleatorios
        // Instanciar la clase Random
        Random rnd = new Random();
        // Obtener un entero entre 0 - 50
        int n = rnd.nextInt(51);
        System.out.println("Numero aleatorio: " + n);
        // Obtener un decimal aleatorio entre 0.0 y 1.0
        double d = rnd.nextDouble();
        System.out.println("El valor decimal aleatorio es: " + d);
        // Obtener un aleatorio booleano
        boolean b = rnd.nextBoolean();
        System.out.println("El valor booleano aleatorio es: " + b);
        // Clase Math - funciones y variables matemáticas
        // No es necesario instanciar - es una clase con metodos estáticos
        // Potencia
        double valor = Math.pow(2, 3);
        System.out.println("Math.pow de 2 y 3: " + valor);
        // Raiz Cuadrada
        valor = Math.sqrt(144);
        System.out.println("Math.sqrt de 144: " + valor);
        valor = 11.45;
        // Redondear up -  Ceil
        System.out.println("Redondeo up: " + Math.ceil(valor));
        // Redondear común - round 
        System.out.println("Redondeo común: " + Math.round(valor));
        // Redondear down - Floor
        System.out.println("Redondeo down: " + Math.floor(valor));
        // Constantes
        System.out.println("PI: " + Math.PI);
        System.out.println("Número de Euler: " + Math.E);
        System.out.println("Ratio de la cirunferencia de un círculo: " + Math.TAU);
    }
    
}
