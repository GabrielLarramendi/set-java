package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {



        //Set<String> set = new HashSet<>(); //HashSet é o mais rapido e a ordem nao importa
        //Set<String> set = new TreeSet<>(); //Ordena os dados

        Set<String> set = new LinkedHashSet<>(); //Ordem na posição em que os items foram adicionados;
        set.add("TV");
        set.add(("Notebook"));
        set.add("Tablet");

        //set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
