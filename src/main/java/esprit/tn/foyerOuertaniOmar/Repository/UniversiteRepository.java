package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository <Reservation,Long> {

}
