import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
        int entrada = scan.nextInt();
    
        scan.close();
        int Idade;
        Idade = entrada - 1909;
        System.out.println("A UFAM tem "+Idade+" anos de fundacao");
    }
}
