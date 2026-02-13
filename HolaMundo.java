package tarea;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
       // Saludo inicial y explicación del programa
        System.out.println("¡Bienvenido al programa Hola Mundo!");
        System.out.println("Este programa pedirá tu nombre y mostrará información básica del equipo.\n");
        // Solicitar el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, escribe tu nombre: ");
        String nombre = scanner.nextLine().trim();
        if (nombre.isEmpty()) {
            nombre = "Usuario"; 
        }
        // Mostrar el saludo personalizado y la información del sistema
        System.out.println("\nHola, " + nombre + "! Encantado de conocerte.");
        // Mostrar información básica del equipo
        System.out.println("\nInformación básica del equipo:");
        System.out.println("- Sistema operativo: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " (" + System.getProperty("os.arch") + ")");
        System.out.println("- Nombre de usuario del sistema: " + System.getProperty("user.name"));
        System.out.println("- Versión de Java: " + System.getProperty("java.version"));
        // Mostrar información sobre el procesador y la memoria
        Runtime rt = Runtime.getRuntime();
        System.out.println("- Procesadores disponibles: " + rt.availableProcessors());
        long totalMem = rt.totalMemory();
        long freeMem = rt.freeMemory();
        long maxMem = rt.maxMemory();
        System.out.println("- Memoria (bytes) - total: " + totalMem + ", libre: " + freeMem + ", máxima: " + maxMem);
// Cerrar el scanner
        scanner.close();
    }
}
