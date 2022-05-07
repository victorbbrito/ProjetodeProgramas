import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        scan.close();

        double aux;
        double digito = 0;
        double soma = 0;
        int kValor = 0;
        double original = entrada;

        while(entrada > 0){
            aux = entrada/10;
            digito = aux-(int)aux;
            entrada = (int)aux;
            kValor++;
        }
        entrada = original;
        while(entrada > 0){
            aux = entrada/10;
            digito = aux-(int)aux;
            entrada = (int)aux;
            digito = digito*10;
            soma = soma + Math.pow(digito, kValor);
        }
        if((int)soma == (int)original){
            System.out.println("SIM");
        }
        else
            System.out.println("NAO");
    }
}
