import java.util.*;
public class Usuario {
    private String nome;
    private String email;
    private List<Notificacao> notificacoes;
    private List<Canal> inscricoes;
    private List<Canal> canais;
    private List<Playlist> playlists;
    private List<Historico> historico;

    public Usuario(){
        inscricoes = new ArrayList<>();
        notificacoes = new ArrayList<>();
        canais =  new ArrayList<>();
        playlists =  new ArrayList<>();
        historico =  new ArrayList<>();
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

    public Canal addCanal(String nome){
        Canal canal = new Canal(nome);
        canais.add(canal);
        return canal;
    }

    public void addPlaylist(Playlist playlist){
        playlists.add(playlist);
        System.out.println("Playlist "+playlist.getNome()+" adicionada com sucesso!");
    }
    public void clearHistorico(){
        historico.clear();
        System.out.println("Historico apagado com sucesso!");
    }

    public void verVideo(Video video){
        System.out.println("Video "+video.getNome()+" foi aberto para visualização!");
    }

    public void addCanalInscrito(Canal canal){
        inscricoes.add(canal);
        canal.addInscrito(this);
    }
}
