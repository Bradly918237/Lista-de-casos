/*7. Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota
del primer examen cuenta el 40% y la del segundo examen un 60%. En la imagen se muestra el
funcionamiento del programa.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota deseada: ");
        double notaDeseada = scanner.nextDouble();
        System.out.print("Ingrese la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();
        double notaSegundoExamen = (notaDeseada - (notaPrimerExamen * 0.4)) / 0.6;
        System.out.println("La nota necesaria en el segundo examen es: " + notaSegundoExamen);
        scanner.close();
    }
}
