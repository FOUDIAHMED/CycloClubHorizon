package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.cyclistdto.cyclistDTO;
import ahmed.foudi.dto.cyclistdto.cyclistResponseDTO;
import ahmed.foudi.entities.Cyclist;

import java.util.List;

public interface CyclistServiceI {

    List<cyclistDTO> findAll();
    cyclistResponseDTO findById(Long id);
    void save(Cyclist cyclist);
    void delete(Cyclist cyclist);
    void update(Cyclist cyclist);
    void delete(Long id);
}
