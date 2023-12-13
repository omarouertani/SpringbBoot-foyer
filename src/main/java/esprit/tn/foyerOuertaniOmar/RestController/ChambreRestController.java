package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Chambre;
import esprit.tn.foyerOuertaniOmar.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")
public class ChambreRestController {
    IChambreService iChambreService;


    @GetMapping("getAllChambres")
    public List<Chambre> getAll(){
        return iChambreService.findAllChambres();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre b ){
        return iChambreService.addChambre(b);
    }
    @GetMapping("getChambreById")
    public Chambre getById(@RequestParam long id){
        return iChambreService.findChambreById(id);
    }
    @PostMapping("addAllChambres")
    public List<Chambre> addAllChambres(@RequestBody  List <Chambre> Chambres){
        return iChambreService.addAllChambres(Chambres);
    }


}