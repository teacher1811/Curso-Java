/*
| Tipo de Dato   | Descripción                                                                 | Ejemplo de Definición                                             |
|----------------|-----------------------------------------------------------------------------|------------------------------------------------|
| String         | Una secuencia de caracteres utilizada para almacenar texto.                 | `String nombre = "Juan";`                      |
| Array          | Una colección de elementos del mismo tipo.                                  | `int[] numeros = {1, 2, 3, 4};`                |
| Class          | Una plantilla para crear objetos, que encapsula datos y métodos.            | `public class Persona { ... }`                 |
| Interface      | Una referencia abstracta que puede ser implementada por clases.             | `public interface Vehiculo { ... }`            |
| Enum           | Una clase especial que representa un grupo de constantes (valores fijos).   | `enum Dias {LUNES, MARTES, ...};`              |
| List           | Una colección ordenada que permite elementos duplicados.                    | `List<String> lista = new ArrayList<>();`      |
| Map            | Una colección que mapea claves a valores.                                   | `Map<String, Integer> mapa = new HashMap<>();` |
| Set            | Una colección que no permite elementos duplicados.                          | `Set<String> conjunto = new HashSet<>();`      |
 */

import java.util.ArrayList;
import java.util.List;

public class C02_TipoDeDatosII {
    public static void main(String[] args) {
        // Declaración de un String para el nombre de un estudiante
        String nombreEstudiante = "Juan Pérez";

        // Declaración de un Array para las calificaciones de un estudiante
        int[] calificaciones = {85, 90, 78};

        // Declaración de una List para almacenar los nombres de varios estudiantes
        List<String> nombresEstudiantes = new ArrayList<>();
        nombresEstudiantes.add("Ana María");
        nombresEstudiantes.add("Carlos Sánchez");
        nombresEstudiantes.add("Lucía Gómez");

        // Mostrar la información del estudiante individual
        System.out.println("Nombre del estudiante: " + nombreEstudiante);
        System.out.print("Calificaciones: ");
        for (int calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();

        // Mostrar la lista de nombres de estudiantes
        System.out.println("Nombres de estudiantes:");
        for (String nombre : nombresEstudiantes) {
            System.out.println(nombre);
        }

    }
}
