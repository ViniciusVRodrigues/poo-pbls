import java.util.*;
public class Video {
    private String url;
    private int curtidas;
    private int visualizacoes;
    private String descricao;
    private String titulo;


    public Video(){
        curtidas=0;
        visualizacoes=0;
        url="";
    }
    public Video(String titulo){
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getUrl() {
        return url;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void addVisualizacao() {
        visualizacoes++;
    }

    public void removeVisualizacao() {
        visualizacoes--;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void gerarUrl(){
        if(url.isEmpty()){
            String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

            Random random = new Random();
            StringBuilder stringBuilder = new StringBuilder(15);

            for (int i = 0; i < 15; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                stringBuilder.append(CHARACTERS.charAt(randomIndex));
            }

            url = stringBuilder.toString();
        }else{
            System.out.println("URL já foi gerada!");
        }


    }
}
