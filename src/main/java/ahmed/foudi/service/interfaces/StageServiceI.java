package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.Stage;

import java.util.List;

public interface StageServiceI {
    Stage findById(int id);
    List<Stage> findAll();
    void save(Stage stage);
    void delete(Stage stage);
    void update(Stage stage);
    void delete(int id);
}
