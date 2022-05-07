import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        double vetor[] = new double[1000];
        int contador = 0;
        while(entrada != -1){
            while(entrada != -1){
                vetor[contador] = entrada;
                entrada = scan.nextInt();
                contador++;
            }
            vetor[contador] = entrada;
            entrada = scan.nextInt();
            contador++;
        }

        double soma = 0;
        int i = 0;
        int dividendo = 0;
        while( i != contador){
            soma = soma + vetor[i];
            i++;
            dividendo++;
            if(vetor[i]< 0){
                soma = soma/dividendo;
                System.out.printf("%.2f\n",soma);
                dividendo = -1;
                soma = 1;
            }
            
        }
        scan.close();
    }
}
