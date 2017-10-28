import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio20 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca los numeros de 8 digitos de su DNI y su letra");
        int num=Integer.parseInt(br.readLine());
        String letra=br.readLine();

        switch(letra.toUpperCase()){
            case "A":
                if(num%23==3){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;

            case "B":
                if(num%23==11){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "C":
                if(num%23==20){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "D":
                if(num%23==9){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "E":
                if(num%23==22){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "F":
                if(num%23==7){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "G":
                if(num%23==4){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "H":
                if(num%23==18){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "J":
                if(num%23==13){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "K":
                if(num%23==21){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "L":
                if(num%23==19){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "M":
                if(num%23==5){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "N":
                if(num%23==12){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "P":
                if(num%23==8){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "Q":
                if(num%23==16){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "R":
                if(num%23==1){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "S":
                if(num%23==15){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "T":
                if(num%23==0){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "V":
                if(num%23==17){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "W":
                if(num%23==2){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "X":
                if(num%23==10){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "Y":
                if(num%23==6){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            case "Z":
                if(num%23==14){
                    System.out.println("El DNI es correcto");

                }else {
                    System.out.println("La letra no corresponde con el DNI");
                } break;
            default:
                System.out.println("No existe dicha letra en los DNI");
        }

    }
}
