public abstract class ItemBibliotecaDigital {
    private String autor;
    private String titulo;


    ItemBibliotecaDigital(String autor, String titulo){
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String descricao();
}
