import java.util.Scanner;

public class Combinaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresamos el valor n
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        // Ingresamos el valor m
        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        int resultado = combinacion(m, n);

        System.out.println("C(" + n + ", " + m + ") = " + resultado);

        sc.close();
    }

    // Caso base
    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }

        return x * factorial(x - 1);
    }

    // Función recursiva
    public static int combinacion(int m, int n) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}