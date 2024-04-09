import java.util.ArrayList;
import java.util.List;

public class VideoPrivado extends Video{
    private List<Comentario> comentarios;

    private String senha;
    private List<Usuario> usuariosPermitidos;

    VideoPrivado(){
        usuariosPermitidos = new ArrayList<>();
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public List<Usuario> getUsuariosPermitidos() {
        return usuariosPermitidos;
    }

    public void addUsuario(Usuario usuario){
        usuariosPermitidos.add(usuario);
    }

    public void removeUsuario(Usuario usuario){
        usuariosPermitidos.remove(usuario);
    }

}
