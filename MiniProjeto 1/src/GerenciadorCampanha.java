import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCampanha {
    private static List<Capitulo> Campanhas;
    private static Scanner scan;

    public static void inicializar(Scanner s){
        Campanhas = new ArrayList<Capitulo>();
        scan = s;
    }

    public static void criarCampanha2(Personagem Pjprincipal, Personagem npc){
        Campanhas.clear();
        //Adicionar Capitulo 0
        Capitulo tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("Depois de um tempo na sua sela so, PLAYER encontra uma chave em meio a palha e a usa para se soltar");
        tempcap.AdicionarDialogo("Seguindo pela unica porta voce da de cara com uma janela que te leva ate o lado de fora, voce pode pular essa");
        tempcap.AdicionarDialogo("janela e cair numa carroca de feno que ha no chao ou descer pela escada rumo ao labirinto");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Pular janela", -1);
        tempcap.AdicionarEscolha("Descer escadas", 1);
        Campanhas.add(tempcap);


        //Adicionar Capitulo 1
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        tempcap.AdicionarDialogo("PLAYER desce pelas escada e chega no labirinto");
        tempcap.AdicionarEscolha("Entra no Labirinto", 3);
        tempcap.AdicionarEscolha("Voltar", 0);
        ComparadorEscolha camparar1 = new ComparadorEscolha();
        camparar1.CompararItem(Pjprincipal, "Mapa do Labirinto");
        tempcap.AdicionarEscolhaRestrica("Usar o mapa", 2, camparar1);
        Campanhas.add(tempcap);

        //Adicionar Capitulo 2
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 1;
        tempcap.AdicionarDialogo("PLAYER apenas consegue deixa o labirinto em seguranca sem nenhum problema");
        tempcap.AdicionarFinal(-2);
        Campanhas.add(tempcap);

        //Adicionar Capitulo 3
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        tempcap.AdicionarDialogo("PLAYER caminha pelo labirinto ate que encontra um NPC");
        tempcap.AdicionarEscolha("Lutar", -5);
        tempcap.AdicionarEscolha("Fugir", -3);
        tempcap.AdicionarEscolha("Tentar Dialogar", -4);
        Campanhas.add(tempcap);

    }


    public static void criarCampanha1(Personagem Pjprincipal, Personagem npc){
        Campanhas.clear();
        //Adicionar Capitulo 0
        Capitulo tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("A vista de PLAYER está turva, e você está aparentemente deitado no chão, na sua boca um gosto amargo que você não reconhece.");
        tempcap.AdicionarDialogo("Suas mao estao presas a uma corrente, e a mesma aparentemente terminava numa parede de concreto. Feno estava espalhado");
        tempcap.AdicionarDialogo("pelo chao. A cerca de 10 metros de voce, uma pessoa com um capuz lhe observa.");
        tempcap.AdicionarDialogo("NPC: Vejo que você já acordou, vamos logo com isso, se apresse e se ponha de pé ...");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Ficar de pe", 1);
        tempcap.AdicionarEscolha("Continuar deitado", 3);
        tempcap.AdicionarEscolha("Dialogar", 4);
        tempcap.AdicionarEscolha("Ofender", 6);
        Campanhas.add(tempcap);

        //Criar capitulo 1
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("PLAYER junta forcas e se prepara para levanta, tentando ficar de pe na frente da pessoa");
        tempcap.AdicionarDialogo("NPC: Nzo vai falar nada? voce nao sabe falar?");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Claro que sei", 8);
        tempcap.AdicionarEscolha("Dar nos ombros", 8);
        tempcap.AdicionarEscolha("Palavras sem sentido", 2);
        Campanhas.add(tempcap);

        //Criar capitulo 2
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 1;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("NPC: ...");
        tempcap.AdicionarDialogo("A pessoa armada entao saca uma arma e aperta o gatilho, lhe acertando um unico tiro na perna");
        tempcap.AdicionarDialogo("NPC: Voce nao vale o meu tempo, te deixarei aqui para aprodecer ...");
        tempcap.AdicionarDialogo("A pessoa entao da as costas e lhe deixa la no local, sangrando");
        //Adicionar escolhas
        tempcap.AdicionarFinal(-1);
        Campanhas.add(tempcap);

        //Criar capitulo 3
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("PLAYER resolve ignorar o comando da pessoa e fica ali mesmo deitado");
        tempcap.AdicionarDialogo("A pessoa arqueia uma das sobrancelhas, e entao revela uma arma de fogo por dentro do capuz");
        tempcap.AdicionarDialogo("NPC: Sua ultima chance!");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Continuar deitado", 7);
        tempcap.AdicionarEscolha("Pedir Desculpa", 4);
        tempcap.AdicionarEscolha("Apenas se levantar", 1);
        Campanhas.add(tempcap);

        //Criar capitulo 4
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("PLAYER se poe de pe e entao comeca a conversar com a pessoa");
        tempcap.AdicionarDialogo("NPC: Me mandaram aqui lhe soltar, mas ... voce nao parece tao importante assim");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Me solta logo", 8);
        tempcap.AdicionarEscolha("Seu trabalho", 5);
        tempcap.AdicionarEscolha("Porque esta enrrolando pra me soltar?", 8);
        Campanhas.add(tempcap);

        //Criar capitulo 5
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 1;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("NPC: Nao to muito afim de fazer isso");
        tempcap.AdicionarDialogo("A pessoa armada entao saca uma arma e aperta o gatilho, lhe acertando um unico tiro na perna");
        tempcap.AdicionarDialogo("NPC: Voce nao vale o meu tempo, te deixarei aqui para aprodecer ...");
        tempcap.AdicionarDialogo("A pessoa entao da as costas e lhe deixa la no local, sangrando");
        //Adicionar escolhas
        tempcap.AdicionarFinal(-1);
        Campanhas.add(tempcap);

        //Criar capitulo 6
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 2;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("PLAYER simplesmente se levanta e manda a pessoa se 'F@d&r'");
        tempcap.AdicionarDialogo("A pessoa retira o capuz devagar e entao sem falar muito saca uma pistola e aponta para voce");
        tempcap.AdicionarDialogo("NPC: O que voce falou?");
        //Adicionar escolhas
        tempcap.AdicionarEscolha("Reafirma", 8);
        tempcap.AdicionarEscolha("Pedir Desculpa", 7);
        Campanhas.add(tempcap);

        //Criar capitulo 7
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 1;
        //Adicionar dialogos
        tempcap.AdicionarDialogo("NPC: Vejo que voce e so um covarde.");
        tempcap.AdicionarDialogo("A pessoa armada entao aperta o gatilho 3 vezes, lhe acertando com varios disparos");
        //Adicionar escolhas
        tempcap.AdicionarFinal(-2);
        Campanhas.add(tempcap);

        //Criar capitulo 8
        tempcap = new Capitulo();
        tempcap.Pjprincipal = Pjprincipal;
        tempcap.Npc = npc;
        tempcap.Scan = scan;
        tempcap.Tipo = 1;
        tempcap.AdicionarDialogo("NPC: Haha, vejo que voce nao tem medo.");
        tempcap.AdicionarDialogo("NPC: Vou te dar uma chance de sobreviver");
        tempcap.AdicionarDialogo("Ele entao joga no chao proximo a voce um mapa");
        tempcap.AdicionarDialogo("NPC: Siga isso e conseguirar sair do labirinto com facilidade");
        tempcap.AdicionarDialogo("Ele se cobre novamente com o capuz e desaparece em nevoa, deixando voce no local so");
        //Adicionar escolhas
        tempcap.AdicionarFinal(-3);
        Campanhas.add(tempcap);

    }
    public static int run(){
        int resposta = 0;
        while (resposta >= 0){
            resposta = Campanhas.get(resposta).run();
        }
        return -resposta;
    }
    
}
