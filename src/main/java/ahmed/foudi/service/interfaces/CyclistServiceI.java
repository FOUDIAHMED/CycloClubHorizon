package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.Cyclist;

import java.util.List;

public interface CyclistServiceI {

    public List<Cyclist> findAll();
    public Cyclist findById(int id);

    Cyclist findById(Long id);

    public void save(Cyclist cyclist);
    public void delete(Cyclist cyclist);
    public  void delete(long id);

    void delete(Long id);
}
