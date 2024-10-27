package ahmed.foudi.service;

import ahmed.foudi.dao.StageDAO;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.service.interfaces.StageServiceI;

import java.util.List;

public class StageService implements StageServiceI {
    private final StageDAO stageDAO;
    public StageService(StageDAO stageDAO) {
        this.stageDAO = stageDAO;
    }
    @Override
    public Stage findById(Long id) {
        return stageDAO.findOne(id);
    }

    @Override
    public List<Stage> findAll() {
        return stageDAO.findAll();
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
