import java.time.Year;
import java.util.Scanner;

public class anioBisiesto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int anio;

        System.out.println("Introduce el año a evaluar");
        anio = scanner.nextInt();

        if (Year.isLeap(anio)) {
            System.out.println("El año "+anio+" es bisiesto");
        } else {
            System.out.println("El año "+anio+" no es bisiesto");
        }
    }
}
