public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel,Baixavel{
    VideoDigital(String autor, String titulo){
        super(autor,titulo);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital - '"+getTitulo()+"' - '"+getAutor()+"'";
    }

    @Override
    public void visualizar() {
        System.out.println("Exibindo Vídeo Digital: '"+getTitulo()+"' - '"+getAutor()+"'");
    }

    @Override
    public void baixar() {
        System.out.println("Baixando Vídeo Digital: '"+getTitulo()+"' - '"+getAutor()+"'");
    }

    @Override
    public void realizarAcao(int numAcao){
        switch (numAcao){
            case 0:
                baixar();
                break;
            case 1:
                visualizar();
                break;
            default:
                System.out.println("Não existe uma ação associada a esse número!");
                break;
        }
    }
}
