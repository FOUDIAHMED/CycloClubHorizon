package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.GeneralResult;

import java.util.List;

public interface GeneralResultServiceI {

    List<GeneralResult> findAll();



    void update(GeneralResult result);

    GeneralResult findById(Long id);

    void delete(GeneralResult result);

    void save(GeneralResult result);

    void delete(Long id);
}
