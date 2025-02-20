// 4. Clase Principal (main) para probar todo
public class Main {
    public static void main(String[] args) {

        // Creamos instancias de Dueno
        Dueno dueno1;
        dueno1 = new Dueno("Carlos", 30);
        Dueno dueno2 = new Dueno("Ana", 25);

        // Creamos instancias de Animales (Polimorfismo)
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Michi");

        // Mostramos información
        System.out.println("El dueño " + dueno1.getNombre() + " tiene un perro llamado:");
        perro.mostrarNombre();
        perro.hacerSonido();

        System.out.println("\nEl dueño " + dueno2.getNombre() + " tiene un gato llamado:");
        gato.mostrarNombre();
        gato.hacerSonido();

    }
}