package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.resultdto.ResultDTOResponse;
import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.embeddable.CyclistStage;

import java.util.List;

public interface ResultServiceI {
    List<Result> findAll();



    void update(Result result);

    Result findById(Long cyclistId,Long stageId);


    void save(Result result);

    void delete(Long stageId , Long cyclistId);
}
