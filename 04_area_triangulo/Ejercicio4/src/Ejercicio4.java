import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba el valor de la base");
        double b=Double.parseDouble(br.readLine());
        System.out.println("Escriba el valor de la altura");
        double h=Double.parseDouble(br.readLine());
        double a=(b*h)/2;
        System.out.println("El area del triángulo es: "+a);


    }
}
