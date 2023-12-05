package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Etudiant;
import esprit.tn.foyerOuertaniOmar.Services.IEtudiantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class EtudiantRestController {
    IEtudiantService iEtudiantService;


    @GetMapping("getAllEtudiants")
    public List<Etudiant> getAll(){
        return iEtudiantService.findAllEtudiants();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant b ){
        return iEtudiantService.addEtudiant(b);
    }
    @GetMapping("getEtudiantById")
    public Etudiant getById(@RequestParam long id){
        return iEtudiantService.findEtudiantById(id);
    }
    @PostMapping("addAllEtudiants")
    public List<Etudiant> addAllEtudiants(@RequestBody  List <Etudiant> Etudiants){
        return iEtudiantService.addAllEtudiants(Etudiants);
    }
}