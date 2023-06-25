import java.util.Scanner;

public class Capitulo2 extends GUse{
    Personagem Pjprincipal;

    public void entroulabrinto(Scanner scan){
        print("Você caminha pelo labirinto até que encontra um Minotauro");
        String[] lista = {"Lutar","Fugir","Tentar Dialogar"};
        int resposta = escolhas(scan,"O que você deseja fazer?", lista);
        if (resposta == 1){
            lutar(scan);
        } else if (resposta == 2) {
            Pjprincipal.receberDano(60);
            if (Pjprincipal.vivo()) {
                print("Você é atacado pela criatura mais consegue sobreviver a ela fugindo da mesma");
            } else {
                print("Seus ferimentos previos debilitam sua mobilidade, o monstro lhe pega e você acaba por morrer");
            }
        } else {
            Pjprincipal.receberDano(999999);
            print("Enquanto você tentava conversa o monstro lhe ataca e você morre");
        }
    }

    public void lutar(Scanner scan){
        int hpinimigo = 250;
        int cont = 1;
        int atkinimgo = 0;
        String[] lista = {"Atacar","Esquivar","Defender"};
        while (hpinimigo > 0 && Pjprincipal.vivo()){
            instaprint("Rodada "+cont);
            instaprint(Pjprincipal.Nome + " HP: "+Pjprincipal.HPAtual);
            instaprint("Minotauro: "+" HP: "+hpinimigo);
            atkinimgo = (int) Math.random()*3 +1;
            int resposta = escolhas(scan,"O inimigo avança contra você:", lista);
            if (resposta == 1){
                if (atkinimgo == 1){
                    instaprint("Vocês trocam socos e ambos recebem dano");
                    Pjprincipal.receberDano(20);
                    hpinimigo -= 20;
                } else if (atkinimgo == 2) {
                    instaprint("O inimigo evita o golpe e contra ataca causando grandes danos");
                    Pjprincipal.receberDano(50);
                } else {
                    instaprint("Você ataca e o inimigo bloqueia totalmente o dano");
                }
            } else if (resposta == 2){
                if (atkinimgo == 1){
                    instaprint("O inimigo tenta lhe ataca mas você esquiva e contra ataca, dando muito dano nele");
                    hpinimigo -= 50;
                } else if (atkinimgo == 2) {
                    instaprint("Ambos não se movem, não acontecendo nada");
                } else {
                    instaprint("Você tenta esquiva mas o inimigo que estava numa posição de defesa aproveita para lhe acerta um dano");
                    Pjprincipal.receberDano(10);
                }
            } else {
                if (atkinimgo == 1){
                    instaprint("Você bloqueia o dano do inimigo");
                } else if (atkinimgo == 2) {
                    instaprint("O inimigo tenta esquivar mas você contra ataca ele ja que estava pronto");
                    hpinimigo -= 50;
                } else {
                    instaprint("Ambos apenas ficam se olhando sem acontecer nada");
                }
            }
        }
        if (Pjprincipal.HPAtual < 0){
            print("Você é derrotado pelo oponente e acaba morrendo nesse local");
        } else {
            print("Contra todas as possibilidades você ganha do inimigo e deixa o labirinto levando um trofeu");
            Pjprincipal.addItem("Chifre de Minotauro");
        }
    }

    public void main(Scanner scan, Personagem pj){
        Pjprincipal = pj;

        print("Depois de um tempo na sua sela só, você encontra uma chave em meio a palha e a usa para se soltar");
        print("Seguindo pela unica porta você da de cara com uma janela que te leva até o lado de fora, você pode pular essa");
        print("janela e cair numa carroça de feno que há no chão ou descer pela escada rumo ao labirinto");
        String[] lista = {"Pular janela","Descer escadas"};
        int resposta = escolhas(scan,"O que você deseja fazer?", lista);
        if (resposta == 1){
            Pjprincipal.receberDano(80);
            if (Pjprincipal.vivo()) {
                print("Você pula do local e recebe graves ferimentos, porem de alguma forma ainda estava vivo");
            } else {
                print("Você despenca e cai no chão se espatifando e tendo uma morte tragica");
            }
        } else {
            print("Você desce pelas escada e chega no labirinto");
            if (Pjprincipal.Bag.temoItem("Mapa do Labirinto")){
                print("O mapa que você tinha lhe mostra uma rota segura:");
                String[] lista2 = {"Ir pelo caminho seguro", "Entra no labirinto"};
                resposta = escolhas(scan,"O que você deseja fazer?", lista2);
                if (resposta ==1){
                    print("Você apenas consegue deixa o labirinto em segurança sem nenhum problema");
                } else {
                    entroulabrinto(scan);
                }
            } else {
                entroulabrinto(scan);
            }
        }
    }
}
