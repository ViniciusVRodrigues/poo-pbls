import java.util.*;
public class Canal {
    private List<VideoNormal> videosNormais;
    private List<VideoPrivado> videosPrivados;
    private List<VideoAoVivo> videosAoVivo;
    private String nome;
    private List<Playlist> playlists;
    private List<Usuario> inscritos;
    public Canal(){
        playlists = new ArrayList<>();
        inscritos = new ArrayList<>();
        videosNormais = new ArrayList<>();
        videosAoVivo = new ArrayList<>();
        videosPrivados = new ArrayList<>();
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
    public List<VideoNormal> getVideosNormais() {
        return videosNormais;
    }
    public void addVideoNormal(VideoNormal videoNormal){
        videosNormais.add(videoNormal);
    }
    public void removeVideoNormal(VideoNormal videoNormal){
        videosNormais.remove(videoNormal);
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
        VideoNormal videoNormal = new VideoNormal();
        videoNormal.cadastrarVideoNormal(scanner);
        videosNormais.add(videoNormal);
    }

    public void exibirVideosNormais(){
        System.out.println("----- Videos do "+nome+" -----");
        for (int i = 0; i < videosNormais.size(); i++) {
            videosNormais.get(i).exibirVideo();
        }
        if(videosNormais.isEmpty())
            System.out.println("Nenhum vídeo cadastrado!");
        System.out.println("----- Videos do "+nome+" -----");
    }

    public void exibirCanal(){
        System.out.println("----- Canal -----");
        System.out.println("Nome: "+nome);
        System.out.println("----- Canal -----");
    }
}
