import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Canal> canais = new ArrayList<>();
        List<VideoNormal> videos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao youtube!");
        Usuario usuario = new Usuario();
        Canal canal = new Canal();
        Boolean fim = false;
        while(fim==false){
            System.out.println("----- Menu -----");
            System.out.println("(1) - Buscar Vídeo");
            System.out.println("(2) - Buscar Canal");
            if(usuario.getNome().isEmpty())
                System.out.println("(3) - Cadastrar Usuario");
            else if (canal.getNome().isEmpty()){
                System.out.println("(3) - Ver Perfil de Usuario");
                System.out.println("(4) - Cadastrar Canal");
            }else {
                System.out.println("(3) - Ver Perfil de Usuario");
                System.out.println("(4) - Ver Canal");
                System.out.println("(5) - Cadastrar Video");
                System.out.println("(6) - Ver Videos do Canal");
            }
            System.out.println("(0) - SAIR");
            System.out.println("----- Menu -----");
            System.out.println("Digite a opção que deseja realizar: ");
            int opcaoSelecionada = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoSelecionada){
                case 3:
                    if(usuario.getNome().isEmpty()){
                        //Cadastrar Usuario
                        usuario.cadastrarUsuario(scanner);
                    }else{
                        //Exibir Usuario
                        usuario.exibirUsuario();
                    }
                    break;
                case 4:
                    if(canal.getNome().isEmpty()){
                        //Cadastrar Canal
                        canal.cadastrarCanal(scanner);
                        canais.add(canal);
                    }else{
                        canal.exibirCanal();
                    }
                    break;
                case 5:
                    canal.adicionarVideoNormal(scanner);
                    break;
                case 6:
                    canal.exibirVideosNormais();
                    break;
                case 0:
                    fim = true;
                    break;
            }
        }
    }
}