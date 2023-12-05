package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;
import esprit.tn.foyerOuertaniOmar.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public List<Etudiant> addAllEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public List<Etudiant> updateAllEtudiants(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findEtudiantById(long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public void deleteEtudiant(Etudiant b) {
        etudiantRepository.delete(b);
    }

    @Override
    public void deleteEtudiantById(long id) {
        etudiantRepository.deleteById(id);
    }
}