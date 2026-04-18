import model.Musica;
import model.Podcast;
import service.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Manguetown",314);
        Podcast podcast = new Podcast("Os Programadores", 3600);
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.tocar(musica);
        audioPlayer.curtir(musica);

        audioPlayer.tocar(podcast);
        audioPlayer.curtir(podcast);

        audioPlayer.fichaDoAudio(musica);

        System.out.println("----------------");

        audioPlayer.fichaDoAudio(podcast);




    }


}
