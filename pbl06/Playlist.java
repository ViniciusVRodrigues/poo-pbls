import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private String descricao;
    private List<Video> videos;

    public Playlist(){
        videos = new ArrayList<>();
    }
    public Playlist(String nome){
        this();
        this.nome = nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void addVideo(Video video){
        videos.add(video);
        System.out.println("Video adicionado com sucesso!");
    }

    public void removeVideo(Video video){
        videos.remove(video);
        System.out.println("Video removido com sucesso!");
    }

}
