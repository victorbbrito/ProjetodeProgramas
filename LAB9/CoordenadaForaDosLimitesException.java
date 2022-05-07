package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

import br.edu.ufam.icomp.lab_excecoes.RoverCoordenadaException;

public class CoordenadaForaDosLimitesException extends RoverCoordenadaException {
    public CoordenadaForaDosLimitesException(){
        this("Coordenada com valores fora dos limites");
    }
    public CoordenadaForaDosLimitesException(String mensagem){
        super(mensagem);
    }
}
