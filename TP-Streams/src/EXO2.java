import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class EXO2 {
    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();
        Employe employe1 = new Employe("Ahmad","info",122);
        Employe employe2 = new Employe("Simo","Tech",100);
        Employe employe3 = new Employe("Driss","Phy",200);
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);

        Double som = employes.stream()
                .mapToDouble(Employe::getSalaire)
                .sum();

        System.out.println("La somme des salaires est "+som);

        List<Employe> employeSorted = employes.stream()
                .sorted(Comparator.comparing(Employe::getNom))
                .collect(Collectors.toList());
        employeSorted.forEach(System.out::println);

        Optional<Employe> e = employes.stream()
                .min(Comparator.comparing(Employe::getSalaire));
        System.out.println(e.stream().toList());

        double salaireDonne = 110;
        List<Employe> list1 = employes.stream()
                .filter(r -> r.salaire>salaireDonne)
                .collect(Collectors.toList());
        System.out.println(list1);

        Optional<Employe> e2 = employes.stream()
                .reduce((s1,s2)-> s1.salaire>s2.salaire ? s1:s2);
        System.out.println(e2.stream().toList());

        String concatNames = employes.stream()
                .map(Employe :: getNom)
                .reduce("",String::concat);
        System.out.println(concatNames);





    }
}
class Employe {
    String nom;
    String departement;
    double salaire;

    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}