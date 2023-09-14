/*11. Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos
que faltan para llegar a la medianoche.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        int segundosFaltantes = (24 - horas) * 3600 + (60 - minutos) * 60;
        System.out.println("Los segundos que faltan para llegar a la medianoche son: " + segundosFaltantes);
        scanner.close();
    }
}
