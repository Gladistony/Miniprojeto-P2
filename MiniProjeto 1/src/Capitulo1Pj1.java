import java.util.Scanner;

public class Capitulo1Pj1 extends GUse{
    Personagem Pjprincipal;

    public void opcaoFicardePe(Scanner scan){
        print(">Você junta forças e se prepara para levanta, tentando ficar de pé na frente da pessoa");
        String[] lista = {"Claro que sei","Dar nos ombros","Pronunciar palavras sem sentido"};
        int resposta = escolhas(scan, "Pessoa Encapuzada: Não vai falar nada? você não sabe falar?", lista);
        switch (resposta){
            case 1: 
                opcaoDialogar(scan);
                break;
            case 2:
                dialogoFavoravel(scan);
                break;
            case 3:
                print("Pessoa Encapuzada: ...");
                print(">A pessoa armada então saca uma arma e aperta o gatilho, lhe acertando um unico tiro na perna");
                 print("Pessoa Encapuzada: Você não vale o meu tempo, te deixarei aqui para aprodecer ...");
                print(">A pessoa então dá as costas e lhe deixa lá no local, sangrando");
                saidaPreso(scan);
                break;
        }
    }
    public void opcaoFicarDeitado(Scanner scan){
        print(">Você resolve ignorar o comando da pessoa e fica ali mesmo deitado");
        print("A pessoa arqueia uma das sobrancelhas, e então revela uma arma de fogo por dentro do capuz");
        String[] lista = {"Continuar deitado","Pedir Desculpa", "Apenas se levantar"};
        int resposta = escolhas(scan, "Pessoa Encapuzada: Sua ultima chance!", lista);
        if (resposta == 1){
            print("A pessoa armada então aperta o gatilho 3 vezes, lhe acertando com varios disparos");
            print("Você morreu !!!");
            Pjprincipal.receberDano(100);
        } else if (resposta == 2){
            opcaoDialogar(scan);
        } else {
            opcaoFicardePe(scan);
        }
    }
    public void opcaoDialogar(Scanner scan){
        print(">Você se poe de pé e então começa a conversar com a pessoa");
        print("Pessoa Encapuzada: Me mandaram aqui lhe soltar, mas ... você não parece tão importante assim");
        String[] lista = {"Me solta logo","Seu trabalho","Porque esta enrrolando pra me soltar?"};
        int resposta = escolhas(scan, "Pessoa Encapuzada: O que eu deveria fazer contigo?", lista);
        switch (resposta){
            case 1:
                dialogoFavoravel(scan);
                break;
            case 2:
                print("Pessoa Encapuzada: Não tô muito afim de fazer isso");
                print(">A pessoa armada então saca uma arma e aperta o gatilho, lhe acertando um unico tiro na perna");
                print("Pessoa Encapuzada: Você não vale o meu tempo, te deixarei aqui para aprodecer ...");
                print(">A pessoa então dá as costas e lhe deixa lá no local, sangrando");
                saidaPreso(scan);
                break;
            case 3:
                dialogoFavoravel(scan);
                break;
        }
    }
    public  void opcaoOfender(Scanner scan){
        print(">Você simplesmente se levanta e manda a pessoa se 'F@d&r'");
        print("");
        print("A pessoa retira o capuz devagar e então sem falar muito saca uma pistola e aponta para você");
        print("");
        String[] lista = {"Reafirma","Pedir Desculpa"};
        int resposta = escolhas(scan,"Pessoa Encapuzada: O que você falou?", lista);
        if (resposta == 2){
            print("Pessoa Encapuzada: Vejo que você é só um covarde que fala demais");
            print("A pessoa armada então aperta o gatilho 3 vezes, lhe acertando com varios disparos");
            print("Você morreu !!!");
            Pjprincipal.receberDano(100);
        } else {
            dialogoFavoravel(scan);
        }
    }
    public void dialogoFavoravel(Scanner scan){
        print("Pessoa Encapuzada: Haha, vejo que você não tem medo.");
        print("Pessoa Encapuzada: Vou te dar uma chance de sobreviver");
        print("Ele então joga no chão proximo a você um mapa");
        print("Pessoa Encapuzada: Siga isso e conseguirar sair do labirinto com facilidade");
        print("Pessoa Encapuzada: Por sinal a chave está em meio ao feno, espero nos vermos de novo");
        print("Ele se cobre novamente com o capuz e desaparece em névoa, deixando você no local só");
        saidaSolto(scan);
    }
    public void saidaPreso(Scanner scan){
        Pjprincipal.receberDano(50);
    }
    public void saidaSolto(Scanner scan){
        Pjprincipal.addItem("Mapa do Labirinto");
    }
    public void main(Scanner scan, Personagem pj){
        Pjprincipal = pj;
        print("A vista de "+ Pjprincipal.Nome +" está turva, e você está aparentemente deitado no chão, na sua boca um gosto amargo que você não reconhece.");
        print("Suas mão estão presas a uma corrente, e a mesma aparentemente terminava numa parede de concreto. Feno estava espalhado");
        print("pelo chão. A cerca de 10 metros de você, uma pessoa com um capuz lhe observa.");
        print("");
        print("");
        print("Pessoa Encapuzada: Vejo que você já acordou, vamos logo com isso, se apresse e se ponha de pé ...");
        print("");
        String[] lista = {"Ficar de pe","Continuar deitado","Dialogar","Ofender"};
        int resposta = escolhas(scan,"O que você deseja fazer?", lista);
        switch (resposta){
            case 1: 
                opcaoFicardePe(scan);
                break;
            case 2:
                opcaoFicarDeitado(scan);
                break;
            case 3:
                opcaoDialogar(scan);
                break;
            case 4:
                opcaoOfender(scan);
                break;

        }
    }
}
