package ahmed.foudi.service;

import ahmed.foudi.dao.CompetitionDAO;
import ahmed.foudi.entities.Competition;
import ahmed.foudi.service.interfaces.CompetitionServiceI;

import java.util.List;

public class CompetitionService implements CompetitionServiceI {

    private final CompetitionDAO competitionDAO;
    public CompetitionService(CompetitionDAO competitionDAO) {

        this.competitionDAO = competitionDAO;
    }





    @Override
    public List<Competition> findAll() {
        return competitionDAO.findAll();
    }

    @Override
    public Competition findById(Long id) {

        return competitionDAO.findOne(id);
    }

    @Override
    public void update(Competition competition) {
        competitionDAO.update(competition);
    }





    @Override
    public void save(Competition competition) {
        competitionDAO.create(competition);

    }

    @Override
    public void delete(Competition team) {
        competitionDAO.delete(team);

    }



    @Override
    public void delete(Long id) {
        competitionDAO.deleteById(id);

    }
}
