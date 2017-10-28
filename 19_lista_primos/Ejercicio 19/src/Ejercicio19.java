import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba un número ");
        int num = Integer.parseInt(br.readLine());
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i % j == 0) {
                    cont = cont + 1;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
            cont = 0;
        }
        }

    }






