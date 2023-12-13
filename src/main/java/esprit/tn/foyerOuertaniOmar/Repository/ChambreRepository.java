package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Chambre;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository <Chambre,Long> {

    // 1- Recherche par numéro de chambre
    Chambre findByNumeroChambre(String numeroChambre);

    // 2- Recherche par type de chambre
    List<Chambre> findByTypeChambre(TypeChambre typeChambre);

    // 3- Recherche des chambres par bloc
    List<Chambre> findByBloc(Bloc bloc);

    // 4- Recherche des chambres par bloc et type de chambre
    List<Chambre> findByBlocAndTypeChambre(Bloc bloc, TypeChambre typeChambre);

    // 5- Recherche des chambres par numéro de chambre et type de chambre
    Chambre findByNumeroChambreAndTypeChambre(String numeroChambre, TypeChambre typeChambre);

    // 6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation,
    List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneeAndReservationsEtudiantNomAndNumeroChambre(
            String nomUniversite, int annee, String nomEtudiant, String numeroChambre);



}
