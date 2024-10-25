package ahmed.foudi.service;

import ahmed.foudi.dao.CyclistDAO;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.service.interfaces.CyclistServiceI;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CyclistService implements CyclistServiceI {
    private final CyclistDAO cyclistDAO;
    public CyclistService(CyclistDAO cyclistDAO) {
        this.cyclistDAO = cyclistDAO;
    }





    @Override
    public List<Cyclist> findAll() {
        return List.of();
    }

    @Override
    public Cyclist findById(int id) {
        return null;
    }

    @Override
    public Cyclist findById(Long id) {
        return null;
    }

    public void update(Cyclist cyclist) {

    }

    @Override
    @Transactional
    public void save(Cyclist cyclist) {
        cyclistDAO.create(cyclist);

    }

    @Override
    public void delete(Cyclist cyclist) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void delete(Long id) {

    }
}
