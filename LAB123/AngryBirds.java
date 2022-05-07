import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v0 = scan.nextDouble();
        double angulo = scan.nextDouble();
        double dist = scan.nextDouble();
        scan.close();

        angulo = Math.toRadians(angulo);
        double r = (Math.pow(v0, 2) * Math.sin(2*angulo))/9.8;

        if(dist+0.1>r && r>dist-0.1){
            System.out.println(1);
        }
        else
            System.out.println(0);
        
    }    
}
