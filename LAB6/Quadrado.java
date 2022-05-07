package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{
    
    public Quadrado(int posX, int posY, double lado){
        super(posX, posY, lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado na "+this.getPosString()+" com lado de "+this.altura+"cm (área="+this.getArea()+"cm2, perímetro="+this.getPerimetro()+"cm)";
    }

}
