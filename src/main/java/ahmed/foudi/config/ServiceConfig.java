package ahmed.foudi.config;


import ahmed.foudi.dao.*;
import ahmed.foudi.mappers.*;
import ahmed.foudi.service.*;
import ahmed.foudi.service.interfaces.*;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {
    @Bean
    public TeamServiceI teamService(TeamDAO teamDAO, TeamDTOMapper teamDTOMapper) {
        return new TeamService(teamDAO, teamDTOMapper);
    }

    @Bean
    public CyclistServiceI cyclistService(CyclistDAO cyclistDAO, CyclistResponseDTOMapper teamDTOMapper, CyclistDTOMapper cyclistDTOMapper) {
        return new CyclistService(cyclistDAO, teamDTOMapper, cyclistDTOMapper);
    }

    @Bean
    public CompetitionServiceI competitionService(CompetitionDAO competitionDAO, CompetitionDTOMapper competitionDTOMapper) {
        return new CompetitionService(competitionDAO, competitionDTOMapper);
    }

    @Bean
    public StageServiceI stageService(StageDAO stageDAO, StageDTOMapper stageDTOMapper) {
        return new StageService(stageDAO,stageDTOMapper);
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
