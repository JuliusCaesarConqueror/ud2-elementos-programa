import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba un numero y le diremos que dia de la semana es ");
        int a = Integer.parseInt(br.readLine());
            switch (a) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
            default:
                System.out.println("No es ningun dia de la semana");
            }


        }
    }
