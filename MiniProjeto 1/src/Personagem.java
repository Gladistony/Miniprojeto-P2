import java.util.Scanner;

public class Personagem extends GUse{
    String Nome;
    int HPAtual = 100;
    Inventario Bag;
    public void receberDano(int dano){
        HPAtual -= dano;
        print(Nome+" recebeu "+dano+" pontos de dano");
    }
    public boolean vivo(){
        return HPAtual > 0;
    }
    public void ObterNome(Scanner scan, String txt){
        print(txt);
        Nome = scan.nextLine();
    }
    public void addItem(String item){
        Bag.Add(item);
    }
    public Personagem(){
        Bag = new Inventario();
    }
}
