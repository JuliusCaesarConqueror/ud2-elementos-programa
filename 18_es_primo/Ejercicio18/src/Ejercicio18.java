import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Escribe un numero y te diremos si es primo o no ");
            int num=Integer.parseInt(br.readLine());
            if (num%num!=0){
                System.out.println("El número "+num+" si es primo.");


            } else {
                System.out.println("El número "+num+" no es primo.");
            }
    }
}
