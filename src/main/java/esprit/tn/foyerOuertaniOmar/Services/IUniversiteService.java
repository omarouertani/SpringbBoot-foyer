package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite b);


    List<Universite> addAllUniversites(List<Universite> universites);

    Universite updateUniversite(Universite b);

    List<Universite> updateAllUniversites(List<Universite> universites);

    List<Universite> findAllUniversites();

    Universite findUniversiteById(long id);

    void deleteUniversite(Universite b);

    void deleteUniversiteById(long id);
}