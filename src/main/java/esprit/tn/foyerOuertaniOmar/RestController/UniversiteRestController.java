package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Universite;
import esprit.tn.foyerOuertaniOmar.Services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("universite")
public class UniversiteRestController {
    IUniversiteService iUniversiteService;


    @GetMapping("getAllUniversites")
    public List<Universite> getAll(){
        return iUniversiteService.findAllUniversites();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite b ){
        return iUniversiteService.addUniversite(b);
    }
    @GetMapping("getUniversiteById")
    public Universite getById(@RequestParam long id){
        return iUniversiteService.findUniversiteById(id);
    }
    @PostMapping("addAllUniversites")
    public List<Universite> addAllUniversites(@RequestBody  List <Universite> Universites){
        return iUniversiteService.addAllUniversites(Universites);
    }
}
