import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cuántos números quieres sumar?");
        int c=0;
        c=Integer.parseInt(br.readLine());
        System.out.println("Escriba "+c+" numeros y los sumaremos.");
        int suma=0;
        for(int i=0;i<c;i++){
            int n=Integer.parseInt(br.readLine());
            System.out.println("Escribe otro número.");
            suma=suma+n;
        }
        System.out.println("La suma de todos los numeros es: "+suma);
    }

    }

