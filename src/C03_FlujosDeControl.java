/*Comentatio varias Lineas
| Tipo de Operador | Operador  | Descripción                                                                                   | Ejemplo de Uso                      |
|------------------|-----------|-----------------------------------------------------------------------------------------------|-------------------------------------|
| Aritméticos      | `+`       | Suma de dos valores.                                                                          | `a + b`                             |
|                  | `-`       | Resta de dos valores.                                                                         | `a - b`                             |
|                  | `*`       | Multiplicación de dos valores.                                                                | `a * b`                             |
|                  | `/`       | División de dos valores.                                                                      | `a / b`                             |
|                  | `%`       | Módulo (resto de la división de dos valores).                                                 | `a % b`                             |
| Asignación       | `=`       | Asigna un valor a una variable.                                                               | `a = 5`                             |
|                  | `+=`      | Suma y asigna el resultado a una variable.                                                    | `a += 3`  (equivale a `a = a + 3`)  |
|                  | `-=`      | Resta y asigna el resultado a una variable.                                                   | `a -= 2`  (equivale a `a = a - 2`)  |
|                  | `*=`      | Multiplica y asigna el resultado a una variable.                                              | `a *= 4`  (equivale a `a = a * 4`)  |
|                  | `/=`      | Divide y asigna el resultado a una variable.                                                  | `a /= 5`  (equivale a `a = a / 5`)  |
|                  | `%=`      | Calcula el módulo y asigna el resultado a una variable.                                       | `a %= 3`  (equivale a `a = a % 3`)  |
| Unarios          | `++`      | Incrementa el valor de una variable en 1.                                                     | `a++` o `++a`                       |
|                  | `--`      | Decrementa el valor de una variable en 1.                                                     | `a--` o `--a`                       |
|                  | `+`       | Indica valor positivo (no cambia el valor del operando).                                      | `+a`                                |
|                  | `-`       | Invierte el signo del valor del operando.                                                     | `-a`                                |
| Relacionales     | `==`      | Comprueba si dos valores son iguales.                                                         | `a == b`                            |
|                  | `!=`      | Comprueba si dos valores son diferentes.                                                      | `a != b`                            |
|                  | `>`       | Comprueba si un valor es mayor que otro.                                                      | `a > b`                             |
|                  | `<`       | Comprueba si un valor es menor que otro.                                                      | `a < b`                             |
|                  | `>=`      | Comprueba si un valor es mayor o igual que otro.                                              | `a >= b`                            |
|                  | `<=`      | Comprueba si un valor es menor o igual que otro.                                              | `a <= b`                            |
| Lógicos          | `&&`      | Operador lógico AND. Devuelve true si ambos operandos son true.                               | `a && b`                            |
|                  | `||`      | Operador lógico OR. Devuelve true si al menos uno de los operandos es true.                   | `a || b`                            |
|                  | `!`       | Operador lógico NOT. Invierte el valor booleano del operando.                                 | `!a`                                |
| Condicional      | `?:`      | Operador ternario. Asigna un valor basado en una condición.                                   | `condicion ? valor1 : valor2`       |
| Bit a bit        | `&`       | Operador AND bit a bit. Realiza una AND lógica en cada bit de los operandos.                  | `a & b`                             |
|                  | `|`       | Operador OR bit a bit. Realiza una OR inclusiva en cada bit de los operandos.                 | `a | b`                             |
|                  | `^`       | Operador XOR bit a bit. Realiza una OR exclusiva en cada bit de los operandos.                | `a ^ b`                             |
|                  | `~`       | Operador NOT bit a bit. Invierte todos los bits del operando.                                 | `~a`                                |
|                  | `<<`      | Desplazamiento a la izquierda. Desplaza los bits del operando a la izquierda.                 | `a << 2`                            |
|                  | `>>`      | Desplazamiento a la derecha. Desplaza los bits del operando a la derecha.                     | `a >> 2`                            |
|                  | `>>>`     | Desplazamiento a la derecha sin signo. Desplaza los bits del operando a la derecha sin signo. | `a >>> 2`                           |
* */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C03_FlujosDeControl {
    public static void main(String[] args) {
        // Declaración de variables
        String nombreEstudiante = "Juan Pérez";
        int[] calificaciones = {85, 90, 78};

        // Uso de if / else
        if (calificaciones.length > 0) {
            System.out.println("El estudiante tiene calificaciones.");
        } else {
            System.out.println("El estudiante no tiene calificaciones.");
        }

        // Uso de for para recorrer las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }

        // Uso de while para calcular la suma de las calificaciones
        int suma = 0;
        int j = 0;
        while (j < calificaciones.length) {
            suma += calificaciones[j];
            j++;
        }
        System.out.println("Suma de las calificaciones: " + suma);

        // Uso de do-while para asegurarse de que hay al menos una calificación
        int k = 0;
        do {
            System.out.println("Procesando calificación: " + calificaciones[k]);
            k++;
        } while (k < calificaciones.length);

        // Uso de switch para determinar el número de calificaciones
        switch (calificaciones.length) {
            case 0:
                System.out.println("No hay calificaciones.");
                break;
            case 1:
                System.out.println("Hay una calificación.");
                break;
            case 2:
                System.out.println("Hay dos calificaciones.");
                break;
            default:
                System.out.println("Hay más de dos calificaciones.");
                break;
        }

        // Uso de for-each para recorrer una lista de estudiantes
        List<String> nombresEstudiantes = new ArrayList<>();
        nombresEstudiantes.add("Ana María");
        nombresEstudiantes.add("Carlos Sánchez");
        nombresEstudiantes.add("Lucía Gómez");

        for (String nombre : nombresEstudiantes) {
            System.out.println("Estudiante: " + nombre);
        }

        // Uso de Map para almacenar y mostrar calificaciones de estudiantes
        Map<String, int[]> calificacionesEstudiantes = new HashMap<>();
        calificacionesEstudiantes.put("Ana María", new int[]{88, 92, 85});
        calificacionesEstudiantes.put("Carlos Sánchez", new int[]{75, 80, 78});
        calificacionesEstudiantes.put("Lucía Gómez", new int[]{90, 95, 93});

        for (String nombre : calificacionesEstudiantes.keySet()) {
            System.out.print("Calificaciones de " + nombre + ": ");
            int[] calificacionesArray = calificacionesEstudiantes.get(nombre);
            for (int calificacion : calificacionesArray) {
                System.out.print(calificacion + " ");
            }
            System.out.println();
        }

        // Uso de try-catch para manejar excepciones
        try {
            int resultado = 10 / 0; // Esto generará una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
    }
}

