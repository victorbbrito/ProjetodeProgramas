package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

public class RoverCaminhoException extends RoverException {
    public RoverCaminhoException(){
        this("Exceção geral de caminho do rover");
    }
    public RoverCaminhoException(String mensagem){
        super(mensagem);
    }
}
