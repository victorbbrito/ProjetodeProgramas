//package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        Localizavel vetorLocalizavel[] = new Localizavel[2];
        Celular novo = new Celular(55, 92, 992389565);
        CarroLuxuoso carro = new CarroLuxuoso("PHE7121");
        vetorLocalizavel[0] = carro;
        vetorLocalizavel[1] = novo;
        
        for(int i = 0 ; i < vetorLocalizavel.length ; i++ ){
           System.out.println(vetorLocalizavel[i].getPosicao()); 
        }
        
    }
    
}
