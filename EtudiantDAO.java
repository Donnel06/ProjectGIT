
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    private Connection connection;
    
    // Constructeur
    public EtudiantDAO(Connection connection) {
        this.connection = connection;
    }
    
    // Méthode pour ajouter un étudiant
    public void addEtudiant(Etudiant etudiant) throws SQLException {
        String query = "INSERT INTO etudiant (id, nom, prenom, adresse) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, etudiant.getId());
        statement.setString(2, etudiant.getNom());
        statement.setString(3, etudiant.getPrenom());
        statement.setString(4, etudiant.getAdresse());
        statement.executeUpdate();
    }
    
    // Méthode pour récupérer tous les étudiants
    public List<Etudiant> getAllEtudiants() throws SQLException {
        List<Etudiant> etudiants = new ArrayList<>();
        String query = "SELECT * FROM etudiant";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Etudiant etudiant = new Etudiant(
                resultSet.getInt("id"),
                resultSet.getString("nom"),
                resultSet.getString("prenom"),
                resultSet.getString("adresse")
            );
            etudiants.add(etudiant);
        }
        return etudiants;
    }
    
    // Méthode pour récupérer un étudiant par son ID
    public Etudiant getEtudiantById(int id) throws SQLException {
        String query = "SELECT * FROM etudiant WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Etudiant etudiant = new Etudiant(
                resultSet.getInt("id"),
                resultSet.getString("nom"),
                resultSet.getString("prenom"),
                resultSet.getString("adresse")
            );
            return etudiant;
        }
        return null;
    }
    
    // Méthode pour supprimer un étudiant par son ID
    public void deleteEtudiant(int id) throws SQLException {
        String query = "DELETE FROM etudiant WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
}
Dans ce projet, la classe "Etudiant" représente l'objet que nous voul




