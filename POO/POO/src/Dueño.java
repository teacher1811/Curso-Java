// 3. Encapsulamiento: Creamos la clase "Dueño" con atributos privados
class Dueño {

    private String nombre;
    private int edad;

    // Constructor
    public Dueño(String nombre, int edad) {
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