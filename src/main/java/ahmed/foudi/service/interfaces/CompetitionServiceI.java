package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.competitiondto.CompetitionDTO;
import ahmed.foudi.dto.competitiondto.CompetitionDTOResponse;
import ahmed.foudi.entities.Competition;

import java.util.List;

public interface CompetitionServiceI {


    List<CompetitionDTOResponse> findAll();



    void update(Competition competition);

    CompetitionDTO findById(Long id);

    void delete(Competition competition);

    void save(Competition competition);

    void delete(Long id);
}
