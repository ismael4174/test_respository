import java.util.ArrayList;
import java.util.List;

import ci.model.Etudiant;
import ci.model.Personne;
import ci.model.Adresse;
import ci.model.Affichage;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Personne p1 = new Personne("Kouassi", "Ismael", 15, 1.75, true);

        // p1.nom = "Kouassi";
        // p1.prenom = "ismael";
        // p1.age = 15;
        // p1.taille = 1.75;
        // p1.hasJob = true;
        // String situation = (p1.hasJob) ? "En emploi" : "Au chomage";

        Personne p2 = new Personne("kouassi", "Ismael", 30, 1.92, false);

        // System.out.println("-------------------------------------");

        System.out.println("--------------------------------------");

        boolean isEtudiantEquals = p1.equals(p2);
        System.out.println(isEtudiantEquals);

        System.out.println("--------------------------------------");

        Adresse adresse = new Adresse("Abidjan", "00225", "Rueh61");

        adresse.afficher();
        System.out.println("-------------------------------------");

        Personne p3 = new Personne("Bamba", "Mohamed");

        p3.setAdresse(adresse);
        System.out.println("----------------------------------");
        p3.afficher();

        System.out.println("------------------------------");

        Affichage affichage = new Personne("Momo", "Mimi");
        affichage.afficherv2();

        // p2.nom = "Koffi";
        // p2.prenom = "Gbedet";
        // p2.age = 23;
        // p2.taille = 1.92;
        // p2.hasJob = false;
        // String situation2 = (p2.hasJob) ? "En emploi" : "Au chomage";
        // p1.setPrenom("Ouattara");
        // System.out.println(p1.getPrenom());
        // p1.afficher();
        // String situation = p1.getSituation(true);
        // System.out.println(situation);

        // Personne[] personnes = new Personne[2];

        // personnes[0] = p1;
        // personnes[1] = p2;
        // for (Personne person : personnes) {
        // person.afficher();
        // }

        // List<Personne> maliste = new ArrayList<>();
        // maliste.add(p1);
        // maliste.add(p2);
        // maliste.add(p3);

        // for (Personne var : maliste) {
        // var.afficher();
        // System.out.println(var);
        // }
        // System.out.println(
        // "Bonjour " + p1.nom + " " + p1.prenom + " vous avez " + p1.age + " ans et
        // vous mesurez "
        // + p1.taille + "m. Vous êtes actuellement " + situation);
        // System.out.println(
        // "Bonjour " + p2.nom + " " + p2.prenom + " vous avez " + p2.age + " ans et
        // vous mesurez "
        // + p2.taille + "m. Vous êtes actuellement " + situation2);
    }
}
