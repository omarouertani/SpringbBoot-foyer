package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    // 1- Recherche des réservations validées
    List<Reservation> findByEstVide(Boolean estVide);

    // 2- Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantId(String idEtudiant);

    // 3- Recherche des réservations par année et validité
    List<Reservation> findByAnneeUniversitaireAndEstVide(Date anneeUniversitaire, Boolean estVide);
}
