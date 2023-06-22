import java.util.Scanner;

public class GUse {
    public static void print(String txt){
        System.out.println(txt);
    }
    public static int escolhas(Scanner scan, String pergunta, String[] opcoes){
        print(pergunta);
        for (int i = 0; i < opcoes.length ;i++ ){
            print(" >" + opcoes[i]);
        }
        String ler = "";
        int cont = 0;
        Boolean encontrado = false;
        while (! encontrado){
            ler = scan.nextLine();
            cont = 0;
            for (String i: opcoes){
                cont++;
                if (i.equalsIgnoreCase(ler)){
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) print("Opção não valida, tente novamente ...");
        }
        return cont;
    }
}