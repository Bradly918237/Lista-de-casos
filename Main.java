/*1. Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y
999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.*/
public class Main {
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Suma: " + (x + y));
        System.out.println("Resta: " + (x - y));
        System.out.println("División: " + (x / y));
        System.out.println("Multiplicación: " + (x * y));
    }
}
