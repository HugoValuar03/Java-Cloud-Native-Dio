public class Computer implements VideoPlayer, MusicPlayer {

    public int age;


    @Override
    public void playVideo() {

        System.out.println("O Computador está tocando música");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador está pausando música");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador está parando a música");
    }

    @Override
    public void playMusic() {
        System.out.println("O Computador está iniciando o vídeo");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador está pausando o vídeo");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador está parando o vídeo");
    }
}
