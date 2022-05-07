import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ladoA = scan.nextInt();
        int ladoB = scan.nextInt();
        int ladoC = scan.nextInt();

        scan.close();
        if(ladoA + ladoB <= ladoC){
            System.out.println("Triangulo invalido");
        }
        else if(ladoA + ladoC <= ladoB){
            System.out.println("Triangulo invalido");
        }
        else if(ladoB + ladoC <= ladoA){
            System.out.println("Triangulo invalido");
        }
        else{
            double s = (ladoA + ladoB + ladoC)/2;
            double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
            System.out.printf("%.2f", area);
        }
    }
}
