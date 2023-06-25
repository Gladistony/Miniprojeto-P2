import java.util.Scanner;

public class App extends GUse {
    
    public static void main(String[] args) throws Exception {
        //Criar variaveis basicas
        Scanner scan = new Scanner(System.in);
        int resposta;
        Capitulo1Pj1 Cap1 = new Capitulo1Pj1();
        Capitulo2 Cap2 = new Capitulo2();
        //Criar os personagens
        Personagem pjPrincipal;
        Personagem pjSecundario;
        //Iniciar os personagens
        pjPrincipal = new Personagem();
        pjPrincipal.ObterNome(scan, "Digite o nome do seu personagem principal");
        pjSecundario = new Personagem();
        pjSecundario.ObterNome(scan, "Digite o nome do seu personagem secundario");
        //Iniciar o primeiro capitulo
        printCentral("Capitulo 1");
        Cap1.main(scan, pjPrincipal);
        printCentral("Enquanto isso, em um outro universo paralelo");
        Cap1.main(scan, pjSecundario);
        //Mostra relatorio de cada personagem
        printCentral("Relatorio dos Personagens");
        pjPrincipal.showData();
        pjSecundario.showData();
        printCentral("Capitulo 2");
        if (pjPrincipal.vivo()) {
            Cap2.main(scan, pjPrincipal);
            if (pjSecundario.vivo()) printCentral("Enquanto isso, em um outro universo paralelo");
        }
        if (pjSecundario.vivo()) Cap2.main(scan, pjSecundario);
        printCentral("Relatorio dos Personagens");
        pjPrincipal.showData();
        pjSecundario.showData();
        //Finalização/Opção de reiniciar o jogo
        print("Obrigado por jogar");
        String[] lista2 = {"Sim", "Nao"};
        resposta = escolhas(scan,"Deseja começar de novo?", lista2);
        if (resposta == 1) main(args);
        scan.close();
    }
}