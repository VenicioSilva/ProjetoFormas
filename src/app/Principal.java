package app;

import model.Calculavel;
import model.Circulo;
import model.Retangulo;
import model.Triangulo;

public class Principal {

    public static void main(String[] args) {

        Calculavel meuCirculo = new Circulo(10.0);
        Calculavel meuRetangulo = new Retangulo(5.0, 10.0);
        Calculavel meuTriangulo = new Triangulo(10.0, 8.0, 10.0, 9.0, 9.0);

        Calculavel[] formas = {meuCirculo, meuRetangulo, meuTriangulo};

        for (Calculavel formaDaVez : formas) {
            System.out.printf("\nArea = %.2f\n", formaDaVez.calcularArea());
            System.out.printf("Perimetro = %.2f\n", formaDaVez.calcularPerimetro());
        }
    }
}