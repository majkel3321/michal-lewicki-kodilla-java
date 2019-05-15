package Rozmowa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        generate(list, 10, 10);
        generate(linkedList, 20, 20);


        System.out.println(list);
        System.out.println(linkedList);

        System.out.println(suma(list));
        System.out.println(suma(linkedList));


    }

    public static int suma(List<Integer> list) {

        int sum = 0;

        for (Integer temp : list) {
            sum += temp;
        }

        return sum;
    }

    public static void generate(List<Integer> list, int max, int quantity) {

        Random random = new Random();
        for (int i = 1; i <= quantity; i++) {
            list.add(random.nextInt(max) + 1);
        }
    }

}

abstract class Test {

    public abstract void test1();


}
