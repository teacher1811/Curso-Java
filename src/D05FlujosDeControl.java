import java.util.Scanner;

public class D05FlujosDeControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // if - else if - else
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad < 18) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un adulto");
        }

        // switch
        System.out.print("Elige una opción (1-3): ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1: System.out.println("Elegiste la opción 1"); break;
            case 2: System.out.println("Elegiste la opción 2"); break;
            case 3: System.out.println("Elegiste la opción 3"); break;
            default: System.out.println("Opción no válida"); break;
        }

        // while
        int i = 1;
        while (i <= 3) {
            System.out.println("Iteración while: " + i);
            i++;
        }

        // do-while
        int j = 1;
        do {
            System.out.println("Iteración do-while: " + j);
            j++;
        } while (j <= 3);

        // for
        for (int k = 1; k <= 3; k++) {
            System.out.println("Iteración for: " + k);
        }

        // Manejo de excepciones
        try {
            System.out.print("Ingresa un número para dividir 100: ");
            int divisor = scanner.nextInt();
            System.out.println("Resultado: " + (100 / divisor));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        System.out.println("Fin del programa.");
    }
}


