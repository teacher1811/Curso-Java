import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Tienda {
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

        // 2️⃣ Filtramos solo los productos en stock
        List<Producto> productosEnStock = productos.stream()
                .filter(p -> p.isEnStock())       // Filtra solo productos disponibles
                .collect(Collectors.toList());    // Convertimos a lista

        System.out.println("\nProductos en stock:");
        productosEnStock.forEach(p -> System.out.println(p));

        /* 3️⃣ Ordenamos los productos por precio (de menor a mayor) */
        List<Producto> productosOrdenados = productosEnStock.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
                .collect(Collectors.toList());

        System.out.println("\nProductos en stock ordenados por precio:");
        productosOrdenados.forEach(System.out::println);

        // 4️⃣ Transformamos la lista para obtener solo los nombres en mayúsculas
        List<String> nombresMayus = productosOrdenados.stream()
                .map(p -> p.getNombre().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nNombres de productos disponibles en mayúsculas:");
        nombresMayus.forEach(System.out::println);
    }
}
