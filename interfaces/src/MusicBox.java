public class MusicBox implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("O Caixa de Musica está iniciando o vídeo");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Caixa de Musica está pausando o vídeo");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Caixa de Musica está parando o vídeo");
    }
}
