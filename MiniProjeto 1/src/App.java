import java.util.Scanner;

public class App extends GUse {
    
    public static void main(String[] args) throws Exception {
        //Criar variaveis basicas
        Scanner scan = new Scanner(System.in);
        int resposta;
        //Criar os personagens
        Personagem pjPrincipal;
        Personagem npcJack;
        Personagem minotauro;
        //Iniciar os personagens
        pjPrincipal = new Personagem();
        pjPrincipal.ObterNome(scan, "Digite o nome do seu personagem principal");
        //----------------
        npcJack = new Personagem();
        npcJack.Nome = "Pessoa Encapuzada";
        npcJack.Drops = "Mapa do Labirinto";
        //----------------
        minotauro = new Personagem();
        minotauro.Nome = "Minotauro";
        minotauro.HPAtual = 300;
        minotauro.Dano = 25;
        minotauro.Drops = "Chifre de Minotauro";
        //Criar campanha
        GerenciadorCampanha.inicializar(scan);
        GerenciadorCampanha.criarCampanha1(pjPrincipal, npcJack);

        //Iniciar o primeiro arco
        printCentral("Arco 1: A torre");
        resposta = GerenciadorCampanha.run();
        //Processar resultados do primeiro arco
        if (resposta == 1) {
            pjPrincipal.receberDano(50);
        } else if (resposta == 3){
            pjPrincipal.addItem(npcJack.Drops);
        } else {
            pjPrincipal.receberDano(100);
        }
        pjPrincipal.VerificarGameOver();
        printCentral("Dados Atuais");
        pjPrincipal.showData();

        //Iniciar o Segundo Arco
        printCentral("Arco 2: A fulga");
        GerenciadorCampanha.criarCampanha2(pjPrincipal, minotauro);
        resposta = GerenciadorCampanha.run();
        //Processar resultados do segundo arco
        if (resposta == 1) {
            pjPrincipal.receberDano(80);
            if (pjPrincipal.vivo()) print("Voc\u00EA pula do local e recebe graves ferimentos, porem de alguma forma ainda estava vivo");
        } else if (resposta == 3){
            pjPrincipal.receberDano(60);
            if (pjPrincipal.vivo())  print("Voc\u00EA \u00E9 atacado pela criatura mais consegue sobreviver a ela fugindo da mesma");
        } else if (resposta == 4){
            pjPrincipal.receberDano(99999);
        } else {
            Batalha lutaLabirinto = new Batalha(pjPrincipal, minotauro, scan);
            lutaLabirinto.Run();
        }
        pjPrincipal.VerificarGameOver();
        printCentral("Dados Atuais");
        pjPrincipal.showData();

        //Finalização/Opção de reiniciar o jogo
        print("Obrigado por jogar");
        String[] lista = {"Sim", "Nao"};
        resposta = escolhas(scan,"Deseja começar de novo?", lista);
        if (resposta == 1) main(args);
        scan.close();
    }
}