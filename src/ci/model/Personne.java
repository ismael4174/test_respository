package ci.model;

public class Personne implements Affichage {
        private String nom;
        private String prenom;
        private int age;
        private double taille;
        private boolean hasJob;
        private Adresse adresse;

        public Personne(String n, String p) {
                this(n, p, 20, 1.75, true);
                System.out.println("Constructeur Personne avec 2 param");
        }

        public Personne(String nom, String prenom, int age, double taille, boolean hasJob) {
                System.out.println("Constructeur Personne avec 4 param");
                this.nom = nom;
                this.prenom = prenom;
                this.age = age;
                this.taille = taille;
                this.hasJob = hasJob;
        }

        public void afficher() {
                System.out.println(
                                "Bonjour " + this.nom + " " + this.prenom + " vous avez " + this.age
                                                + " ans et vous mesurez  "
                                                + this.taille + "m.");
                adresse.afficher();
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public double getTaille() {
                return taille;
        }

        public void setTaille(double taille) {
                this.taille = taille;
        }

        public boolean isHasJob() {
                return hasJob;
        }

        public void setHasJob(boolean hasJob) {
                this.hasJob = hasJob;
        }

        public String getSituation() {
                String situation = age < 25 ? "En emploi" : "Au chomage";
                return situation;
        }

        public String getSituation(boolean hasJob) {
                String situation = hasJob ? "En emploi" : "Au chomage";
                return situation;
        }

        @Override
        public String toString() {
                return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille
                                + ", hasJob=" + hasJob + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
                                + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", getTaille()="
                                + getTaille() + ", isHasJob()=" + isHasJob() + ", getSituation()=" + getSituation()
                                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
        }

        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((nom == null) ? 0 : nom.hashCode());
                result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
                return result;
        }

        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Personne other = (Personne) obj;
                if (nom == null) {
                        if (other.nom != null)
                                return false;
                } else if (!nom.equalsIgnoreCase(other.nom))
                        return false;
                if (prenom == null) {
                        if (other.prenom != null)
                                return false;
                } else if (!prenom.equalsIgnoreCase(other.prenom))
                        return false;
                return true;
        }

        public boolean equalsIgnoreCase(Personne p2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'equalsIgnoreCase'");
        }

        public Adresse getAdresse() {
                return adresse;
        }

        public void setAdresse(Adresse adresse) {
                this.adresse = adresse;
        }

        @Override
        public void afficherv2() {
               System.out.println("Mon nom : " + this.nom + " . Mon prénom : " + this.prenom);
                
        }

        

       

}