import java.util.Scanner;

public class App {
    public static void print(String txt){
        System.out.println(txt);
    }
    public static int escolhas(String pergunta, String[] opcoes){
        print(pergunta);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < opcoes.length ;i++ ){
            print(" >"+(i+1) + " - " + opcoes[i]);
        }
        String ler = scan.nextLine();
        scan.close();
        return  Integer.parseInt(ler);
    }
    public static void main(String[] args) throws Exception {
        
        
        print("Sua vista está turva, e você está aparentemente deitado no chão, na sua boca um gosto amargo que você não reconhece.");
        print("Suas mão estão presas a uma corrente, e a mesma aparentemente terminava numa parede de concreto. Feno estava espalhado");
        print("pelo chão. A cerca de 10 metros de você, uma pessoa encapuz.");
        print("");
        print("");
        print("Pessoa Encapuzada: Vejo que você já acordou, vamos logo com isso, se apresse e se ponha de pé ...");
        print("");
        String[] lista = {"Apenas obedecer e ficar de pé","Pedir para ele ser mais educado","Mandar ele se Fod#$"};
        int resposta = escolhas("O que você deseja fazer?", lista);
    }
}
