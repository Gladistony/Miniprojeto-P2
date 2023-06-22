import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<String> List;


    public String listar(){
        String ret = "";
        for (String s :List){
            ret = ret +"#" +  s;
        }
        return ret;
    }
    public void Add(String item){
        List.add(item);
    }
    public Inventario(){
        List = new ArrayList<String>();
    }
}
