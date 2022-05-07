import java.util.Scanner;

public class Desconto {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double entrada = scan.nextDouble();
       scan.close();

       if(entrada >= 200){
           System.out.printf("%.2f\n",entrada*0.95);
       }
       else System.out.printf("%.2f\n",entrada);
   } 
}
