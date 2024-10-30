package ahmed.foudi.service;

import ahmed.foudi.dao.CompetitionDAO;
import ahmed.foudi.dto.competitiondto.CompetitionDTO;
import ahmed.foudi.entities.Competition;
import ahmed.foudi.mappers.CompetitionDTOMapper;
import ahmed.foudi.service.interfaces.CompetitionServiceI;

import java.util.List;
import java.util.stream.Collectors;

public class CompetitionService implements CompetitionServiceI {

    private final CompetitionDAO competitionDAO;
    private final CompetitionDTOMapper competitionDTOMapper;
    public CompetitionService(CompetitionDAO competitionDAO,CompetitionDTOMapper competitionDTOMapper) {
        this.competitionDTOMapper = competitionDTOMapper;

        this.competitionDAO = competitionDAO;
    }





    @Override
    public List<CompetitionDTO> findAll() {
        List<Competition> competitions = competitionDAO.findAll();
        return competitions.stream().map(competitionDTOMapper::entityToDto).collect(Collectors.toList());

    }

    @Override
    public CompetitionDTO findById(Long id) {
        return competitionDTOMapper.entityToDto(competitionDAO.findOne(id));

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
