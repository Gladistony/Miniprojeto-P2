public class ComparadorEscolha {
    private Personagem pj;
    private String item;
    private int Tipo;

    private Boolean itemBag(){
        return pj.Bag.temoItem(item);
    }

    public void CompararItem(Personagem p, String i){
        Tipo = 1;
        pj = p;
        item = i;
    }

    public Boolean Run(){
        if (Tipo == 1) return itemBag();
        return false;
    }
}
