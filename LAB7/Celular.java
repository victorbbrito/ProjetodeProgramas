//package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.Random;

public class Celular implements Localizavel {
    private int codPais;
    private int codArea;
    private int numero;

    public Celular(int codPais , int codArea , int numero){
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    public final void setCodPais(int codPais) {
        if(codPais > 0 && codPais <2000){
            this.codPais = codPais;
        }
        else
            this.codPais = -1;
    }

    public int getCodPais() {
        return this.codPais;
    }

    public final void setCodArea(int codArea) {
        if(codArea > 9 && codArea < 100){
            this.codArea = codArea;
        }
        else
            this.codArea = -1;
    }

    public int getCodArea() {
        return this.codArea;
    }

    public final void setNumero(int numero) {
        if(numero > 9999999 && numero <1000000000){
            this.numero = numero;
        }
        else
            this.numero = -1;
    }

    public int getNumero() {
        return this.numero;
    }

    public Posicao getPosicao(){
        
        Random number = new Random();
        double maxLatitude = -3.160000;
        double minLatitude = -2.960000;
        double maxLongitude = -60.120000;
        double minLongitude = -59.820000;
        double maxAltitude = 100.0;
        double minAltitude = 15.0;

        double latitude = minLatitude + (maxLatitude - minLatitude) * number.nextDouble();
        double longitude = minLongitude + (maxLongitude - minLongitude) * number.nextDouble();
        double altitude = minAltitude + (maxAltitude - minAltitude) * number.nextDouble();

        Posicao radomPosition = new Posicao(latitude, longitude, altitude);

        return radomPosition;
    }

    public double getErroLocalizacao(){
        return 50.0;
    }
}
