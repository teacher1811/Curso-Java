public class D03TiposDatosCompuestos {
        // Definición del Enum
        enum Dia {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
        public static void main(String[] args) {


            // 1. String - Cadena de texto
            String mensaje = "Bienvenido al mundo de Java";
            System.out.println("Mensaje: " + mensaje);

            // 2. Array - Lista de elementos de tipo String
            String[] nombres = {"Ana", "Carlos", "Elena"};

            System.out.println("\nLista de nombres:");
            for (String nombre : nombres) {
                System.out.println(nombre);
            }

            // 3. Enum - Conjunto de valores constantes
            Dia hoy = Dia.LUNES;
            System.out.println("\nHoy es: " + hoy);

            // Uso de enum en un switch
            System.out.print("Mensaje del día: ");
            switch (hoy) {
                case LUNES:
                    System.out.println("Inicio de semana, ¡Ánimo!");
                    break;
                case VIERNES:
                    System.out.println("Casi fin de semana, ¡Fuerza!");
                    break;
                default:
                    System.out.println("Un día más para aprender.");
            }
        }
    }




