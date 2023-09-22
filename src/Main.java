
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner alto = new Scanner(System.in);
        System.out.println("Escribe el primero numero =");
        int a = Integer.parseInt(alto.nextLine());
        Scanner ancho = new Scanner(System.in);
        System.out.println("escribe el segundon numero = ");
        int b = Integer.parseInt((ancho.nextLine()));
        if (a>b) {
            System.out.println("El primero numero es mayor que el segundo");
        } else{
            System.out.println("el segundo numero es mayor que el primero");
        }
    }
}