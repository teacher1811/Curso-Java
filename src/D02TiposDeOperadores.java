public class D02TiposDeOperadores {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Aritméticos
        System.out.println("Suma: " + (a + b)); // 15

        // Relacionales
        System.out.println("¿a es mayor que b?: " + (a > b)); // true

        // Lógicos
        System.out.println("¿a es mayor que 0 y b menor que 10?: " + (a > 0 && b < 10)); // true

        // Asignación
        a += 3;
        System.out.println("Nuevo valor de a: " + a); // 13

        // Ternario
        String mensaje = (a > b) ? "a es mayor" : "b es mayor";
        System.out.println(mensaje); // "a es mayor"
    }
}
