public class Etudiant{
    int  id;
    String  nom;
    String  prenom;
    int adresse;
    /**
     * @param id
     * @param nom
     * @param prenom
     * @param adresse
     */
    public Etudiant(int id, String nom, String prenom, int adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adresse;
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
    public int getAdresse() {
        return adresse;
    }
    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

   }