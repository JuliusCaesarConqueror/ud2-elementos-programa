import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido al juego de la adivinanza, ¿Qué número estoy pensando? ");
        Random r = new Random();
        int aleatorio = r.nextInt(100);
        int numero=0;
        int intentos = 0;
        String respuesta;
        do {
               intentos++;
               respuesta = br.readLine();
            if(!respuesta.equals("FIN")) {
               numero = Integer.parseInt(respuesta);
               if (aleatorio == numero) {
                   System.out.println("Enhorabuena has acertado en: " + intentos + " intentos.");
               } else if (aleatorio > numero) {
                   System.out.println("El numero es mas alto");
               } else {
                   System.out.println("El numero es mas bajo");
               }
           }
        } while (!respuesta.equals("FIN")&& numero!=aleatorio);
    }
}
