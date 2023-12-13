package esprit.tn.foyerOuertaniOmar.RestController;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Reservation;
import esprit.tn.foyerOuertaniOmar.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationRestController {
    IReservationService iReservationService;


    @GetMapping("getAllReservations")
    public List<Reservation> getAll(){
        return iReservationService.findAllReservations();
    }
    //Objet ou List --> @RequestBody
    // int , float ,String --> @RequestParam ou @PathVariable
    @PostMapping("addReservation")
    public Reservation addReservation(@RequestBody Reservation b ){
        return iReservationService.addReservation(b);
    }
    @GetMapping("getReservationById")
    public Reservation getById(@RequestParam String id){
        return iReservationService.findReservationById(id);
    }
    @PostMapping("addAllReservations")
    public List<Reservation> addAllReservations(@RequestBody  List <Reservation> Reservations){
        return iReservationService.addAllReservations(Reservations);
    }
}
