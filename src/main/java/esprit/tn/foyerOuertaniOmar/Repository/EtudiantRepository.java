package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
