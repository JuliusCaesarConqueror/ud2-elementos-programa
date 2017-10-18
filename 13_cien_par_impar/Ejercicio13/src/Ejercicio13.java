import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Elija par o impar?");
        String tipo=br.readLine();
        int numero=1;
        int limite=100;
        while(numero <= 100){
        if(tipo.equalsIgnoreCase("PAR")){
            if(numero%2==0){
                System.out.println(numero);
            }
            numero++;
        } else if(tipo.equalsIgnoreCase("IMPAR")){
            if(numero%2!=0){
                System.out.println(numero);
            }
            numero++;
        }
            }

        }
                    }






