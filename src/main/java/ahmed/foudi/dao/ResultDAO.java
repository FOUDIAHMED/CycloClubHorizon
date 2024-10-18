package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.CyclistInterface;
import ahmed.foudi.dao.interfaces.ResultInterface;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.entities.Result;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class ResultDAO extends AbstractHibernateDao<Result> implements ResultInterface {
    public ResultDAO(Class<Result> entityClass, SessionFactory sessionFactory) {
        super(entityClass, sessionFactory);
    }
}
