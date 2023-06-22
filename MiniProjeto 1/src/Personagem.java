import java.util.Scanner;

public class Personagem extends GUse{
    String Nome;
    int HPAtual = 100;
    int Sede = 100;
    int Fome = 100;
    public void ObterNome(Scanner scan, String txt){
        print(txt);
        Nome = scan.nextLine();
    }
}
