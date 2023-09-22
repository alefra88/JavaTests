import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner alto = new Scanner(System.in);
        System.out.println("Escribe la altura =");
        int a = Integer.parseInt(alto.nextLine());
        Scanner ancho = new Scanner(System.in);
        System.out.println("escribe el ancho = ");
        int b = Integer.parseInt((ancho.nextLine()));
        var resultadoArea = a * b;
        System.out.println("el area es = " + resultadoArea);
        var resultadoPerimetro = (a*b)*2;
        System.out.println(" el Perimetro es = " + resultadoPerimetro);
    }
}