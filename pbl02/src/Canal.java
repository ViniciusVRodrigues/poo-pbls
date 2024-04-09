import java.util.*;
public class Canal {
    private List<Video> videos;
    private String nome;
    private List<Playlist> playlists;
    private List<Usuario> inscritos;
    public Canal(){
        playlists = new ArrayList<>();
        inscritos = new ArrayList<>();
        videos = new ArrayList<>();
    }
    public Canal(String nome){
        this();
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Usuario> getInscritos() {
        return inscritos;
    }

    public List<Video> getVideos() {
        return videos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void addVideo(Video video){
        videos.add(video);
    }
    public void removeVideo(Video video){
        videos.remove(video);
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist){
        playlists.remove(playlist);
    }

    public void addInscrito(Usuario usuario){
        inscritos.add(usuario);
    }

    public void removeInscrito(Usuario usuario){
        inscritos.remove(usuario);
    }
}
