import java.util.*;
public class Video {
    private String url;
    private int curtidas;
    private int volume;
    private String descricao;
    private String nome;
    private List<Comentario> comentarios;

    public Video(){
        comentarios = new ArrayList<>();
        volume = 50;
        curtidas=0;
    }
    public Video(String nome){

        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getVolume() {
        return volume;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public String getUrl() {
        return url;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
        System.out.println("Comentário adicionado com sucesso!");
    }

    public void removeComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    public void addCurtida(){
        curtidas++;
    }
    public void removeCurtida(){
        curtidas--;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
