public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel{
    VideoDigital(String autor, String titulo){
        super(autor,titulo);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital - '"+getTitulo()+"' - '"+getAutor()+"'";
    }

    @Override
    public void visualizar() {
        System.out.println("Exibindo Video Digital: '"+getTitulo()+"' - '"+getAutor()+"'");
    }
}
