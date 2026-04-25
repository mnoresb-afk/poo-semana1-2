public class PruebaSistemaBanca {
    public static void main(String[] args){
        // creando un nuevo objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        // Escribir el valor del saldo en 1000 
        cuenta.setSaldo(-1000);
        // Obtener el valor del saldo
        double sal = cuenta.getSaldo();
        // Informar al usuario el saldo
        System.out.print("Saldo: " + sal);

    }
}
