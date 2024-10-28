package ahmed.foudi.service;

import ahmed.foudi.dao.TeamDAO;
import ahmed.foudi.entities.Team;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TeamService implements TeamServiceI {

    private final TeamDAO teamDAO;

    public TeamService(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }




    @Override
    public List<Team> findAll() {
        return teamDAO.findAll();
    }

    @Override
    public Team findById(Long id) {
        return teamDAO.findOne(id);
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
