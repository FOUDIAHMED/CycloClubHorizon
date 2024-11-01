package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.generalresultdto.GeneraResultDTO;
import ahmed.foudi.entities.GeneralResult;

import java.util.List;

public interface GeneralResultServiceI {

    List<GeneraResultDTO> findAll();

    GeneraResultDTO findById(Long cyclistId,Long competitionId);

    void save(GeneralResult result);

    void delete(Long cyclistId,Long competitionId);
}
