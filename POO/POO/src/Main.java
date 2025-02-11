// 4. Clase Principal (main) para probar todo
public class Main {
    public static void main(String[] args) {

        // Creamos instancias de Dueño
        Dueño dueño1;
        dueño1 = new Dueño("Carlos", 30);
        Dueño dueño2 = new Dueño("Ana", 25);

        // Creamos instancias de Animales (Polimorfismo)
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Michi");

        // Mostramos información
        System.out.println("El dueño " + dueño1.getNombre() + " tiene un perro llamado:");
        perro.mostrarNombre();
        perro.hacerSonido();

        System.out.println("\nEl dueño " + dueño2.getNombre() + " tiene un gato llamado:");
        gato.mostrarNombre();
        gato.hacerSonido();

    }
}