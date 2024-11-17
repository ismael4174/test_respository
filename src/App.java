import ci.models.TypeEnquete;
import ci.models.Enquete;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        TypeEnquete t1 = new TypeEnquete(1, "Info", "Informatique");
        TypeEnquete t2 = new TypeEnquete(2, "Edu", "Education");

        t1.afficher();
        t2.afficher();
        System.out.println("------------------------------------------------------------");
        Enquete e1 = new Enquete(10, "Enquête sur le matériel informatique", "Analyse sur l etat du matériel", t1);
        Enquete e2 = new Enquete(11, "Enquête le niveau d éducation", "Étude du QI", t2);

        e1.afficherv2();
        e2.afficherv2();
        System.out.println("------------------------------------------------------------");

        Enquete[] enquetes = { e1, e2 };
        for (Enquete enquete : enquetes) {
            enquete.afficherv3();
        }

    }
}
