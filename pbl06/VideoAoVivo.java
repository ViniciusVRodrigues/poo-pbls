import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void cadastrarVideoAoVivo(Scanner scanner){
        System.out.println("---- Cadastro de Video Ao Vivo----");
        System.out.println("Digite o titulo:");
        setTitulo(scanner.nextLine());
        System.out.println("Digite a descrição:");
        setDescricao(scanner.nextLine());
        gerarUrl();
        System.out.println("Vídeo "+getTitulo()+" cadastrado com sucesso!");
        System.out.println("---- Cadastro de Video Ao Vivo----");
    }

    @Override
    public void exibirVideo(){
        System.out.println("Video Ao Vivo - "+getTitulo()+" - "+getDescricao()+" - "+getUrl()+" - "+visualizacoesAoVivo+" Viewers");
    }
}
