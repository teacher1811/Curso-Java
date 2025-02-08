
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

public class C01_TiposDeDatosI {
    public static void main(String[] args) {

        // Declaración de variables
        byte edad = 28;
        short distanciaTrabajo = 1500;
        int numeroID = 123456789;
        long saldoBancario = 2500000L;
        float peso = 70.5f;
        double altura = 1.75;
        boolean estadoCivil = false; // falso para soltero, verdadero para casado
        char inicialNombre = 'J';

        // Mostrar información
        System.out.println("Edad: " + edad);
        System.out.println("Distancia al trabajo: " + distanciaTrabajo + " metros");
        System.out.println("Número de identificación: " + numeroID);
        System.out.println("Saldo bancario: $" + saldoBancario);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Inicial del nombre: " + inicialNombre);
    }
}



