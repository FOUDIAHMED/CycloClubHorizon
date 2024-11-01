package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.StageInterface;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


public class StageDAO extends AbstractHibernateDao<Stage,Long> implements StageInterface {
    public StageDAO(SessionFactory sessionFactory) {
        super(Stage.class, sessionFactory);
    }
}
