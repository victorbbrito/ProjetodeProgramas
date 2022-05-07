package br.edu.ufam.icomp.lab_excecoes;

import br.edu.ufam.icomp.lab_excecoes.Caminho;
import br.edu.ufam.icomp.lab_excecoes.Coordenada;

public class RoverMain {
    public static void main(String[] args) {
        Caminho c = new Caminho(7);
        Coordenada nova = new Coordenada(55, 21, 6);

        c.addCoordenada(nova);
        
        System.out.println(c.toString());
    }
}
