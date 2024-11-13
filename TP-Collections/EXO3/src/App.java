import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        HashSet<String> groupeA = new HashSet<>();
        HashSet<String> groupeB = new HashSet<>();

        groupeA.add("omar");
        groupeA.add("simo");
        groupeA.add("driss");

        groupeB.add("simo");
        groupeB.add("hi");
        groupeB.add("red");
        
        Set<String> intersection = groupeA.stream()
                .filter(groupeB :: contains)
                .collect(Collectors.toSet());

        System.out.println("L'intersection des deux groupes: " + intersection);
        Set<String> union = Stream.concat(groupeA.stream(),groupeB.stream())
                        .collect(Collectors.toSet());
        System.out.println("L'union des deux groupes: " + union);
    }
}
