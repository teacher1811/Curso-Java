// 3. Encapsulamiento: Creamos la clase "Dueno" con atributos privados
class Dueno {

    private String nombre;
    private int edad;

    // Constructor
    public Dueno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos para acceder a los atributos privados (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}