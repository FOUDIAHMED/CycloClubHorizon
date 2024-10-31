package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.resultdto.ResultDTOResponse;
import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.embeddable.CyclistStage;

import java.util.List;

public interface ResultServiceI {
    List<ResultDTOResponse> findAll();



    void update(Result result);

    Result findById(Long id);


    void save(Result result);

    void delete(Long stageId , Long cyclistId);
}
