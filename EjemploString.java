public class EjemploString {
    public static void main(String[] args){
        // Demo de la clase String
        // length() - obtiene el tamaño de una cadena
        int cantidad = "Victor".length();
        System.out.println(cantidad);
        // toUpperCase() - Conv. a mayúsculas y toLowerCase() - conv a minúsculas
        String universidad = "universidad privada del norte".toUpperCase(); // mayuscula
        System.out.println(universidad);
        String univMin = universidad.toLowerCase(); // minuscula
        System.out.println(univMin);
        // substring(i,j) obtiene una subcadena de un string
        String temp = universidad.substring(0, 11);
        System.out.println("Substring: " + temp);
        // contains(s) si existe una cadena dentro de otra
        boolean existe = "Universidad Privada del Norte".contains("Norte");
        System.out.println("Existe Norte dentro de Universidad Privada del Norte " + existe);
        // replace(old, new) - reemplazar la palabra vieja con una nueva
        String nuevaUniversidad = "Universidad Privada del Norte".replace("Norte", "Sur");
        System.out.println("Nueva universidad: " +  nuevaUniversidad);
        // .trim()
        temp = "               Victor     Muguerza Capristan                  ";
        String nuevoNombre = temp.trim();
        System.out.println(nuevoNombre);
        // Equals
        boolean resultado = "Victor".equals("Victor");
        System.out.println(resultado);
        // Equal es lo mismo que == 
        String v1 = "Victor";
        String v2 = "Victor";
        resultado = (v1 == v2);
        System.out.println(resultado);
        System.out.println(v1.equals(v2));
    }
}
