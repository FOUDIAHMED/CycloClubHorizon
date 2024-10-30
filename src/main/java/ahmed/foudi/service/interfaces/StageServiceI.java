package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.entities.Stage;

import java.util.List;

public interface StageServiceI {
    StageDTO findById(Long id);
    List<StageDTO> findAll();
    void save(Stage stage);
    void delete(Stage stage);
    void update(Stage stage);
    void delete(Long id);
}
