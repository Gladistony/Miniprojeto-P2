import java.util.Scanner;

public class App extends GUse {
    
    public static void main(String[] args) throws Exception {
        //Criar variaveis basicas
        Scanner scan = new Scanner(System.in);
        int resposta;
        Capitulo1Pj1 Cap1 = new Capitulo1Pj1();
        //Criar os personagens
        Personagem pjPrincipal;
        Personagem pjSecundario;
        //Iniciar os personagens
        pjPrincipal = new Personagem();
        pjPrincipal.ObterNome(scan, "Digite o nome do seu personagem principal");
        pjSecundario = new Personagem();
        pjSecundario.ObterNome(scan, "Digite o nome do seu personagem secundario");
        //Iniciar o primeiro capitulo
        print("-------------------------------------------------");
        print("                 Capitulo 1");
        print("-------------------------------------------------");
        Cap1.main(scan, pjPrincipal);
        print("-------------------------------------------------");
        print("  Enquanto isso, em um outro universo paralelo");
        print("-------------------------------------------------");
        Cap1.main(scan, pjSecundario);
        //Mostra relatorio de cada personagem
        print("-------------------------------------------------");
        print("          Relatorio dos Personagens");
        print("-------------------------------------------------");
        pjPrincipal.showData();
        pjSecundario.showData();
        print("-------------------------------------------------");
        print("                 Capitulo 2");
        print("-------------------------------------------------");
        //Finalização/Opção de reiniciar o jogo
        print("Obrigado por jogar");
        String[] lista2 = {"Sim", "Nao"};
        resposta = escolhas(scan,"Deseja começar de novo?", lista2);
        if (resposta == 1) main(args);
        scan.close();
    }
}