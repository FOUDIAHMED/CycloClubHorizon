package ahmed.foudi.dao;

import ahmed.foudi.dao.interfaces.TeamInterface;
import ahmed.foudi.entities.Team;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeamDAO extends AbstractHibernateDao<Team> implements TeamInterface {
    public TeamDAO(SessionFactory sessionFactory) {
        super(Team.class ,sessionFactory);
    }


}
