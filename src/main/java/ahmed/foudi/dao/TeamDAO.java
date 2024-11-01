package ahmed.foudi.dao;

import ahmed.foudi.dao.interfaces.TeamInterface;
import ahmed.foudi.entities.Team;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;


public class TeamDAO extends AbstractHibernateDao<Team,Long> implements TeamInterface {
    public TeamDAO(SessionFactory sessionFactory) {
        super(Team.class ,sessionFactory);
    }

}
