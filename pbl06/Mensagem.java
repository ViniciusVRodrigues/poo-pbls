import java.util.Date;

public class Mensagem {
    private String texto;
    private Usuario usuario;
    private Date publicadoEm;

    Mensagem(String texto, Usuario usuario){
        this.texto = texto;
        this.usuario = usuario;
        this.publicadoEm = new Date();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getPublicadoEm() {
        return publicadoEm;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
