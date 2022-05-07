import java.util.Scanner;

public class ValorExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();
        int k = 1;
        double soma = Math.pow(2, k);

        while(soma <= entrada){
            k++;
            soma = soma + Math.pow(2, k);
        }
        System.out.println(k);
    } 
}
