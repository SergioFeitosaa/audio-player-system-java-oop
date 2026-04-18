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

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        if (this.totalCurtidas >= 100) {
            return 5;
        } else if (totalCurtidas >= 50) {
            return 4;
        } else {
            return 3;
        }
    }
}
