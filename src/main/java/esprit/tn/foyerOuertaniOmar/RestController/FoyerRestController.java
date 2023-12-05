package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Foyer;
import esprit.tn.foyerOuertaniOmar.Services.IFoyerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class FoyerRestController {
    IFoyerService iFoyerService;


    @GetMapping("getAllFoyers")
    public List<Foyer> getAll(){
        return iFoyerService.findAllFoyers();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer b ){
        return iFoyerService.addFoyer(b);
    }
    @GetMapping("getFoyerById")
    public Foyer getById(@RequestParam long id){
        return iFoyerService.findFoyerById(id);
    }
    @PostMapping("addAllFoyers")
    public List<Foyer> addAllFoyers(@RequestBody  List <Foyer> Foyers){
        return iFoyerService.addAllFoyers(Foyers);
    }
}
