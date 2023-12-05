package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Chambre;
import esprit.tn.foyerOuertaniOmar.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    public Chambre addChambre(Chambre b) {

        return chambreRepository.save(b);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre b) {
        return chambreRepository.save(b);
    }

    @Override
    public List<Chambre> updateAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(Chambre b) {
        chambreRepository.delete(b);
    }

    @Override
    public void deleteChambreById(long id) {
        chambreRepository.deleteById(id);
    }
}