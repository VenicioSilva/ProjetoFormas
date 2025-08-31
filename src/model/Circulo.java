package model;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}