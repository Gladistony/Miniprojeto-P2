import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Capitulo extends GUse {
    Personagem Pjprincipal;
    Personagem Npc;
    Scanner Scan;
    int Tipo = 2; //Tipos: 1 Dialogo -> Escolhas 2 Dialogo -> Resultado
    private List<String> Dialogo;
    private List<DuplaEscolha> Escolhas;
    private int finalmente;

    public void AdicionarDialogo(String txt){
        Dialogo.add(txt);
    }
    public void AdicionarEscolha(String txt,int Metodo){
        Escolhas.add(new DuplaEscolha(txt, Metodo));
    }
    public void AdicionarFinal(int fim){
        finalmente = fim;
    }
    private void rundialog(){
        String temp;
        for (String s :Dialogo){
            temp = String.copyValueOf(s.toCharArray());
            if (temp.contains("NPC")) temp.replace("NPC", Npc.Nome);
            if (temp.contains("PLAYER")) temp.replace("PLAYER", Pjprincipal.Nome);
            print(temp);
        }
    }
    public int run(){
        rundialog();
        if (Tipo == 1){
            return finalmente;
        } else {
            ArrayList<String> Opcoes = new ArrayList<String>();
            for (DuplaEscolha S: Escolhas){
                Opcoes.add(S.Nome);
            }
            int resp = escolhar(Scan, Opcoes);
            return Escolhas.get(resp).Metodo;
        }
    }
    public Capitulo(){
        Dialogo = new ArrayList<String>();
        Escolhas = new ArrayList<DuplaEscolha>();
    }
}