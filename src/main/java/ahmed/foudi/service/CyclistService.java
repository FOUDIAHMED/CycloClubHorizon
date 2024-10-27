package ahmed.foudi.service;

import ahmed.foudi.dao.CyclistDAO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.service.interfaces.CyclistServiceI;

import java.util.List;

public class CyclistService implements CyclistServiceI {
    private final CyclistDAO cyclistDAO;
    public CyclistService(CyclistDAO cyclistDAO) {
        this.cyclistDAO = cyclistDAO;
    }





    @Override
    public List<Cyclist> findAll() {
        return cyclistDAO.findAll();
    }


    @Override
    public Cyclist findById(Long id) {
        return cyclistDAO.findOne(id);
    }

    public void update(Cyclist cyclist) {
        cyclistDAO.update(cyclist);
    }

    @Override
    public void save(Cyclist cyclist) {
        cyclistDAO.create(cyclist);

    }

    @Override
    public void delete(Cyclist cyclist) {
        cyclistDAO.delete(cyclist);

    }


    @Override
    public void delete(Long id) {
        cyclistDAO.deleteById(id);

    }
}
