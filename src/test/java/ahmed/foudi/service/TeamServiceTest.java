package ahmed.foudi.service;

import ahmed.foudi.dao.TeamDAO;
import ahmed.foudi.dto.teamdto.TeamResponseDTO;
import ahmed.foudi.entities.Team;
import ahmed.foudi.mappers.TeamDTOMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TeamServiceTest {
    @Mock
    private  TeamDAO teamDAO;
    @Mock
    private TeamDTOMapper teamDTOMapper;
    @InjectMocks
    private TeamService teamService;


    @Test
    public void testFindTeamById() {
        Long teamId = 1L;
        Team team = new Team();
        when(teamDAO.findOne(teamId)).thenReturn(team);
        TeamResponseDTO teamResponseDTO=new TeamResponseDTO();
        when(teamDTOMapper.entityToDto(team)).thenReturn(teamResponseDTO);
        TeamResponseDTO result=teamService.findById(teamId);
        assertNotNull(result);
    }




}