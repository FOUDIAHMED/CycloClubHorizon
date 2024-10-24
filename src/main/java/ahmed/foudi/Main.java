package ahmed.foudi;


import ahmed.foudi.entities.Team;
import ahmed.foudi.service.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Team team=new Team();
        team.setName("Team 1");
        TeamService teamService=xmlContext.getBean(TeamService.class);
        teamService.save(team);
        System.out.println("Hello world!");
    }
}