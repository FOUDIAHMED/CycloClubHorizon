package ahmed.foudi.service;

import ahmed.foudi.dao.CyclistDAO;
import ahmed.foudi.dao.ResultDAO;
import ahmed.foudi.dao.StageDAO;
import ahmed.foudi.dto.resultdto.ResultDTOResponse;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.entities.embeddable.CyclistStage;
import ahmed.foudi.mappers.ResultDTOMapper;
import ahmed.foudi.mappers.ResultDTOResponseMapper;
import ahmed.foudi.service.interfaces.ResultServiceI;
import jakarta.persistence.EntityNotFoundException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultService implements ResultServiceI {
    private final ResultDAO resultDAO;
    private final StageDAO stageDAO;
    private final CyclistDAO cyclistDAO;
    private final ResultDTOMapper resultDTOMapper;
    private final ResultDTOResponseMapper resultDTOResponseMapper;
    public ResultService(ResultDAO resultDAO, StageDAO stageDAO, CyclistDAO cyclistDAO, ResultDTOMapper resultDTOMapper, ResultDTOResponseMapper resultDTOResponseMapper) {
        this.resultDAO = resultDAO;
        this.stageDAO = stageDAO;
        this.cyclistDAO = cyclistDAO;
        this.resultDTOMapper = resultDTOMapper;
        this.resultDTOResponseMapper = resultDTOResponseMapper;
    }

    public int RankResult(Result resultOnCreation){
        List<Result> results = resultDAO.findResultsByStage(resultOnCreation.getStage());
        results.add(resultOnCreation);
        results.sort(Comparator.comparing(Result::getTime));
        int rank = 1;
        for (Result r : results){
            if (r.equals(resultOnCreation)){
                break;
            }
            rank ++ ;
        }
        return rank;
    }





    @Override
    public List<ResultDTOResponse> findAll() {
        List<Result> results = resultDAO.findAll();
        return results.stream()
                .map(resultDTOResponseMapper::entityToDto).collect(Collectors.toList());
    }


    @Override
    public Result findById(Long id) {
        return resultDAO.findOne(id);
    }

    public void update(Result cyclist) {
        resultDAO.update(cyclist);
    }

    @Override
    public void save(Result result) {
        Cyclist cyclist = cyclistDAO.findOne(result.getId().getCyclistId());
        Stage stage = stageDAO.findOne(result.getId().getStageId());

        if (cyclist == null || stage == null) {
            throw new EntityNotFoundException("Cyclist or Stage not found");
        }

        Result result2 = new Result();
        result2.setId(new CyclistStage(result.getId().getCyclistId(), result.getId().getStageId())); // Ensure this composite ID is set
        result2.setCyclist(cyclist);
        result2.setStage(stage);
        result2.setRank(RankResult(result));
        result2.setTime(result.getTime());

        resultDAO.create(result2);

    }



    public ResultDTOResponse getCyclistStageResult(Long stageId , Long cyclistId){
        CyclistStage id =new CyclistStage(stageId,cyclistId);
        Result result = resultDAO.findOne(id);
        return resultDTOResponseMapper.entityToDto(result);
    }




    @Override
    public void delete(Long stageId , Long cyclistId) {
        CyclistStage id =new CyclistStage(stageId,cyclistId);
        resultDAO.delete(id);

    }
}
