/*9. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
horas ordinarias (40 primeras horas de trabajo) se pagan a 12 soles la hora. A partir de la hora
41, se pagan a 16 soles la hora.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (40 * 12) + (horasExtras * 16);
        }
        System.out.println("El salario semanal es: " + salarioSemanal + " soles");
        scanner.close();
    }
}
