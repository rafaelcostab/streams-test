import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 0);
        int total = 1000000;
        Long timeInit = 0L;
        Long timeNormal = 0L;
        Long timeStream = 0L;

        for (int i = 0; i < total; i++) {
            list.add(i);
        }

        timeInit = System.currentTimeMillis();
        for(Integer n: list) {
            System.out.println(n);
        }
        timeNormal = System.currentTimeMillis() - timeInit;

        timeInit = System.currentTimeMillis();
        list.forEach(System.out::println);
        timeStream = System.currentTimeMillis() - timeInit;

        System.out.println("\n##Estatisticas##");
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("Implementação tradicional: " + timeNormal + "ms");
        System.out.println("Implementação com expressões lambda e StreamAPI:" + timeStream + "ms");
    }
}
