//public class D06Colecciones {
import java.util.*;

public class D06Colecciones {
    public static void main(String[] args) {
        // 1️⃣ LIST - ArrayList (Permite duplicados, mantiene orden)
        List<String> empleadosList = new ArrayList<>();
        empleadosList.add("Ana");
        empleadosList.add("Carlos");
        empleadosList.add("Beatriz");
        empleadosList.add("Ana"); // Se permite duplicado

        System.out.println("📋 Lista de empleados: " + empleadosList);

        // 2️⃣ SET - HashSet (No permite duplicados, sin orden específico)
        Set<String> empleadosSet = new HashSet<>(empleadosList);
        empleadosSet.add("Daniel");
        empleadosSet.add("Carlos"); // Ignorado porque ya existe

        System.out.println("🚀 Empleados únicos: " + empleadosSet);

        // 3️⃣ MAP - HashMap (Asocia empleados con sus salarios)
        Map<String, Double> salarios = new HashMap<>();
        salarios.put("Ana", 2500.0);
        salarios.put("Carlos", 3000.0);
        salarios.put("Beatriz", 2800.0);
        salarios.put("Daniel", 3200.0);

        System.out.println("💰 Salario de Carlos: " + salarios.get("Carlos"));

        // 4️⃣ Iterar sobre las colecciones
        System.out.println("\n📋 Empleados en la lista:");
        for (String empleado : empleadosList) {
            System.out.println("- " + empleado);
        }

        System.out.println("\n🚀 Empleados únicos en el Set:");
        for (String empleado : empleadosSet) {
            System.out.println("- " + empleado);
        }

        System.out.println("\n💰 Salarios de empleados:");
        for (Map.Entry<String, Double> entry : salarios.entrySet()) {
            System.out.println(entry.getKey() + " → $" + entry.getValue());
        }
    }
}

