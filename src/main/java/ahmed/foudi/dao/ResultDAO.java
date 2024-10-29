package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.ResultInterface;
import ahmed.foudi.entities.Result;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;

public class ResultDAO extends AbstractHibernateDao<Result> implements ResultInterface {
    public ResultDAO(SessionFactory sessionFactory) {
        super(Result.class, sessionFactory);
    }
}
