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
            System.out.print(item.descricao()+" - ");
            if(item instanceof EBook){
                ((EBook) item).baixar();
            }
            if(item instanceof VideoDigital){
                ((VideoDigital) item).visualizar();
            }
        }
    }
}