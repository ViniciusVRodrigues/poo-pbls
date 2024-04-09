public class Notificacao {
    private String descricao;
    private Canal canal;
    private Video video;
    private Boolean visto;

    public Notificacao(){
        visto=false;
    }
    public Notificacao(Canal canal, Video video){
        this();
        this.canal = canal;
        this.video = video;
    }

    public Video viewNotificacao(){
        visto=true;
        return video;
    }

    public Boolean isVisto(){
        return visto;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Video getVideo() {
        return video;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
