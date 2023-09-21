import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Escribe el primer valor =");
        int a = Integer.parseInt(scannerA.nextLine());
        Scanner scannerB = new Scanner(System.in);
        System.out.println("escribe el segundo valor =");
        int b = Integer.parseInt((scannerB.nextLine()));
        var result = a + b;
        System.out.println(result);
    }
}