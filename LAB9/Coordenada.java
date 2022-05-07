package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
    private int posX;
    private int posY;
    private int digito;

    public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
        if(posX < 0 || posY < 0){
            throw new CoordenadaNegativaException("Coordenada com valor negativo");
        }
        else if(posX > 3000 || posX < 0){
            throw new CoordenadaForaDosLimitesException("Coordenada com valores fora dos limites");
        }
        else if(posY > 3000 || posY < 0){
            throw new CoordenadaForaDosLimitesException("Coordenada com valores fora dos limites");
        }
        int verificador = (posX + posY)%10;
        if(digito != verificador){
            throw new DigitoInvalidoException("Digito da coordenada inválido");
        }
        else{
            this.posX = posX;
            this.posY = posY;
            this.digito = digito;
        }
    }

    public int getPosX(){
        return this.posX;
    }

    public int getPosY(){
        return this.posY;
    }

    public double distancia(Coordenada coordenada){
        double indice = Math.pow((this.posX - coordenada.posX),2) + Math.pow((this.posY - coordenada.posY),2);
        double dist = Math.sqrt(indice);
        return dist;
    }
    
    public String toString(){
        return this.posX+", "+this.posY;
    }   
}
