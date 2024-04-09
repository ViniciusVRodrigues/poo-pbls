import java.util.Date;

public class Historico {
    private Video video;
    private Date visualizadoEm;

    public Historico(){
        visualizadoEm = new Date();
    }
    public Historico(Video video){
        this();
        this.video = video;
    }
    public Date getVisualizadoEm() {
        return visualizadoEm;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
