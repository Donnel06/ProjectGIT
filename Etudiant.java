public class Etudiant{
    int  id;
    String  nom;
    String  prenom;
    int matricule;
    /**
     * @param id
     * @param nom
     * @param prenom
     * @param matricule
     */
    public Etudiant(int id, String nom, String prenom, int matricule) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public int getMatricule() {
        return matricule;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

   }