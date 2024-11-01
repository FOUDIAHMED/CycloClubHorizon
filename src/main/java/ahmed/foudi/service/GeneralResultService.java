package ahmed.foudi.service;

import ahmed.foudi.dao.GeneralResultDAO;
import ahmed.foudi.dto.generalresultdto.GeneraResultDTO;
import ahmed.foudi.entities.Competition;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.GeneralResult;
import ahmed.foudi.entities.embeddable.GeneralResultKey;
import ahmed.foudi.mappers.GeneralResultDTOMapper;
import ahmed.foudi.service.interfaces.GeneralResultServiceI;

import java.util.List;
import java.util.stream.Collectors;

public class GeneralResultService implements GeneralResultServiceI {
    private final GeneralResultDAO generalResultDAO;
    private final GeneralResultDTOMapper generalResultDTOMapper;
    public GeneralResultService(GeneralResultDAO generalResultDAO,GeneralResultDTOMapper generalResultDTOMapper) {
        this.generalResultDAO = generalResultDAO;
        this.generalResultDTOMapper=generalResultDTOMapper;
    }
    @Override
    public List<GeneraResultDTO> findAll() {
        List<GeneralResult> generalResults = generalResultDAO.findAll();
        return  generalResults.stream().map(generalResultDTOMapper::entityToDto).collect(Collectors.toList());
    }



    @Override
    public GeneraResultDTO findById(Long cyclistId,Long competitionId) {
        GeneralResultKey generalResultKey = new GeneralResultKey(cyclistId,competitionId);
        return generalResultDTOMapper.entityToDto(generalResultDAO.findOne(generalResultKey));
    }


    @Override
    public void save(GeneralResult result) {
        Competition competition = new Competition();
        Cyclist cyclist = new Cyclist();
        competition.setId(result.getId().getCompetitionId());
        cyclist.setId(result.getId().getCyclistId());
        result.setCyclist(cyclist);
        result.setCompetition(competition);
        generalResultDAO.create(result);

    }

    @Override
    public void delete(Long cyclistId,Long competitionId) {
        GeneralResultKey generalResultKey = new GeneralResultKey(cyclistId,competitionId);
        generalResultDAO.deleteById(generalResultKey);

    }
}
