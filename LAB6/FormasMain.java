package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main(String[] args) {
       Circulo novoCirculo = new Circulo(6, 8, 10);
       Retangulo novoRetangulo = new Retangulo(1, 1, 2, 3);
       Quadrado novoQuadrado = new Quadrado(10, 10, 2);
       System.out.println(novoRetangulo.getArea());
       System.out.println(novoCirculo.getArea());
    }
    
}   
