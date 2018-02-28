package com.shiva.backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shiva.backend.dao.ProductDAO;
import com.shiva.backend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> listActiveProducts() {
		String selectAcitveProducts = "FROM Product Where active = :active";
	
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectAcitveProducts, Product.class)
						.setParameter("active", true)
							.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int catergoryId) {
		String selectAcitveProductsByCategory = "FROM Product Where active = :active And categoryId = :categoryId";
		
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectAcitveProductsByCategory, Product.class)
						.setParameter("active", true)
							.setParameter("categoryId", catergoryId)
								.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
	String selectActiveCategory = "FROM Product Where active = :active ORDER by id";
		
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveCategory, Product.class)
						.setParameter("active", true)
							.setFirstResult(0)
								.setMaxResults(5)
									.getResultList();
	}

}
