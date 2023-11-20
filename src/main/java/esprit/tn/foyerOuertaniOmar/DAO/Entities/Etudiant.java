package esprit.tn.foyerOuertaniOmar.DAO.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Etudiant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
     long idFoyer;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     Date dateNaissance;
     @ManyToMany
     Set <Reservation> resEt;
}
