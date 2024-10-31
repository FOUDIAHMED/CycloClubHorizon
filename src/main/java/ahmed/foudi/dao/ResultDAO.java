package ahmed.foudi.dao;


import ahmed.foudi.dao.interfaces.ResultInterface;
import ahmed.foudi.entities.Result;
import ahmed.foudi.entities.Stage;
import ahmed.foudi.entities.embeddable.CyclistStage;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ResultDAO extends AbstractHibernateDao<Result> implements ResultInterface {
    private final SessionFactory sessionFactory;
    public ResultDAO(SessionFactory sessionFactory) {

        super(Result.class, sessionFactory);
        this.sessionFactory = sessionFactory;
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
        Session session = sessionFactory.openSession();
        try {
            return session.get(Result.class, id);
        } finally {
            session.close();
        }
    }


    public void delete(CyclistStage id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            Result result = session.get(Result.class, id);
            if (result != null) {
                session.remove(result);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

}
