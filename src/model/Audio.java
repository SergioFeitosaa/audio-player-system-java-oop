package model;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalReproducoes = 0;
        this.totalCurtidas = 0;
        this.classificacao = 0;
    }

    public void reproduzir () {
        this.totalReproducoes++;
    }

    public void curtir () {
        this.totalCurtidas++;
    }
}
