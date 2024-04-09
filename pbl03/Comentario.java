import java.util.Date;
public class Comentario {
    private  String nome;
    private String texto;
    private Usuario usuario;
    private Date publicadoEm;
    private int curtidas;
    public Comentario(){
        curtidas=0;
        publicadoEm = new Date();
    }
    public Comentario(String nome,String texto,Usuario usuario){
        this();
        this.nome = nome;
        this.texto = texto;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public Date getPublicadoEm() {
        return publicadoEm;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void addCurtida(){
        curtidas++;
    }

    public void removeCurtida(){
        curtidas--;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
