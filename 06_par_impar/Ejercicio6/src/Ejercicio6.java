import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un numero y te diremos si es par o no. ");
        int a=Integer.parseInt(br.readLine());

        if (a%2==0){
            System.out.println("El numero "+a+" es par. ");
        }else {
            System.out.println("El numero "+a+" es impar. ");
        }
    }
}
