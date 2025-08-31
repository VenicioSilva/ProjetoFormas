package model;

public abstract class FormaGeometrica implements Calculavel {
//cumprir regras da interface e add caracteristicas
    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Forma: " + this.nome);
    }

}