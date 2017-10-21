import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Escriba 10 numeros y los sumaremos.");
    int suma=0;

        for(int i=0;i<10;i++){
        int n=Integer.parseInt(br.readLine());
            System.out.println("Escribe otro número");
        suma=suma+n;
    }
        System.out.println("La suma de todos los numeros es: "+suma);
}
}
