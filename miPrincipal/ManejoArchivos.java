package miPrincipal;
import java.io.File;
import java.io.IOException;

public class ManejoArchivos {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");

        // Crear un archivo
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Eliminar un archivo
        if (archivo.delete()) {
            System.out.println("Archivo eliminado: " + archivo.getName());
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}
