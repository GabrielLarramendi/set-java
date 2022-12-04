package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //Union
        Set<Integer> unionSet = new TreeSet<>(a);
        unionSet.addAll(b);
        System.out.println(unionSet);

        //Intersection
        Set<Integer> intersectionSet = new TreeSet<>(a);
        intersectionSet.retainAll(b);
        System.out.println(intersectionSet);

        //Difference
        Set<Integer> differenceSet = new TreeSet<>(a);
        differenceSet.removeAll(b);
        System.out.println(differenceSet);
    }
}
