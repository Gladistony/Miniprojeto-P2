public class DuplaEscolha {
    String Nome;
    int Metodo;
    ComparadorEscolha Restricao;
    Boolean TemRestricao = false;
    public DuplaEscolha(String n, int m){
        Nome = n;
        Metodo = m;
        TemRestricao = false;
    }
    public DuplaEscolha(String n, int m, ComparadorEscolha r){
        Nome = n;
        Metodo = m;
        Restricao = r;
        TemRestricao = true;
    }
}