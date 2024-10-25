package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.Competition;

import java.util.List;

public interface CompetitionServiceI {


    List<Competition> findAll();



    void update(Competition competition);

    Competition findById(Long id);

    void delete(Competition competition);

    void save(Competition competition);

    void delete(Long id);
}
