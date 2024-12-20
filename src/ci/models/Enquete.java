package ci.models;

public class Enquete {
    private int id;
    private String titre;
    private String description;
    private TypeEnquete typeEnquete;

    public Enquete(int id, String titre, String description, TypeEnquete typeEnquete) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.typeEnquete = typeEnquete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeEnquete getTypeEnquete() {
        return typeEnquete;
    }

    public void setTypeEnquete(TypeEnquete typeEnquete) {
        this.typeEnquete = typeEnquete;
    }

    public void afficherv2() {
        System.out.println("id=" + id + ", titre=" + titre + ", description=" + description);
    }

    public void afficherv3() {
        System.out.println("id=" + id + ", titre=" + titre + ", description=" + description +
                ", typeEnquete=" + typeEnquete.getLibelle());
    }
    
}
