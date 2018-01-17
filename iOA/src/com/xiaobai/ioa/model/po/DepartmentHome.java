package com.xiaobai.ioa.model.po;
// Generated 2018-1-17 10:26:58 by Hibernate Tools 5.2.6.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Example;

import com.xiaobai.ioa.util.HibernateSessionUtil;

/**
 * Home object for domain model class Department.
 * 
 * @see hibernate.Department
 * @author Hibernate Tools
 */
public class DepartmentHome
{

	private static final Log log = LogFactory.getLog(DepartmentHome.class);

	//private final SessionFactory sessionFactory = getSessionFactory();
	private SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();
	

//	protected SessionFactory getSessionFactory2()
//	{
//		// A SessionFactory is set up once for an application!
//		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().
//				configure("/hibernate/hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
//				.build();
//		SessionFactory factory = null;
//		try {
//			
//			 
//			  factory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
//		}
//		catch (Exception e) {
//			// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//			// so destroy it manually.
//			StandardServiceRegistryBuilder.destroy( registry );
//		}
//		
//		return factory;
//	}

	protected SessionFactory getSessionFactory()
	{
		try
		{
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e)
		{
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Department transientInstance)
	{
		log.debug("persisting Department instance");
		try
		{
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Department instance)
	{
		log.debug("attaching dirty Department instance");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Department instance)
	{
		log.debug("attaching clean Department instance");
		try
		{
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Department persistentInstance)
	{
		log.debug("deleting Department instance");
		try
		{
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public Department merge(Department detachedInstance)
	{
		log.debug("merging Department instance");
		try
		{
			Department result = (Department) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Department findById(long id)
	{
		log.debug("getting Department instance with id: " + id);
		try
		{
			 Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			Department instance = (Department) session.get("com.xiaobai.ioa.model.po.Department", id);			
			transaction.commit();
			
			//Department instance = (Department) sessionFactory.getCurrentSession()
			//		.get("com.xiaobai.ioa.model.po.Department", id);
			if (instance == null)
			{
				log.debug("get successful, no instance found");
			} else
			{
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Department instance)
	{
		log.debug("finding Department instance by example");
		try
		{
			List results = sessionFactory.getCurrentSession().createCriteria("hibernate.Department")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
