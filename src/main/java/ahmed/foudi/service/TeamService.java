package ahmed.foudi.service;

import ahmed.foudi.dao.TeamDAO;
import ahmed.foudi.dto.teamdto.TeamDTO;
import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import ahmed.foudi.entities.Team;
import ahmed.foudi.mappers.CyclistDTOMapper;
import ahmed.foudi.mappers.TeamDTOMapper;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class TeamService implements TeamServiceI {

    private final TeamDAO teamDAO;
    private final TeamDTOMapper teamDTOMapper;
    private final CyclistDTOMapper cyclistDTOMapper;

    public TeamService(TeamDAO teamDAO, TeamDTOMapper teamDTOMapper, CyclistDTOMapper cyclistDTOMapper) {
        this.teamDAO = teamDAO;
        this.teamDTOMapper = teamDTOMapper;
        this.cyclistDTOMapper = cyclistDTOMapper;
    }




    @Override
    public List<TeamResponseDTO> findAll() {
        List<Team> teams=teamDAO.findAll();

        return teams.stream()
                .map(teamDTOMapper::entityToDto) // Assuming convertToDto is the mapping function
                .collect(Collectors.toList());
    }

    @Override
    public TeamResponseDTO findById(Long id) {
        Team team=teamDAO.findOne(id);
        TeamResponseDTO teamResponseDTO=teamDTOMapper.entityToDto(team);
        return teamResponseDTO;


        //return teamDAO.findOne(id);
    }

    public void update(Team team) {
        teamDAO.update(team);
    }

    @Override
    public void save(Team team) {
        teamDAO.create(team);

    }

    @Override
    public void delete(Team team) {
        teamDAO.delete(team);

    }

    @Override
    public void delete(Long id) {
        teamDAO.deleteById(id);

    }
}
