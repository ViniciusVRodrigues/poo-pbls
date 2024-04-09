public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Usuario usuario = new Usuario("Ronaldo","ronaldo@jemail.com");
        Canal canal = usuario.addCanal("Manual do mundo");
    }
}