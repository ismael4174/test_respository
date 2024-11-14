package ci.model;

public class Adresse implements Affichage {

    private String ville;
    private String codePostal;
    private String rue;

    public Adresse(String ville, String codePostal, String rue) {
        this.ville = ville;
        this.codePostal = codePostal;
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    };

    public void afficher() {
        System.out.println(
                        "Bonjour votre ville est : " + this.ville + " votre code postale " + this.codePostal + 
                        " vous êtes de la rue " + this.rue);
}

    @Override
    public void afficherv2() {
System.out.println("Bonjour , mon adresse ");        
    }

}
