import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Produit p1 = new Produit(1,"produit1",122);
        Produit p2 = new Produit(2, "produits2",11);
        Produit p3= new Produit(3, "produits3",133);

        produits.add(p1);
        produits.add(p2);
        produits.add(p3);

        produits.remove(1);
        produits.forEach(p -> System.out.println(p.toString()));
        Produit pp = produits.get(1);
        pp.setId(2);
        pp.setNom("prod");
        pp.setPrix(33);
        System.out.println("Les produits apres modif : ");
        produits.forEach(p -> System.out.println(p.toString()));
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom du produit à chercher : ");
        String name = sc.nextLine();
        boolean produitTrouver = false;
        for(Produit p : produits){
            if(p.nom.equals(name)){
                System.out.println("Le produit "+p.getNom()+" existe.\n Son prix : "+p.getPrix());
                produitTrouver=true;
                break;
            }

        }
        if (!produitTrouver){
            System.out.println("Le produit n'existe pas");
        }


    }
}
