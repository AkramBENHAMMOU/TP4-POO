import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class EXO1 {
    public static void main(String[] args) {
        List<String> listeChaine = new ArrayList<>();
        listeChaine.add("akram");
        listeChaine.add("dri");
        listeChaine.add("aymen");
        List<String> list = listeChaine.stream()
                .filter(s -> s.contains("a"))
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        List<String> list2 = listeChaine.stream()
                .filter(l -> l.length()>3)
                .map(l->new StringBuffer(l).reverse().toString())
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        List<Character> list3 =  listeChaine.stream()
                .filter(l->l.contains("e"))
                .flatMap(l-> l.chars().mapToObj(c->(char)c))
                .collect(Collectors.toList());
        System.out.println(list3);

        List<String> list4 = listeChaine.stream()
                .map(m->m.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list4);

        List<Integer> list5 = listeChaine.stream()
                .map(m->m.length())
                .collect(Collectors.toList());
        System.out.println(list5);

        List<Character> list6 = listeChaine.stream()
                .flatMap(m -> m.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println(list6);

        List<String> list7 = IntStream.range(0,listeChaine.size())
                .mapToObj(p->listeChaine.get(p)+"-"+p)
                .collect(Collectors.toList());
        System.out.println(list7);

    }

}
