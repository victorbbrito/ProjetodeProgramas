import java.util.Scanner;
public class Xadrez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();
        for(int coluna = 0; coluna != entrada; coluna ++){
            for(int linha = 0; linha != entrada; linha ++){
                if(coluna%2 == 0){
                    System.out.print("* ");
                }
                else System.out.print(" *");        
            }
            System.out.print("\n");
        }
    
    }
}
