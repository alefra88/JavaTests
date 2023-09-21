// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var cadena1 = "hola mundo";
        var cadena2 = "adios mundo";
        var comparacionDeCadenasReferencias = cadena1 == cadena2;
        System.out.println("comparacionDeCadenasReferencias = " + comparacionDeCadenasReferencias); //hace comparacion de referencias del objeto
        var comparacionDeCadenas = cadena1.equals(cadena2);
        System.out.println("comparacionDeCadenas = " + comparacionDeCadenas);
    }
}