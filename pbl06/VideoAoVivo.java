import java.util.ArrayList;
import java.util.List;

public class VideoAoVivo extends Video{
    private List<Mensagem> chat;
    private int visualizacoesAoVivo;

    VideoAoVivo(){
        visualizacoesAoVivo = 0;
        chat = new ArrayList<>();
    }

    public int getVisualizacoesAoVivo() {
        return visualizacoesAoVivo;
    }

    public void addVisualizacoes(){
        visualizacoesAoVivo++;
    }

    public void removeVisualizacoes() {
        visualizacoesAoVivo--;
    }

    public List<Mensagem> getChat() {
        return chat;
    }

    public void addMensagem(Mensagem mensagem){
        chat.add(mensagem);
    }

    public void removeMensagem(Mensagem mensagem){
        chat.remove(mensagem);
    }
}
