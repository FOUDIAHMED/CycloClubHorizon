package ahmed.foudi.service.interfaces;

import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import ahmed.foudi.entities.Team;

import java.util.List;

public interface TeamServiceI {
    List<TeamResponseDTO> findAll();
    TeamResponseDTO findById(Long id);
    void save(Team team);
    void update(Team team);
    void delete(Team team);
    void delete(Long id);
}
