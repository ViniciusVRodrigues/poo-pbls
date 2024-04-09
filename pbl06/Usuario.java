import java.util.*;
public class Usuario {
    private String nome;
    private String email;
    private List<Notificacao> notificacoes;
    private List<Canal> inscricoes;
    private Canal canal;
    private List<Playlist> playlists;
    private List<Historico> historico;

    public Usuario(){
        inscricoes = new ArrayList<>();
        notificacoes = new ArrayList<>();
        playlists =  new ArrayList<>();
        historico =  new ArrayList<>();
        nome="";
    }

    public Usuario(String nome, String email){
        this();
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Historico> getHistorico() {
        return historico;
    }

    public void addHistorico(Video video){
        historico.add(new Historico(video));
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
        System.out.println("Playlist "+playlist.getNome()+" adicionada com sucesso!");
    }
    public void clearHistorico(){
        historico.clear();
        System.out.println("Historico apagado com sucesso!");
    }

    public void verVideo(VideoNormal videoNormal){
        System.out.println("Video "+videoNormal.getTitulo()+" foi aberto para visualização!");
    }

    public void addCanalInscrito(Canal canal){
        inscricoes.add(canal);
        canal.addInscrito(this);
    }

    public void cadastrarUsuario(Scanner scanner){
        System.out.println("---- Cadastro de Usuário ----");
        System.out.println("Digite o nome:");
        nome = scanner.nextLine();
        System.out.println("Digite o email:");
        email = scanner.nextLine();
        System.out.println("Usuario "+nome+" cadastrado com sucesso!");
        System.out.println("---- Cadastro de Usuário ----");
    }

    public void exibirUsuario(){
        System.out.println("----- Usuario -----");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("----- Usuario -----");
    }

}
