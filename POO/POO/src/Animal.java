
// 1. Abstracción: Creamos una clase abstracta "Animal"
abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto (debe ser implementado por las subclases)
    abstract void hacerSonido();

    // Método común para todas las subclases
    public void mostrarNombre() {
        System.out.println("Me llamo " + nombre);
    }
}

