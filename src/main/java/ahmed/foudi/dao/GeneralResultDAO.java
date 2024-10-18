package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.CyclistInterface;
import ahmed.foudi.dao.interfaces.GeneralResultInterface;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.GeneralResult;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralResultDAO extends AbstractHibernateDao<GeneralResult> implements GeneralResultInterface {
    public GeneralResultDAO(SessionFactory sessionFactory) {
        super(GeneralResult.class, sessionFactory);
    }
}
