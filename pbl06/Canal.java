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
        nome="";
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

    public void setNome(String nome){
        this.nome = nome;
    }
    public List<Video> getVideos() {
        return videos;
    }
    public void addVideo(VideoNormal videoNormal){
        videos.add(videoNormal);
    }
    public void removeVideo(VideoNormal videoNormal){
        videos.remove(videoNormal);
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

    public void cadastrarCanal(Scanner scanner){
        System.out.println("---- Cadastro de Canal ----");
        System.out.println("Digite o nome:");
        nome = scanner.nextLine();
        System.out.println("Canal "+nome+" cadastrado com sucesso!");
        System.out.println("---- Cadastro de Canal ----");
    }

    public void adicionarVideoNormal(Scanner scanner){
        VideoNormal video = new VideoNormal();
        video.cadastrarVideoNormal(scanner);
        videos.add(video);
    }

    public void adicionarVideoAoVivo(Scanner scanner){
        VideoAoVivo video = new VideoAoVivo();
        video.cadastrarVideoAoVivo(scanner);
        videos.add(video);
    }

    public void adicionarVideoPrivado(Scanner scanner){
        VideoPrivado video = new VideoPrivado();
        video.cadastrarVideoPrivado(scanner);
        videos.add(video);
    }

    public void exibirVideos(){
        System.out.println("----- Videos do "+nome+" -----");
        for (int i = 0; i < videos.size(); i++) {
            videos.get(i).exibirVideo();
        }
        if(videos.isEmpty())
            System.out.println("Nenhum vídeo cadastrado!");
        System.out.println("----- Videos do "+nome+" -----");
    }

    public void exibirCanal(){
        System.out.println("----- Canal -----");
        System.out.println("Nome: "+nome);
        System.out.println("----- Canal -----");
    }
}
