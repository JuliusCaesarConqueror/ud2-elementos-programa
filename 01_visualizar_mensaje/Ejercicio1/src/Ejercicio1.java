import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe el mensaje a visualizar");
        String texto= br.readLine();
        System.out.println("El mensaje es: " +texto);

    }
}
