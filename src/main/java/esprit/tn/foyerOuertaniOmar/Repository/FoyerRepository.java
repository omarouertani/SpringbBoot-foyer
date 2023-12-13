package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Foyer;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.TypeChambre;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    Foyer findByNomFoyer (String nom);

    // select * from FDoyer where capaciteFoyer > .....

    List <Foyer> findByCapaciteFoyerLessThan (int capacite);

    //select * from Foyer where capaciteFoyer < ... and capaciteFoyer > ...

    List<Foyer> findbyCapaciteFoyerBetween (int min , int max);

    //Afficher le foyer de l'universite dont son nom est pass" en paramétre.
    // select f from foyer Join Universite u ON <Condition de jointure> where <condition>

    Foyer findByUniversiteNomUniversite(String nom);

    // Afficher la liste des foyer qui comportent  des chambrs de meme
    // type que le type passé en parametre
    // foyer -- bloc -- chambre

List <Foyer> getByBlocsChambresChambre(TypeChambre typeChambre);


List <Foyer> findByBloc(Bloc bloc);

    List<Foyer> findByBlocsNomBloc(String nomBloc);

    // 2- Recherche du foyer par son idFoyer pour un bloc donné
    Foyer findByIdAndBlocsNomBloc(Long id, String nomBloc);

    // 3- Recherche des foyers d'un bloc ayant une capacité spécifique
    List<Foyer> findByBlocsNomBlocAndCapaciteFoyer(String nomBloc, long capaciteFoyer);

    // 4- Recherche du foyer d'un bloc spécifique dans une université donnée
    Foyer findByBlocsNomBlocAndUniversiteNomUniversite(String nomBloc, String nomUniversite);
}








