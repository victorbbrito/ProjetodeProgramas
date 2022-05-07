import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        scan.close();

        double aux;
        double digito = 0;
        double soma = 0;
        if(entrada == 0){
            System.out.println(0);
        }
        else{
            while(entrada > 0){
                aux = entrada/10;
                digito = aux-(int)aux;
                entrada = (int)aux;
                soma = soma + (digito*10);
            }
            System.out.printf("%.0f",soma);
        }
    }
}
