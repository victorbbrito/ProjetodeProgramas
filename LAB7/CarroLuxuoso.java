//package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.Random;
public class CarroLuxuoso extends Carro implements Localizavel{
    
    public CarroLuxuoso(String placa){
        super(placa);
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
        return 15.0;
    }
}
