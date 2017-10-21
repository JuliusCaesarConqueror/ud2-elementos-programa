import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba un numero y le diremos su valor absoluto");
        int a;
        do {
            a = Integer.parseInt(br.readLine());


            if (a > 0) {
                System.out.println("El valor absoluto de " + a + " es: " + a);

            } else if (a<0){
                System.out.println("El valor absoluto de " + a + " es: " + a * -1);

           }


        } while (a != 0);
        System.out.println("Programa terminado. ");
    }
}




