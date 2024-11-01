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
public class ResultDAO extends AbstractHibernateDao<Result,CyclistStage> implements ResultInterface {
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


}
