import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivoRenombrado.txt");
        File nuevoArchivo = new File("archivo.txt");
        if (archivo.renameTo(nuevoArchivo)) {
            System.out.println("Archivo renombrado a: " + nuevoArchivo.getName());
        } else {
            System.out.println("No se pudo renombrar el archivo.");
        }
    }
}