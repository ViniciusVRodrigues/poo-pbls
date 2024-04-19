import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ItemBibliotecaDigital> itensDigitais = new ArrayList<>();
        itensDigitais.add(new EBook("Ronaldo","Brilhou muito no corinthians!"));
        itensDigitais.add(new EBook("Villani","Quem sabe na bola parada!"));
        itensDigitais.add(new EBook("J.K. Rowling","Harry Potter"));
        itensDigitais.add(new VideoDigital("J.K. Rowling","Harry Potter e a Pedra Filosofal"));
        itensDigitais.add(new VideoDigital("Robert Kirkman","The Walking Dead"));
        itensDigitais.add(new VideoDigital("Shakespeare","Romeu e Julieta"));
        for(ItemBibliotecaDigital item : itensDigitais){
            System.out.println(item.descricao());
            item.realizarAcao(0);
            if(item instanceof VideoDigital){
                item.realizarAcao(1);
            }
            System.out.println("----------");
        }
    }
}