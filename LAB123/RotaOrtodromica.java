import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t1 = scan.nextDouble();
        double g1 = scan.nextDouble();
        double t2 = scan.nextDouble();
        double g2 = scan.nextDouble();
        scan.close();

        double r = 6371.00;
        double distancia;

        double t1R = Math.toRadians(t1);
        double g1R = Math.toRadians(g1);
        double t2R = Math.toRadians(t2);
        double g2R = Math.toRadians(g2);
        double conta = (Math.sin(t1R)*Math.sin(t2R)) + (Math.cos(t1R)*Math.cos(t2R)*Math.cos(g1R-g2R));
        distancia = r * (Math.acos(conta));
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km",t1,g1,t2,g2,distancia);
    }    
}
