package service;

import model.Audio;

public class AudioPlayer {

    public void tocar (Audio audio){
        audio.reproduzir();
    }

    public void curtir (Audio audio){
        audio.curtir();
    }

    public void fichaDoAudio (Audio audio){
        System.out.println("Titulo: " + audio.getTitulo());
        System.out.println("Reprodução: " + audio.getTotalReproducoes());
        System.out.println("Curtidas: " + audio.getTotalCurtidas());
        System.out.println("Classificação: " + audio.getClassificacao());
    }
}
