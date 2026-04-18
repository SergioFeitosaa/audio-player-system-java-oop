package model;

public class Musica extends Audio{

    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracao) {
        super(titulo, duracao);
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }
}
