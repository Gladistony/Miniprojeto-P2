import java.util.Scanner;

public class Personagem extends GUse{
    String Nome;
    int HPAtual = 100;
    int Dano = 10;

    
    String Drops = "";
    Inventario Bag;
    public void receberDano(int dano){
        HPAtual -= dano;
        print(Nome+" recebeu "+dano+" pontos de dano");
        if (HPAtual < 0) HPAtual = 0;
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
    public void showData(){
        if (vivo()){
            print(Nome +" - "+ HPAtual + " / 100 Inventario: "+Bag.listar());
        } else {
            print(Nome + " está morto");
        }
    }
    public void VerificarGameOver(){
        if (! vivo()){
            printCentral("GAME OVER");
            System.exit(0);
        }
    }
    public Personagem(){
        Bag = new Inventario();
    }
}
