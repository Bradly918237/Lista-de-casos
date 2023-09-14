/*5. Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.*/
public class Main {
    public static void main(String[] args) {
        int horasTrabajadas = 40;
        double salarioHora = 12;
        double salarioSemanal = horasTrabajadas * salarioHora;

        System.out.println("El salario semanal es: " + salarioSemanal + " euros.");
    }
}
