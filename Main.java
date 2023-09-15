/*20. Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos
pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de
int donde sea necesario para admitir números largos.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();
        long sumaPares = 0;
        int cantidadPares = 0;
        String numeroStr = String.valueOf(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            if (digito % 2 == 0) {
                sumaPares += digito;
                cantidadPares++;
            }
        }
        System.out.println("Suma de los dígitos pares: " + sumaPares);
        System.out.println("Dígitos pares: " + cantidadPares);
        scanner.close();
    }
}
