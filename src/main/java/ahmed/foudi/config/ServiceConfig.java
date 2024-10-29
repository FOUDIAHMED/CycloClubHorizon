package ahmed.foudi.config;


import ahmed.foudi.dao.*;
import ahmed.foudi.mappers.CyclistDTOMapper;
import ahmed.foudi.mappers.TeamDTOMapper;
import ahmed.foudi.service.*;
import ahmed.foudi.service.interfaces.*;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {
    @Bean
    public TeamServiceI teamService(TeamDAO teamDAO, TeamDTOMapper teamDTOMapper, CyclistDTOMapper cyclistDTOMapper) {
        return new TeamService(teamDAO, teamDTOMapper, cyclistDTOMapper);
    }

    @Bean
    public CyclistServiceI cyclistService(CyclistDAO cyclistDAO) {
        return new CyclistService(cyclistDAO);
    }

    @Bean
    public CompetitionServiceI competitionService(CompetitionDAO competitionDAO) {
        return new CompetitionService(competitionDAO);
    }

    @Bean
    public StageServiceI stageService(StageDAO stageDAO) {
        return new StageService(stageDAO);
    }

    @Bean
    public GeneralResultServiceI generalresultService(GeneralResultDAO generalResultDao) {
        return new GeneralResultService(generalResultDao);
    }

    @Bean
    public ResultServiceI resultService(ResultDAO ResultDao) {
        return new ResultService(ResultDao);
    }

}
