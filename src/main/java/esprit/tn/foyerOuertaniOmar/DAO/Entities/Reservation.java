package esprit.tn.foyerOuertaniOmar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id

    @Column(name = "idReservation")
     long idReservation;
     Date anneeUniversitaire;
     boolean estVide;
    @ManyToMany(mappedBy = "resEt")
    Set<Etudiant> etudiant;
}
