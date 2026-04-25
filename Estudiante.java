public class Estudiante {
    // Atributos
    private String codigo;
    private String nombres;
    private String apellidos;
    private String dni;
    private String carrera;
    private int edad;
    private boolean estaMatriculado;
    
    //Constructor por defecto
    public Estudiante(){

    }
    // Sobrecarga de contructor
    public Estudiante(String _nombre, String _apellidos, 
        String _carrera, int _edad, String _codigo, String _dni, boolean _estaMatriculado){
            setCodigo(_codigo);
            setNombres(_nombre);
            setApellidos(_apellidos);
            setDni(_dni);
            setCarrera(_carrera);
            setEdad(_edad);
            setEstaMatriculado(_estaMatriculado);
        }
    // Metodos
    public String informacionBasica(){
        return "Codigo: " + codigo + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nCarrera: " + carrera;
    }

    // Get y Set
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) { 
        if(dni.length() == 8){ // DNI VALIDO
            this.dni = dni; 
        }else{
            System.out.println("Verifique que el DNI tenga 8 números");
        }  
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getEdad() { 
        return edad;
    }
    public void setEdad(int edad) {
        // validar rango de edad valido
        if(edad >= 0 && edad <= 80){
            this.edad = edad;    
        }else{
            System.out.println("Rango de edad inválido");
        }
    }
    public boolean isEstaMatriculado() {
        return estaMatriculado;
    }
    public void setEstaMatriculado(boolean estaMatriculado) {
        this.estaMatriculado = estaMatriculado;
    }
}
