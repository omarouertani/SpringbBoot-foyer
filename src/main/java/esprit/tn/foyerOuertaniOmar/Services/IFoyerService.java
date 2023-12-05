package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerService {


    Foyer addFoyer(Foyer b);

    List<Foyer> addAllFoyers(List<Foyer> foyers);


    Foyer updateFoyer(Foyer b);

    List<Foyer> updateAllFoyers(List<Foyer> foyers);


    List<Foyer> findAllFoyers();

    Foyer findFoyerById(long id);


    void deleteFoyer(Foyer b);

    void deleteFoyerById(long id);
}