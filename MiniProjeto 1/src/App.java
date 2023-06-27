import java.util.Scanner;

public class App extends GUse {
    
    public static void main(String[] args) throws Exception {
        //Criar variaveis basicas
        Scanner scan = new Scanner(System.in);
        int resposta;
        //Criar os personagens
        Personagem pjPrincipal;
        Personagem npcJack;
        //Iniciar os personagens
        pjPrincipal = new Personagem();
        pjPrincipal.ObterNome(scan, "Digite o nome do seu personagem principal");
        npcJack = new Personagem();
        //Criar campanha
        GerenciadorCampanha.inicializar(scan);
        GerenciadorCampanha.criarCampanha1(pjPrincipal, npcJack);
        //Iniciar o primeiro capitulo
        printCentral("Arco 1: A torre");
        GerenciadorCampanha.run();
        pjPrincipal.showData();
        //Finalização/Opção de reiniciar o jogo
        print("Obrigado por jogar");
        String[] lista = {"Sim", "Nao"};
        resposta = escolhas(scan,"Deseja começar de novo?", lista);
        if (resposta == 1) main(args);
        scan.close();
    }
}