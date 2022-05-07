import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double entrada = teclado.nextDouble();
        teclado.close();
        double raiz = Math.sqrt(entrada);
        System.out.printf("%.4f", raiz);

    }
}
