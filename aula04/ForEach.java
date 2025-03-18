package aula04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        for (Integer numero : lista){
            System.out.println(numero);
        }
        
    }
    
}
