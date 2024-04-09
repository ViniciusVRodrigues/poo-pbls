import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoNormal extends Video{
    private List<Comentario> comentarios;

    VideoNormal(){
        comentarios = new ArrayList<>();
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
        System.out.println("Comentário adicionado com sucesso!");
    }
    public void removeComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    public void cadastrarVideoNormal(Scanner scanner){
        System.out.println("---- Cadastro de Video ----");
        System.out.println("Digite o titulo:");
        setTitulo(scanner.nextLine());
        System.out.println("Digite a descrição:");
        setDescricao(scanner.nextLine());
        gerarUrl();
        System.out.println("Vídeo "+getTitulo()+" cadastrado com sucesso!");
        System.out.println("---- Cadastro de Video ----");
    }
    @Override
    public void exibirVideo(){
        System.out.println("Video Normal - "+getTitulo()+" - "+getDescricao()+" - "+getUrl()+ " - "+getVisualizacoes()+" views");
    }
}
