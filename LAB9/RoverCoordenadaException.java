package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

public class RoverCoordenadaException extends RoverException {
    public RoverCoordenadaException(){
        this("Exceção geral de coordenada do rover");
    }

    public RoverCoordenadaException(String mensagem){
        super(mensagem);
    }
}
