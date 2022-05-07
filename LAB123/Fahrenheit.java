import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        scan.close();

        double Fahrenheit = ((9*(double) entrada)/5)+32;
        System.out.printf("%.2f",Fahrenheit);
    }
}
