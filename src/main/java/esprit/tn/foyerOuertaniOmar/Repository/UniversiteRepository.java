package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Reservation;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversiteRepository extends JpaRepository <Universite,Long> {



}
