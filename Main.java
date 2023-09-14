/*10. Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
Aplica la fórmula sqrt((2 * h) / g)*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura en metros: ");
        double altura = scanner.nextDouble();
        double tiempo = Math.sqrt((2 * altura) / 9.8);
        System.out.println("El tiempo de caída es: " + tiempo + " segundos");
        scanner.close();
    }
}
