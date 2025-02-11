// 2. Herencia: "Perro" y "Gato" heredan de "Animal"
class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    // Implementación del método abstracto
    //La notación @Override en Java se usa para indicar que un método de una subclase
    //está sobrescribiendo (reescribiendo) un método de su superclase o interfaz.
    @Override
    void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau Guau!");
    }
}
