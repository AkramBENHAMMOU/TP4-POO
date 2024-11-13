import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EXO2 {

    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        double som = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Entrer la note de l'etudiant "+(i+1));
           double note =  sc.nextDouble();
            map.put("etudiant_"+(i+1),note);
            som+=note;


        }
        map.keySet().forEach(k->System.out.println(k +" --> "+map.get(k)));
        System.out.println("Le nombre des étudiant est  :"+map.size());
        System.out.println("La note max est : "+ Collections.max(map.values()));
        System.out.println("La note min est : "+ Collections.min(map.values()));
        System.out.println("La moyenne est : "+ som/map.size());
       boolean verif = map.values().stream().anyMatch(note -> note==20);
       if(verif){
           System.out.println("20 existe");
       }
       else {
           System.out.println("20 n'existe pas");
       }




    }
}
