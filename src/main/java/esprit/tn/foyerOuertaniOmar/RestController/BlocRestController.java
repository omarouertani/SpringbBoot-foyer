package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;
import esprit.tn.foyerOuertaniOmar.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("getAllBlocs")
    public List<Bloc> getAll(){
        return iBlocService.findAllBlocs();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b ){
        return iBlocService.addBloc(b);
    }
    @GetMapping("getBlocById")
    public Bloc getById(@RequestParam long id){
        return iBlocService.findBlocById(id);
    }
    @PostMapping("addAllBlocs")
    public List<Bloc> addAllBlocs(@RequestBody  List <Bloc> blocs){
        return iBlocService.addAllBlocs(blocs);
    }
}
