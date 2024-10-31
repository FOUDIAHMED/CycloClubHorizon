package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.ResultInterface;
import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.entities.embeddable.CyclistStage;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ResultDAO extends AbstractHibernateDao<Result> implements ResultInterface {
    public ResultDAO(SessionFactory sessionFactory) {
        super(Result.class, sessionFactory);
    }


    @Override
    public List<Result> findResultsByStage(Stage stage) {
        try(Session session = getCurrentSession()){
            String query = "FROM Result r WHERE r.stage = :stage";

            return session.createQuery(query, Result.class)
                    .setParameter("stage", stage)
                    .getResultList();
        }
    }

    public Result findOne(CyclistStage id) {
        try (Session session = getCurrentSession()) {
            return session.get(Result.class, id);
        }
    }

    public void delete(CyclistStage id) {
        try (Session session = getCurrentSession()) {
            Result result = session.get(Result.class, id);
            if (result != null) {
                session.remove(result);
            }
        }
    }
}
