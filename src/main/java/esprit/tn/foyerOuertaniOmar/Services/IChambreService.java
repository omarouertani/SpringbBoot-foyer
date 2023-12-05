package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre b);
    List<Chambre> addAllChambres(List<Chambre> Chambres);
    Chambre updateChambre(Chambre b);
    List<Chambre> updateAllChambres(List<Chambre> Chambres);
    List<Chambre> findAllChambres();
    Chambre findChambreById(long id);
    void deleteChambre(Chambre b);
    void deleteChambreById(long id);
}