import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GUse {
    public static void print(String txt){
        System.out.println(txt);
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Erro no tempo");
        }
    }
    public static void instaprint(String txt){
        System.out.println(txt);
    }

    public static void printCentral(String txt) {
        int tam = 25 - txt.length() / 2;
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < tam; i++){
            System.out.print(" ");
        }
        System.out.print(txt);System.out.println();
        System.out.println("--------------------------------------------------");
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
