import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tienda2 {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", 1200.99, true),
                new Producto("Mouse", 25.50, true),
                new Producto("Teclado", 45.00, false),
                new Producto("Monitor", 300.75, true),
                new Producto("Silla Gamer", 150.30, false)
        );

        // 1️⃣ Convertimos la lista en un Stream
        System.out.println("Lista original de productos:");
        productos.forEach(p -> System.out.println(p));


        // 2️⃣ Aplicamos un Stream para procesar la lista de productos
        List<String> productosDisponibles = productos.stream()
                .filter(p -> p.isEnStock())                                         // Filtrar solo productos en stock
                .sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio())) // Ordenar por precio
                .map(p -> p.getNombre().toUpperCase())                              // Convertir nombres a mayúsculas
                .collect(Collectors.toList());                                      // Convertir a lista

        // Imprimir la lista de productos disponibles
        System.out.println("Productos disponibles ordenados por precio:");
        productosDisponibles.forEach(p -> System.out.println(p));
    }
}
