package ahmed.foudi.service;

import ahmed.foudi.dao.TeamDAO;
import ahmed.foudi.entities.Team;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeamService implements TeamServiceI {

    private final TeamDAO teamDAO;

    public TeamService(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }




    @Override
    public List<Team> findAll() {
        return List.of();
    }

    @Override
    public Team findById(Long id) {
        return null;
    }

    public void update(Team team) {

    }

    @Override
    @Transactional
    public void save(Team team) {
        teamDAO.create(team);

    }

    @Override
    public void delete(Team team) {

    }

    @Override
    public void delete(Long id) {

    }
}
