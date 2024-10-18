package ahmed.foudi.dao;

import ahmed.foudi.dao.interfaces.CyclistInterface;
import ahmed.foudi.entities.Cyclist;
import ahmed.foudi.utils.AbstractHibernateDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;



public class CyclistDAO  extends AbstractHibernateDao<Cyclist>  implements CyclistInterface {


    public CyclistDAO(SessionFactory sessionFactory) {
        super(Cyclist.class, sessionFactory);
    }


}
