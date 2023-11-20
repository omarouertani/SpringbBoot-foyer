package esprit.tn.foyerOuertaniOmar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Table(name = "Bloc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")


     long idBloc;
    String nomBloc;
     long capaciteBloc;
     @ManyToOne
     Foyer foyer;
     @OneToMany(mappedBy = "bloc")
     Set<Chambre> chambres;



}
