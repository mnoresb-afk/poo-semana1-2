public class SistemaMatricula {
    public static void main(String[] args){
        Estudiante ana = new Estudiante(); // Usando el constructor por defecto
        System.out.println("############## Sistema de Matricula #################");
        ana.nombres = "Ana Karina";
        ana.apellidos = "Martos Torres";
        ana.carrera = "Ingenieria de Sistemas Computacionales";
        ana.edad = 19;
        ana.codigo = "N0087615";
        ana.dni = "44128717";
        System.out.println(ana.informacionBasica());

        System.out.println("-----------------------------------------");
        Estudiante kevin = new Estudiante("Kevin", "Perez Jurado", "Ingenieria Industrial", 
        20, "N2135674","466"); // Usando el constructor sobrecargado
        System.out.println(kevin.informacionBasica());
    }
}
