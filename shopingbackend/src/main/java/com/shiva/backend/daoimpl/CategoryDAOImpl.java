package com.shiva.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shiva.backend.dao.CategoryDAO;
import com.shiva.backend.dto.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Category> list() {
		String selectActiveCategory = "From Category where active=:active";
		Query<Category> query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);		
		return query.getResultList();
	}

	
	//catogoryList
	@Override
	public Category get(int id) {
	
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		try {
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	//updating single category
	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(Category category) {
		
		category.setActive(true);
		try {
			sessionFactory.getCurrentSession().update(category);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
