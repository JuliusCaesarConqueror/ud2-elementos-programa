import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca la temperatura en Cº ");
        double c=Double.parseDouble(br.readLine());
        System.out.println("Escriba la temperatura deseada a convertir");

        String temperatura=br.readLine();
        switch(temperatura.toUpperCase()){
            case "F":
            case "f":
                c=(1.8*c)+32;
                System.out.println("La temperatura en Fahrenheit es: "+c+" F");break;
            case"K":
            case"k":
                c=c+273.15;
                System.out.println("La temperatura en Kelvin es: "+c+" K ");break;

        }

    }

    }

