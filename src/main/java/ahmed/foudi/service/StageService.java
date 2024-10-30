package ahmed.foudi.service;

import ahmed.foudi.dao.StageDAO;
import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.mappers.StageDTOMapper;
import ahmed.foudi.service.interfaces.StageServiceI;

import java.util.List;
import java.util.stream.Collectors;

public class StageService implements StageServiceI {
    private final StageDAO stageDAO;
    private final StageDTOMapper stageDTOMapper;
    public StageService(StageDAO stageDAO,StageDTOMapper stageDTOMapper) {
        this.stageDAO = stageDAO;
        this.stageDTOMapper = stageDTOMapper;
    }
    @Override
    public StageDTO findById(Long id) {
        return stageDTOMapper.entityToDto(stageDAO.findOne(id));
    }

    @Override
    public List<StageDTO> findAll() {
        List<Stage> stages = stageDAO.findAll();
        return stages.stream().map(stageDTOMapper::entityToDto).collect(Collectors.toList());
    }

    @Override
    public void save(Stage stage) {
        stageDAO.create(stage);

    }

    @Override
    public void delete(Stage stage) {
        stageDAO.delete(stage);
    }

    @Override
    public void update(Stage stage) {
        stageDAO.update(stage);

    }

    @Override
    public void delete(Long id) {
        stageDAO.deleteById(id);

    }
}
