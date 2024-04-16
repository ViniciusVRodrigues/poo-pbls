public class EBook extends ItemBibliotecaDigital implements Baixavel{
    EBook(String autor, String titulo){
        super(autor,titulo);
    }

    @Override
    public String descricao() {
        return "EBook - '"+getTitulo()+"' - '"+getAutor()+"'";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando EBook: '"+getTitulo()+"' - '"+getAutor()+"'");
    }
}
