package ahmed.foudi.service;

import ahmed.foudi.dao.GeneralResultDAO;
import ahmed.foudi.entities.GeneralResult;
import ahmed.foudi.service.interfaces.GeneralResultServiceI;

import java.util.List;

public class GeneralResultService implements GeneralResultServiceI {
    private final GeneralResultDAO generalResultDAO;
    public GeneralResultService(GeneralResultDAO generalResultDAO) {
        this.generalResultDAO = generalResultDAO;
    }
    @Override
    public List<GeneralResult> findAll() {
        return generalResultDAO.findAll();
    }

    @Override
    public void update(GeneralResult result) {
        generalResultDAO.update(result);

    }

    @Override
    public GeneralResult findById(Long id) {
        return generalResultDAO.findOne(id);
    }

    @Override
    public void delete(GeneralResult result) {
        generalResultDAO.delete(result);

    }

    @Override
    public void save(GeneralResult result) {
        generalResultDAO.create(result);

    }

    @Override
    public void delete(Long id) {
        generalResultDAO.deleteById(id);

    }
}
