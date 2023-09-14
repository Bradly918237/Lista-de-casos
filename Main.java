/*7. Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota
del primer examen cuenta el 40% y la del segundo examen un 60%. En la imagen se muestra el
funcionamiento del programa.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota del primer examen: ");
        double notaExamen1 = scanner.nextDouble();
        System.out.print("Ingrese la nota del segundo examen: ");
        double notaExamen2 = scanner.nextDouble();
        System.out.print("Ingrese la nota deseada: ");
        double notaDeseada = scanner.nextDouble();
        double notaFaltante = notaDeseada - (notaExamen1 + notaExamen2);
        System.out.println("La nota que falta para alcanzar la nota deseada es: " + notaFaltante);
        scanner.close();
    }
}
