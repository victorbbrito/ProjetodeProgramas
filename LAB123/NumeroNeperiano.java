import java.util.Scanner;

public class NumeroNeperiano {
    public static double fatorial(int valor){
        int resultado = 1;
        int contador = 1;
        while(contador != valor+1){
            resultado = resultado * contador;
            contador++;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();
        double valor = 0;
        int contador = 0;

        while(contador != entrada){
            valor = valor+1/fatorial(contador);
            contador++;
        }
        
        System.out.printf("%.6f",valor);

    }
}
