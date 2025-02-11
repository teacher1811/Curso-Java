
/*
| Tipo    | Bytes | Valor Mínimo                                | Valor Máximo                                 | Descripción                                                                                     | Ejemplo de Definición                |
|---------|-------|---------------------------------------------|----------------------------------------------|-------------------------------------------------------------------------------------------------|--------------------------------------|
| byte    | 1     | -128                                        | 127                                          | Un número entero de 8 bits con signo.                                                           | `byte edad = 25;`                    |
| short   | 2     | -32,768                                     | 32,767                                       | Un número entero de 16 bits con signo.                                                          | `short distancia = 1500;`            |
| int     | 4     | -2,147,483,648                              | 2,147,483,647                                | Un número entero de 32 bits con signo.                                                          | `int contador = 100000;`             |
| long    | 8     | -9,223,372,036,854,775,808                  | 9,223,372,036,854,775,807                    | Un número entero de 64 bits con signo.                                                          | `long poblacion = 7800000000L;`      |
| float   | 4     | 1.4E-45 (positivo más pequeño)              | 3.4028235E38 (positivo más grande)           | Un número de coma flotante de precisión simple de 32 bits.                                      | `float peso = 65.5f;`                |
| double  | 8     | 4.9E-324 (positivo más pequeño)             | 1.7976931348623157E308 (positivo más grande) | Un número de coma flotante de doble precisión de 64 bits.                                       | `double altura = 1.75;`              |
| boolean | 1 bit | false                                       | true                                         | Un valor de verdad que solo puede ser verdadero (true) o falso (false).                         | `boolean esVerdadero = true;`        |
| char    | 2     | 0 (valor de carácter Unicode más bajo)      | 65,535 (valor de carácter Unicode más alto)  | Un solo carácter Unicode de 16 bits.                                                            | `char inicial = 'A';`                |
 */

import java.util.Scanner;

public class D01TiposDeDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario y almacenarlos en variables de diferentes tipos
        System.out.print("Ingrese su edad (byte): ");
        byte edad = scanner.nextByte();

        System.out.print("Ingrese el año de nacimiento (short): ");
        short anioNacimiento = scanner.nextShort();

        System.out.print("Ingrese su salario mensual (int): ");
        int salario = scanner.nextInt();

        System.out.print("Ingrese la población de su ciudad (long): ");
        long poblacionCiudad = scanner.nextLong();

        System.out.print("Ingrese la temperatura actual (float): ");
        float temperatura = scanner.nextFloat();

        System.out.print("Ingrese un valor de PI más preciso (double): ");
        double pi = scanner.nextDouble();

        System.out.print("Ingrese su inicial (char): ");
        char inicial = scanner.next().charAt(0);

        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        // Mostrar los valores ingresados
        System.out.println("\nValores ingresados:");
        System.out.println("Edad: " + edad);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("Salario Mensual: " + salario);
        System.out.println("Población de la Ciudad: " + poblacionCiudad);
        System.out.println("Temperatura Actual: " + temperatura);
        System.out.println("Valor de PI: " + pi);
        System.out.println("Inicial del Nombre: " + inicial);
        System.out.println("Es Estudiante: " + esEstudiante);

        // Cerrar el scanner
        scanner.close();
    }
}
