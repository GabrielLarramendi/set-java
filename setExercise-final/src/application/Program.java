package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        String[] courses = {"A", "B", "C"};

        for (String s : courses) {
            System.out.print("How many students for course " + s + "? ");
            int numberOfStudents = sc.nextInt();
            for (int i = 0; i < numberOfStudents; i++) {
                switch (s) {
                    case "B":
                        b.add(sc.nextInt());
                        break;
                    case "C":
                        c.add(sc.nextInt());
                        break;
                    default:
                        a.add(sc.nextInt());
                }
            }
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total Students: " + total.size());

        sc.close();
    }
}
