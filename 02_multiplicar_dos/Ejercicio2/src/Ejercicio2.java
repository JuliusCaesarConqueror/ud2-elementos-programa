import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserte dos numeros");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int m=a*b;
        System.out.println("El resultado de la multiplicacion de los dos numeros introducidos es: "+m);

    }
}
