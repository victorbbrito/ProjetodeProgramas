package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

import br.edu.ufam.icomp.lab_excecoes.RoverCoordenadaException;

public class DigitoInvalidoException extends RoverCoordenadaException {
    public DigitoInvalidoException(){
        this("Digito da coordenada inválido");
    }
    public DigitoInvalidoException(String mensagem){
        super(mensagem);
    }
}
