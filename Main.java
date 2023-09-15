/*17. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo sólo se utiliza para indicar el final de la introducción de datos, pero no se
incluye en el cómputo*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNumeros = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Ingrese un número, ingresar negativo para salir: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            contadorNumeros++;
            if (numero % 2 != 0) {
                sumaImpares += numero;
                cantidadImpares++;
            }
            if (numero % 2 == 0 && numero > mayorPar) {
                mayorPar = numero;
            }
        }
        double mediaImpares = (double) sumaImpares / cantidadImpares;
        System.out.println("Cantidad de números introducidos: " + contadorNumeros);
        System.out.println("Media de los números impares: " + mediaImpares);
        System.out.println("Mayor de los números pares: " + mayorPar);
        scanner.close();
    }
}
