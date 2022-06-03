package emplement;

import java.util.List;

import org.hibernate.Session;


import dao.IDao;
import entity.Computer;
import util.HibernateUtil;

public class ComputerImp implements IDao<Integer, Computer> {
	Session session;
	@Override
	public List<Computer> getAll() {
		   Session session = HibernateUtil.getSession().openSession();
	        try {
	            session.beginTransaction();
	            List computers = session.createQuery("from Computer").list();
	            session.close();
	            return computers;
	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return null;
	        }
	}

	@Override
	public Computer getById(Integer id) {
	     Session session = HibernateUtil.getSession().openSession();
	        try {
	            session.beginTransaction();
	            Computer proFound = (Computer) session.createQuery("from Computer where ComId=:params").setParameter("params",id).uniqueResult();
	            session.close();
	            return proFound;
	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return null;
	        }
	}

	@Override
	public List<Computer> search(String name) {
		  String keywordTranslate = "%" + name + "%";
	        System.out.println("keywordTranslate: " + keywordTranslate);
	        Session session = HibernateUtil.getSession().openSession();
	        try {
	            session.beginTransaction();
	            List<Computer> computerFound = session.createQuery("from Computer where ComName like :params").setParameter("params",keywordTranslate).list();
	            return computerFound;
	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return null;
	        }
	}

	@Override
	public boolean insert(Computer object) {
		 Session session = HibernateUtil.getSession().openSession();
	        try {
	            session.beginTransaction();
	            int check = (Integer) session.save(object);
	            session.getTransaction().commit();
	            session.close();
	            if (check>0)
	                return true;
	            else
	                return false;

	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return false;
	        }
	}

	@Override
	public boolean update(Computer object) {
		  Session session = HibernateUtil.getSession().openSession();
	        try{
	            session.beginTransaction();
	            session.update(object);
	            session.getTransaction().commit();
	            session.close();
	            return true;
	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return false;
	        }
	}

	@Override
	public boolean delete(Integer id) {
		   Session session = HibernateUtil.getSession().openSession();
	        try {
	            session.beginTransaction();
	            int check_delete = session.createQuery("delete Computer where ComId=:params").setParameter("params",id).executeUpdate();
	            session.close();
	            if (check_delete>0)
	                return true;
	            return false;
	        }catch (Exception e){
	            e.printStackTrace();
	            session.getTransaction().rollback();
	            session.close();
	            return false;
	        }
	}

}
