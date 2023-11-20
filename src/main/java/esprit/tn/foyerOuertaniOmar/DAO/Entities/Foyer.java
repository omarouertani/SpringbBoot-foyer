package esprit.tn.foyerOuertaniOmar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Table(name = "Foyer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
     long idFoyer;
     String nomFoyer;
     long capaciteFoyer;
    @OneToOne (mappedBy = "foyer")
    Universite univ ;

    @OneToMany(mappedBy = "foyer")
    Set <Bloc> bloc ;

}
