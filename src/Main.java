import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Escribe tu edad =");
        int a = Integer.parseInt(scannerA.nextLine());
        Scanner scannerB = new Scanner(System.in);
        System.out.println("escribe la edad de tu mamà =");
        int b = Integer.parseInt((scannerB.nextLine()));
        var result = a >= b; //operadores mayor que y menor que
        System.out.println(result);
        if (a>=18){
            System.out.println("Usted es un adulto aña");
        } else {
            System.out.println("anda a la choza de los pequeñines");
        }
        if (b >= 36) {
            b = b-a;
            if (b == b%2){
                System.out.println("la edad de tu mama esta mal ella te lleva el doble de edad");
            } else {
                System.out.println("la edad de tu mama es la correcta");
            }
        }

    }
}