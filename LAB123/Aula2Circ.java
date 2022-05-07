
public class Aula2Circ {
    public static void main(String[] args) {
        class Circulo{
            String nome= new String();
            int posX = 0;
            int posY = 0;
            double raio = 0.00;
            static int numCirculos;
        
            double getArea(){
                return 3.14159 * raio *raio;
            }
            double getDiametro(){
                return 2*raio;
            }
        }

        Circulo circ = new Circulo();
        circ.nome = "primeiro";
        circ.posX = 0;
        circ.posY = 0;
        circ.raio = 1.9;
        
        
        System.out.printf("%.2f\n", circ.getDiametro());
        System.out.printf("%.2f", circ.getArea());
    }
}
