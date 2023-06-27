import java.util.Random;
import java.util.Scanner;

public class Batalha extends GUse {
    Personagem Jogador;
    Personagem Inimigo;
    Scanner scan;

    public Batalha(Personagem J, Personagem I, Scanner s){
        Jogador = J;
        Inimigo = I;
        scan = s;
    }
    public void Run(){
        int cont = 0;
        int atkinimgo = 0;
        int resposta;
        String[] lista = {"Atacar","Esquivar","Defender"};
        Random rng = new Random(System.currentTimeMillis());
        while (Jogador.vivo() && Inimigo.vivo()){
            cont += 1;
            instaprint("Rodada "+cont);
            Jogador.showData();
            Inimigo.showData();
            atkinimgo = rng.nextInt(3) + 1;
            resposta = escolhas(scan,"O inimigo avança contra você:", lista);
            if (resposta == 1){
                if (atkinimgo == 1){
                    instaprint("Vocês trocam socos e ambos recebem dano");
                    Jogador.receberDano(Inimigo.Dano);
                    Inimigo.receberDano(Jogador.Dano);
                } else if (atkinimgo == 2) {
                    instaprint("O inimigo evita o golpe e contra ataca causando grandes danos");
                    Jogador.receberDano(Inimigo.Dano*2);
                } else {
                    instaprint("Você ataca e o inimigo bloqueia totalmente o dano");
                }
            } else if (resposta == 2){
                if (atkinimgo == 1){
                    instaprint("O inimigo tenta lhe ataca mas você esquiva e contra ataca, dando muito dano nele");
                    Inimigo.receberDano(Jogador.Dano*2);
                } else if (atkinimgo == 2) {
                    instaprint("Ambos não se movem, não acontecendo nada");
                } else {
                    instaprint("Você tenta esquiva mas o inimigo que estava numa posição de defesa aproveita para lhe acerta um dano");
                    Jogador.receberDano(Inimigo.Dano);
                }
            } else {
                if (atkinimgo == 1){
                    instaprint("Você bloqueia o dano do inimigo");
                } else if (atkinimgo == 2) {
                    instaprint("O inimigo tenta esquivar mas você contra ataca ele ja que estava pronto");
                    Inimigo.receberDano(Jogador.Dano);
                } else {
                    instaprint("Ambos se atacam causando danos equivalentes");
                    Jogador.receberDano(10);
                    Inimigo.receberDano(10);
                }
            }
        }
        printCentral("Resultado do combate:");
        if (Jogador.vivo() && !Inimigo.vivo()){
            print("Vitoria !!");
            print("Drop: "+Inimigo.Drops);
            Jogador.Bag.Add(Inimigo.Drops);
        } else if (!Jogador.vivo() && Inimigo.vivo()){
            print("Derrota!!");
        } else {
            print("Empate!!");
        }
    }
}
