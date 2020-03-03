package com.ntech.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ntech.dao.AlienDao;
import com.ntech.dto.AlienSaveForm;

@Repository
@Transactional
public class AlienDaoImpl implements AlienDao{

	
	@Autowired
	SessionFactory sessionFactory;

	public void saveAlien(AlienSaveForm as) {
		
		sessionFactory.getCurrentSession().save(as);
	
	}

	public AlienSaveForm checkLogin(String email, String pwd) {
		
		System.out.println("Checking..........");
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(AlienSaveForm.class);
		
		criteria.add(Restrictions.eq("email", email));
		criteria.add(Restrictions.eq("pwd", pwd));
		
		List list = criteria.list();

		if (email !="" && pwd !="" && list != null && list.size() > 0) 
		{
			return (AlienSaveForm) list.get(0);
		}
		return null;
			}

}
