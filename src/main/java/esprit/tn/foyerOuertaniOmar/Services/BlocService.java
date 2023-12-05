package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;
import esprit.tn.foyerOuertaniOmar.Repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //definir que c'est un bean Spring
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService{
    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {

        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> updateAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        //optional<Bloc> : Retour de Null
        //Resoudre le proble : .get() ou OrElse(......)
        // .get() ---> Retourne un resultat si elle trouve une ligne avec l id passe
        //         ---> Retiurne une objet vide acev l exception "no value present
        //.OrElse --> Retourne un resultat si elle a trouve une ligne avec l id passer en parametre
        //        -->.OrElse(definir l objet retourne au cas ou la base de donne ne retourne pas une ligne avec l id passe)

        //return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).nomBloc("Bloc bizzare").build());
    }

    @Override
    public void deleteBloc(Bloc b) {
        blocRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
