package ahmed.foudi.config;


import ahmed.foudi.dao.CompetitionDAO;
import ahmed.foudi.dao.CyclistDAO;
import ahmed.foudi.dao.TeamDAO;
import ahmed.foudi.service.CompetitionService;
import ahmed.foudi.service.CyclistService;
import ahmed.foudi.service.TeamService;
import ahmed.foudi.service.interfaces.CompetitionServiceI;
import ahmed.foudi.service.interfaces.CyclistServiceI;
import ahmed.foudi.service.interfaces.TeamServiceI;
import org.springframework.context.annotation.Bean;

public class ServiceConfig {
    @Bean
    public TeamServiceI teamService(TeamDAO teamDAO) {
        return new TeamService(teamDAO);
    }

    @Bean
    public CyclistServiceI cyclistService(CyclistDAO cyclistDAO) {
        return new CyclistService(cyclistDAO);
    }

    @Bean
    public CompetitionServiceI competitionService(CompetitionDAO competitionDAO) {
        return new CompetitionService(competitionDAO);
    }

}
