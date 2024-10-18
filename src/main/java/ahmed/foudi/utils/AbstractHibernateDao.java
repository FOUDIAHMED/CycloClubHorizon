package ahmed.foudi.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;

import java.util.List;

public abstract class AbstractHibernateDao<T> {
    private final SessionFactory sessionFactory;

    private final Class<T> entityClass;

    public AbstractHibernateDao(Class<T> entityClass, SessionFactory sessionFactory) {
        this.entityClass = entityClass;
        this.sessionFactory = sessionFactory;
    }

    public T findOne(final long id) {
        return (T) getCurrentSession().get(entityClass, id);
    }

    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + entityClass.getName(), entityClass).list();
    }

    public T create(final T entity) {
        Preconditions.checkNotNull(entity, "entity");
        getCurrentSession().persist(entity);
        return entity;
    }

    public T update(final T entity) {
        Preconditions.checkNotNull(entity, "entity");
        return (T) getCurrentSession().merge(entity);
    }

    public void delete(final T entity) {
        Preconditions.checkNotNull(entity, "entity");
        getCurrentSession().remove(entity);
    }

    public void deleteById(final long entityId) {
        final T entity = findOne(entityId);
        delete(entity);
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}
