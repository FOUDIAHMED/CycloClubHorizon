package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.Result;

import java.util.List;

public interface ResultServiceI {
    List<Result> findAll();



    void update(Result result);

    Result findById(Long id);

    void delete(Result result);

    void save(Result result);

    void delete(Long id);
}
