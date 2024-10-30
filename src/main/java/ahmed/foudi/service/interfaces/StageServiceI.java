package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.stagedto.StageDTO;
import ahmed.foudi.dto.stagedto.StageDTOResponse;
import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import ahmed.foudi.entities.Stage;

import java.util.List;

public interface StageServiceI {
    StageDTOResponse findById(Long id);
    List<StageDTO> findAll();
    void save(Stage stage);
    void delete(Stage stage);
    void update(Stage stage);
    void delete(Long id);
}
