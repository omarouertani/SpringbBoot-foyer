package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Reservation;
import esprit.tn.foyerOuertaniOmar.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation b) {
        return reservationRepository.save(b);
    }
    @Override
    public List<Reservation> addAllReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public Reservation updateReservation(Reservation b) {
        return reservationRepository.save(b);
    }

    @Override

    public List<Reservation> updateAllReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findReservationById(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteReservation(Reservation b) {
        reservationRepository.delete(b);
    }

    @Override
    public void deleteReservationById(String id) {
        reservationRepository.deleteById(id);
    }

}
