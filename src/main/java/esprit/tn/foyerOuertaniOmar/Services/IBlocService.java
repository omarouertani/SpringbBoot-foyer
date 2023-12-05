package esprit.tn.foyerOuertaniOmar.Services;

import esprit.tn.foyerOuertaniOmar.DAO.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> updateAllBlocs(List<Bloc> blocs);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);
}