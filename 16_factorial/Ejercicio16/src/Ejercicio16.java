import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio16 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba un numero y le calcularemos su factorial");
        int numero=Integer.parseInt(br.readLine());
        int factorial=1;
        for (int i = numero; i > 0; i--) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
