package ahmed.foudi.service;

import ahmed.foudi.dao.ResultDAO;
import ahmed.foudi.entities.Result;
import ahmed.foudi.service.interfaces.ResultServiceI;

import java.util.List;

public class ResultService implements ResultServiceI {
    private final ResultDAO resultDAO;
    public ResultService(ResultDAO resultDAO) {
        this.resultDAO = resultDAO;
    }





    @Override
    public List<Result> findAll() {
        return resultDAO.findAll();
    }


    @Override
    public Result findById(Long id) {
        return resultDAO.findOne(id);
    }

    public void update(Result cyclist) {
        resultDAO.update(cyclist);
    }

    @Override
    public void save(Result cyclist) {
        resultDAO.create(cyclist);

    }

    @Override
    public void delete(Result cyclist) {
        resultDAO.delete(cyclist);

    }


    @Override
    public void delete(Long id) {
        resultDAO.deleteById(id);

    }
}
