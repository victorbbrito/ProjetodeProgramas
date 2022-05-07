import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ladoA = scan.nextDouble();
        double ladoB = scan.nextDouble();
        double ladoC = scan.nextDouble();
        scan.close();
        
        boolean triangulo = true;
        String tipo;

        if((ladoA + ladoB) <= ladoC){
            triangulo = false;
        }
        else if((ladoC + ladoB) <= ladoA){
            triangulo = false;
        }
        else if((ladoA + ladoC) <= ladoB){
            triangulo = false;
        }
        else{
            triangulo = true;
        }

        if(triangulo == true){
            if(ladoA == ladoB && ladoB == ladoC){
                tipo = "equilatero";
            }
            else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
                tipo = "isosceles";
            }
            else
                tipo = "escaleno";
            System.out.println(tipo);    
        }
        else
            System.out.println("invalido"); 
    }

}
