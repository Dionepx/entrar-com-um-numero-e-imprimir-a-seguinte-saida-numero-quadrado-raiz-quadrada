import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();

        double quadrado = Math.pow(numero, 2);
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("Número: " + numero);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Raíz quadrada: " + raizQuadrada);

    }
}