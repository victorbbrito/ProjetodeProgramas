package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

import br.edu.ufam.icomp.lab_excecoes.RoverCoordenadaException;

public class CoordenadaNegativaException extends RoverCoordenadaException{
    public CoordenadaNegativaException(){
        this("Coordenada com valor negativo");
    }
    public CoordenadaNegativaException(String mensagem){
        super(mensagem);
    }
}
