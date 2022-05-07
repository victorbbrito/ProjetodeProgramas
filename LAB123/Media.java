import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double entrada_1 =  scan.nextDouble();
        double entrada_2 =  scan.nextDouble();
        double entrada_3 =  scan.nextDouble();
        scan.close();
        
        double media = (entrada_1 + entrada_2 + entrada_3)/3;
        System.out.printf("%.2f", media);
    }
}
