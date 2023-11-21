package esprit.tn.foyerOuertaniOmar.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    Long idUniversite;
    String nomUniversite;
    String adress;

    @OneToOne
    Foyer foyer ;
}
