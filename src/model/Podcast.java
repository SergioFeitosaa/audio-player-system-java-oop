package model;

public class Podcast extends Audio{

    private String host;
    private String descricao;
    private String episodio;

    public Podcast(String titulo, int duracao) {
        super(titulo, duracao);
    }

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEpisodio() {
        return episodio;
    }
}
