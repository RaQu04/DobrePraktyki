package Excercise;

import java.util.*;

public class Test {

    private static Integer x;
    private static int y;

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();

        names.add("123");
        final List<String> names2 = names;

        names2.add("Test");

        names2.add("1");
        names2.add("2");
        names2.add("3");
        System.out.println(names2);

        for (String name :
                names2) {
            System.out.println(name);
        }
        String temat = Collections.max(names2);
        System.out.println(temat);

        Collections.sort(names2);

        System.out.println("Po sorcie");

        for (String name :
                names2) {
            System.out.println(name);
        }

        final Integer z = 10;


        System.out.println(x);

        System.out.println(x);

        System.out.println(z);
       zwikeszaj(z);

        System.out.println(z);
    }

    public static int zwikeszaj(int a){
        return a+a;
    }
}
