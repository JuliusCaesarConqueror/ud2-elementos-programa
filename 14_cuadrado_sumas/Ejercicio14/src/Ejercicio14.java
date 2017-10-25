import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un numero para hallar su cuadrado");
        int vuelta = 1;
        int sum = 0;
        int num = 0;
        num=Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            sum += vuelta;
            vuelta += 2;
        }
        System.out.println("El cuadrado de  "+num+" es: "+sum);

    }
}


