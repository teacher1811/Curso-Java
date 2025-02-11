public class D04Metodos {
    public static void main(String[] args) {
        // Crear un objeto de la clase
        Calculadora calc = new Calculadora();

        // 1. Llamar método sin parámetros y sin retorno
        calc.saludar();

        // 2. Llamar método con parámetros
        calc.sumar(5, 10);

        // 3. Llamar método con retorno
        int resultado = calc.multiplicar(4, 3);
        System.out.println("Resultado de la multiplicación: " + resultado);

        // 4. Llamar método estático (sin necesidad de crear objeto)
        Calculadora.mensajeEstatico();

        // 5. Llamar método final
        calc.metodoFinal();

        // 6. Llamar métodos sobrecargados
        calc.mostrarMensaje();
        calc.mostrarMensaje("Hola, este es un mensaje personalizado.");
    }
}

class Calculadora {
    //Método sin parámetros y sin retorno
    void saludar() {
        System.out.println("¡Hola! Bienvenido a la calculadora.");
    }

    //Método con parámetros
    void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

    //Método con retorno
    int multiplicar(int a, int b) {
        return a * b;
    }

    //Método estático
    static void mensajeEstatico() {
        System.out.println("Este es un método estático.");
    }

    //Método final (no puede ser sobrescrito en una subclase)
    final void metodoFinal() {
        System.out.println("Este es un método final y no puede ser sobrescrito.");
    }

    //Sobrecarga de métodos (mismo nombre, diferentes parámetros)
    void mostrarMensaje() {
        System.out.println("Mensaje predeterminado.");
    }

    void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

