package ahmed.foudi.service.interfaces;

import ahmed.foudi.entities.Team;

import java.util.List;

public interface TeamServiceI {
    public List<Team> findAll();
    public Team findById(Long id);
    public void save(Team team);
    public void update(Team team);
    public void delete(Team team);
    public void delete(Long id);
}
