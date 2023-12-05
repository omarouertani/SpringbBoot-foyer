package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant b);

    List<Etudiant> addAllEtudiants(List<Etudiant> etudiants);

    Etudiant updateEtudiant(Etudiant b);

    List<Etudiant> updateAllEtudiants(List<Etudiant> etudiants);

    List<Etudiant> findAllEtudiants();

    Etudiant findEtudiantById(long id);

    void deleteEtudiant(Etudiant b);

    void deleteEtudiantById(long id);
}