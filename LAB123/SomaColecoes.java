import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int vetor[] = new int[1000];
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

        int soma = 0;
        int i = 0;
        while( i != contador){
            soma = soma + vetor[i];
            i++;
            if(vetor[i]< 0){
                System.out.println(soma);
                soma = 1;
            }
            
        }
        scan.close();
    }
}
