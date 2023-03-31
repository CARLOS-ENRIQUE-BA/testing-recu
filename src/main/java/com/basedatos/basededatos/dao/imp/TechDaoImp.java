package com.basedatos.basededatos.dao.imp;


import com.basedatos.basededatos.dao.Tech_Dao;
import com.basedatos.basededatos.models.TechModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@Transactional
@CrossOrigin

public class TechDaoImp implements Tech_Dao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<TechModel> getCAll(){
        String hql = "FROM TechModel as u";
        return (List<TechModel>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public TechModel getC( long id){
        return entityManager.find(TechModel.class, id);

    }
    @Transactional
    @Override
    public TechModel registerC( TechModel techModel){
        entityManager.merge(techModel);
        return techModel;
    }
    @Transactional
    @Override
    public TechModel updateC(TechModel techModel){
        entityManager.merge(techModel);
        return techModel;
    }
    @Transactional
    @Override
    public void deleteC(long id){
        TechModel techModel = getC(id);
        entityManager.remove(techModel);
    }


}
