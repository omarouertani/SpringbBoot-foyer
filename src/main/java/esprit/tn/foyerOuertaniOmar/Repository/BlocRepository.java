package esprit.tn.foyerOuertaniOmar.Repository;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;
import esprit.tn.foyerOuertaniOmar.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository <Bloc , Long> {

    // 1- Recherche par nomBloc
    Bloc findByNomBloc(String nomBloc);

    // 2- Recherche par capaciteBloc
    Bloc findByCapaciteBloc(long capaciteBloc);

    // 3- Recherche par nomBloc et capaciteBloc
    Bloc findByNomBlocAndCapaciteBloc(String nomBloc, long capaciteBloc);

    // 4- Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocIgnoreCase(String nomBloc);

    // 5- Recherche par capaciteBloc supérieure à une valeur donnée
    List<Bloc> findByCapaciteBlocGreaterThan(long capaciteBloc);

    // 6- Recherche par nomBloc contenant une sous-chaîne
    List<Bloc> findByNomBlocContaining(String nomBloc);

    // 7- Tri par nomBloc par ordre alphabétique
    List<Bloc> findByOrderByNomBlocAsc();

    // 8- Recherche par nomBloc ou capaciteBloc
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc, long capaciteBloc);

    // 9- Recherche du bloc d'un foyer spécifique
    Bloc findByF(Foyer foyer);

    // 10- Recherche du bloc pour un foyer d'une université donnée
    Bloc findByFoyerUniversiteId(long universiteId);




    Bloc getByNomBloc (String nomBloc);

    // select * from bloc where nomBloc = ... and capaciteBloc=...
    Bloc findByNomBlocAndCapaciteBloc (String nomBloc , Long capaciteBloc);

    // select * from bloc where nomBloc = ... or capaciteBloc=...

    Bloc findByNomBlocOrCapaciteBloc (String nomBloc , Long capaciteBloc);

}