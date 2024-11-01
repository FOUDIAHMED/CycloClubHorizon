package ahmed.foudi.dao;

import ahmed.foudi.dao.interfaces.CompetitionInterface;
import ahmed.foudi.entities.Competition;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;


public class CompetitionDAO extends AbstractHibernateDao<Competition,Long> implements CompetitionInterface {
    private SessionFactory sessionFactory;

    public CompetitionDAO(SessionFactory sessionFactory) {
       super(Competition.class,sessionFactory);
    }


}
