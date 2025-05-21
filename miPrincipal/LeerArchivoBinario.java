package miPrincipal;
import java.io.FileInputStream;
import java.io.IOException;
public class LeerArchivoBinario {
    public static void main(String[] args) {
        String nombreArchivo = "datos.dat";
        try (FileInputStream fis = new FileInputStream(nombreArchivo)) {
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print(byteLeido + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
