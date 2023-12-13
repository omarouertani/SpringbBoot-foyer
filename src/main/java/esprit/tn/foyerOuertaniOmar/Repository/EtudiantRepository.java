package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;
import org.springdoc.core.converters.models.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

    //select * from Etudiant where cin=...

    Etudiant findByCin (long cin);

    //select * from Etudiant where nomEt like ....

    // 3 méthodes
    List<Etudiant> findByNomEtlike (String nom);
    List<Etudiant> findByNomEtContains (String nom);
    List<Etudiant> findByNomEtContaining (String nom);
    Etudiant findByNomAndPrenom(String nom, String prenom);

    Etudiant findByCinAndNomE(long cin, String nomE);

    List<Etudiant> findByNaissanceAfter(LocalDate date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservations_Id(Long reservationId);

    List<Etudiant> findByReservations_Annee(int annee);

    List<Etudiant> findByEcoleAndNaissanceAfter(String ecole, LocalDate date);

    List<Etudiant> findByReservations_AnneeOrderByNaissance(int annee);

}

