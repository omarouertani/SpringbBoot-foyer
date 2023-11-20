package esprit.tn.foyerOuertaniOmar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Table(name="Chambre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
     long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre chambre;
    @ManyToOne
    Bloc bloc;
    @OneToMany
    Set<Reservation> reservation ;
}
