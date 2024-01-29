package com.hexaware.hiibernate.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.hiibernate.HibernateUtil;
import com.hexaware.hiibernate.entity.Assets;

public class AssetsDao implements IAssetsDao{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
	
	@Override
	public List<Assets> getAllAssets(){
		Query query = session.createNamedQuery("getAllAssets");
		
		List<Assets> list = query.getResultList();
		return list;
	}
	
	@Override
	public Assets getAssetById(int assetId) {
        Query query = session.createNamedQuery("getAssetById");
        query.setParameter("assetId", assetId);

        try {
            return (Assets) query.getSingleResult();
        } catch (Exception e) {
            return null; 
        }
	}
	
	@Override
	public boolean deleteAssetById(int assetId) {
		Query query = session.createNamedQuery("deleteAssetById");
	    query.setParameter("assetId", assetId);

	    try {
	        session.beginTransaction();
	        int deletedCount = query.executeUpdate();
	        session.getTransaction().commit();

	        return deletedCount > 0;
	    } catch (Exception e) {
	        if (session.getTransaction() != null) {
	            session.getTransaction().rollback();
	        }
	        return false;
	    }
	}
	
	

}