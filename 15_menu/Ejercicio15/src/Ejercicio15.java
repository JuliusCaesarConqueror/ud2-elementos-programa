import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ejercicio15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba dos números");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String opcion;
         do {
             System.out.println("                 ");
             System.out.println("Menú");
             System.out.println("Escoga una de las opciones ");
             System.out.println("a)Suma");
             System.out.println("b)Resta");
             System.out.println("c)Multiplicación");
             System.out.println("d)División");
             System.out.println("e)Resto");
             System.out.println("f)Terminar");
             opcion = br.readLine();
            if (!opcion.equalsIgnoreCase("F")) {
                switch (opcion.toUpperCase()) {
                    case "A":
                        int sum = a + b;
                        System.out.println("La suma es: " + sum);
                        break;
                    case "B":
                        int resta = a - b;
                        System.out.println("La resta es: " + resta);
                        break;
                    case "C":
                        int mult = a * b;
                        System.out.println("La multiplicación es: " + mult);
                        break;

                    case "D":
                        int div = a / b;
                        System.out.println("La división  es: " + div);
                        break;
                    case "E":
                        int resto = a % b;
                        System.out.println("El resto de la división es: " + resto);
                        break;
                    case "F":
                       System.out.println("Ha escogido terminar");
                        break;
                    default:
                        System.out.println("No existe tal opción");
                }
            }
    }while (!opcion.equalsIgnoreCase("F"));
        System.out.println("Terminaste");
    }

}