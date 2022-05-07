import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextInt();
        double vetor[] = new double[1000];
        int contador = 0;
        while(entrada != -1){
            vetor[contador] = entrada;
            entrada = scan.nextInt();
            contador++;
        }
        double mediana;
        if(contador%2 == 0){
            mediana = (vetor[contador/2] + vetor[contador/2 -1])/2;
        }
        else
            mediana = vetor[contador/2];
        System.out.printf("%.1f",mediana);
        scan.close();
    }   
}
