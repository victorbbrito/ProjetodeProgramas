import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();

        // notas: 50,10,2
        if((entrada%2 != 0)||(entrada <= 0)){
            System.out.print("Valor Invalido");
        }
        else{
            int notas_50 = 0;
            int aux_50 = 0;
            int notas_10 = 0;
            int aux_10 = 0;
            int notas_2 = 0;
            int aux_2 = 0;

            while(aux_50+50 <= entrada){
                aux_50 = aux_50 + 50;
                notas_50++;
            }
            entrada = entrada - aux_50;
            if(entrada > 0){
                while(aux_10 + 10 <= entrada){
                    aux_10 = aux_10 + 10;
                    notas_10++;
                }
                entrada = entrada - aux_10;
                if(entrada > 0){
                    while(aux_2 + 2 <= entrada){
                        aux_2 = aux_2 + 2;
                        notas_2++;
                    }
                }
            }
            System.out.print(notas_50 + " notas de R$50, " + notas_10 +" notas de R$10 e "+ notas_2 +" notas de R$2");
        }
    }
}
